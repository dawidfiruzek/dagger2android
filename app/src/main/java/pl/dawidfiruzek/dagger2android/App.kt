package pl.dawidfiruzek.dagger2android

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import pl.dawidfiruzek.dagger2android.util.injection.DaggerAppComponent
import javax.inject.Inject

class App : Application(), HasActivityInjector {

    @Inject lateinit var activityDispatchingAndroidInjector:
            DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> =
            activityDispatchingAndroidInjector
}
