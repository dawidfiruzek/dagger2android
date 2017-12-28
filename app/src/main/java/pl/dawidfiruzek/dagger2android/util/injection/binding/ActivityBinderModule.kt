package pl.dawidfiruzek.dagger2android.util.injection.binding

import android.support.v7.app.AppCompatActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainActivity
import pl.dawidfiruzek.dagger2android.feature.second.ui.SecondActivity
import pl.dawidfiruzek.dagger2android.feature.splash.ui.SplashActivity
import pl.dawidfiruzek.dagger2android.util.injection.MainActivityModule
import pl.dawidfiruzek.dagger2android.util.injection.RuntimeScope
import pl.dawidfiruzek.dagger2android.util.injection.SecondActivityModule
import pl.dawidfiruzek.dagger2android.util.injection.SplashActivityModule

@Module
abstract class ActivityBinderModule {

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
