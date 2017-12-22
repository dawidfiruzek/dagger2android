package pl.dawidfiruzek.dagger2android.util.injection

import android.app.Application
import android.content.Context
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector
import io.reactivex.disposables.CompositeDisposable
import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.App
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainActivity
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainFragment
import pl.dawidfiruzek.dagger2android.feature.second.ui.SecondActivity
import pl.dawidfiruzek.dagger2android.feature.second.ui.SecondFragment
import pl.dawidfiruzek.dagger2android.feature.splash.ui.SplashActivity
import javax.inject.Scope
import javax.inject.Singleton

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class RuntimeScope

@Module
class AppModule {

    @Provides
    fun context(application: Application): Context =
            application

    @Provides
    fun eventBus(): EventBus =
            EventBus.getDefault()

    @Provides
    fun compositeDisposable(): CompositeDisposable =
            CompositeDisposable()
}

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ActivityBuilderModule::class,
    FragmentBuilderModule::class,
    AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: App)
}

@Module
abstract class ActivityBuilderModule {

    @Binds
    abstract fun activity(activity: AppCompatActivity): AppCompatActivity

    @RuntimeScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity

    @RuntimeScope
    @ContributesAndroidInjector(modules = [SecondActivityModule::class])
    abstract fun bindSecondActivity(): SecondActivity

    @ContributesAndroidInjector(modules = [SplashActivityModule::class])
    abstract fun bindSplashActivity(): SplashActivity
}

@Module
abstract class FragmentBuilderModule {

    @Binds
    abstract fun fragment(fragment: Fragment): Fragment

    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun mainFragment(): MainFragment

    @ContributesAndroidInjector(modules = [SecondFragmentModule::class])
    abstract fun secondFragment(): SecondFragment
}
