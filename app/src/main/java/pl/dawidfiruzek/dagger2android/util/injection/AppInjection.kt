package pl.dawidfiruzek.dagger2android.util.injection

import android.app.Application
import android.content.Context
import android.content.res.Resources
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector
import pl.dawidfiruzek.dagger2android.App
import pl.dawidfiruzek.dagger2android.ui.BaseActivity
import pl.dawidfiruzek.dagger2android.ui.BaseFragment
import pl.dawidfiruzek.dagger2android.ui.main.MainActivity
import pl.dawidfiruzek.dagger2android.ui.main.MainFragment
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivity
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    fun context(application: Application): Context =
            application

    @Provides
    fun resources(context: Context): Resources =
            context.resources
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
    abstract fun activity(activity: BaseActivity): BaseActivity

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [SecondActivityModule::class])
    abstract fun bindSecondActivity(): SecondActivity
}

@Module
abstract class FragmentBuilderModule {

    @Binds
    abstract fun fragment(fragment: BaseFragment): BaseFragment

    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun mainFragment(): MainFragment
}
