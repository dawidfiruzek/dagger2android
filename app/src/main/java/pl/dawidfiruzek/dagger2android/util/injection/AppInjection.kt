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
import pl.dawidfiruzek.dagger2android.MainActivity
import javax.inject.Singleton

@Module
class AppModule(private val context: Context) {

    @Provides
    fun context(): Context =
            context
}

@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
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
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun bindMainActivity(): MainActivity
}

@Module
class MainActivityModule {
}
