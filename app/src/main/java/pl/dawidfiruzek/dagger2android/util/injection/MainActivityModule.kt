package pl.dawidfiruzek.dagger2android.util.injection

import dagger.Module
import dagger.Provides
import pl.dawidfiruzek.dagger2android.ui.main.MainActivity
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.navigation.main.MainActivityEventHelper
import pl.dawidfiruzek.dagger2android.presentation.main.MainActivityPresenter
import pl.dawidfiruzek.dagger2android.navigation.main.MainActivityRouter
import pl.dawidfiruzek.dagger2android.navigation.EventHelper

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
}
