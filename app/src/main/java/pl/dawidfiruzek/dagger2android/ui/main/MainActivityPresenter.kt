package pl.dawidfiruzek.dagger2android.ui.main

import pl.dawidfiruzek.dagger2android.ui.BasePresenter

class MainActivityPresenter(
        view: MainActivityContract.View,
        router: MainActivityContract.Router
) : BasePresenter<MainActivityContract.View, MainActivityContract.Router>(
        view,
        router
), MainActivityContract.Presenter {

    override fun initialize() {
        super.initialize()
        view.showMainScreen()
    }
}
