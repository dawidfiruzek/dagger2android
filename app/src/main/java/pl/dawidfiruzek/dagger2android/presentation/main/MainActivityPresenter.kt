package pl.dawidfiruzek.dagger2android.presentation.main

import pl.dawidfiruzek.dagger2android.presentation.BasePresenter
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityContract.View
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityContract.Router

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
