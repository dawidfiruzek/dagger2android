package pl.dawidfiruzek.dagger2android.util.injection

import android.support.v4.app.FragmentManager
import dagger.Module
import dagger.Provides
import pl.dawidfiruzek.dagger2android.ui.main.MainActivity
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityEventHelper
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityPresenter
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityRouter
import pl.dawidfiruzek.dagger2android.util.tools.EventHelper

@Module
class MainActivityModule {

    @Provides
    fun view(activity: MainActivity): MainActivityContract.View = activity

    @Provides
    fun router(activity: MainActivity): MainActivityContract.Router =
            MainActivityRouter(activity)

    @Provides
    fun presenter(view: MainActivityContract.View, router: MainActivityContract.Router): MainActivityContract.Presenter =
            MainActivityPresenter(view, router)

    @Provides
    fun eventHelper(router: MainActivityContract.Router): EventHelper =
            MainActivityEventHelper(router)

    @Provides
    fun fm(activity: MainActivity): FragmentManager = activity.supportFragmentManager
}
