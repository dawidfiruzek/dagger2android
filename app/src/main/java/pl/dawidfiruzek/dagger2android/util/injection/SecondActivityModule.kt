package pl.dawidfiruzek.dagger2android.util.injection

import dagger.Module
import dagger.Provides
import pl.dawidfiruzek.dagger2android.feature.second.ui.SecondActivity
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract
import pl.dawidfiruzek.dagger2android.feature.second.navigation.SecondActivityEventHelper
import pl.dawidfiruzek.dagger2android.feature.second.presentation.SecondActivityPresenter
import pl.dawidfiruzek.dagger2android.feature.second.navigation.SecondActivityRouter
import pl.dawidfiruzek.dagger2android.feature.common.navigation.EventHelper

@Module
class SecondActivityModule {

    @Provides
    fun view(activity: SecondActivity): SecondActivityContract.View = activity

    @Provides
    fun router(activity: SecondActivity): SecondActivityContract.Router =
            SecondActivityRouter(activity)

    @Provides
    fun eventHelper(router: SecondActivityContract.Router): EventHelper =
            SecondActivityEventHelper(router)

    @Provides
    fun presenter(view: SecondActivityContract.View, router: SecondActivityContract.Router): SecondActivityContract.Presenter =
            SecondActivityPresenter(view, router)
}
