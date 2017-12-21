package pl.dawidfiruzek.dagger2android.feature.main.presentation

import pl.dawidfiruzek.dagger2android.feature.common.presentation.BasePresenter
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract.View
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract.Router

class MainActivityPresenter(
        view: View,
        router: Router
) : BasePresenter<View, Router>(
        view,
        router
), MainActivityContract.Presenter {

    override fun initialize() {
        super.initialize()
        view.showMainScreen()
    }
}
