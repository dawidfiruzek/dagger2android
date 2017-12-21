package pl.dawidfiruzek.dagger2android.feature.second.presentation

import pl.dawidfiruzek.dagger2android.feature.common.presentation.BasePresenter
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract.View
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract.Router

class SecondActivityPresenter(
        view: View,
        router: Router
) : BasePresenter<View, Router>(
        view,
        router
), SecondActivityContract.Presenter {

    override fun initialize() {
        super.initialize()
        view.showSecondScreen()
    }
}
