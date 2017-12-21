package pl.dawidfiruzek.dagger2android.util.injection

import dagger.Module
import dagger.Provides
import pl.dawidfiruzek.dagger2android.feature.common.navigation.EventHelper
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.feature.main.navigation.MainActivityEventHelper
import pl.dawidfiruzek.dagger2android.feature.main.navigation.MainActivityRouter
import pl.dawidfiruzek.dagger2android.feature.main.presentation.MainActivityPresenter
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainActivity

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
