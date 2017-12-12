package pl.dawidfiruzek.dagger2android.util.injection

import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector
import pl.dawidfiruzek.dagger2android.App
import pl.dawidfiruzek.dagger2android.ui.main.MainActivity
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivity
import javax.inject.Singleton

@Module
class AppModule(private val application: Application) {

    @Provides
    fun context(): Context =
            application
}

@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilderModule::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(app: Application): Builder
        fun appModule(appModule: AppModule): Builder
        fun build(): AppComponent
    }

    fun inject(app: App)
}

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [(SecondActivityModule::class)])
    abstract fun bindSecondActivity(): SecondActivity
}
