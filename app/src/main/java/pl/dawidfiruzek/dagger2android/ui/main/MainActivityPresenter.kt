package pl.dawidfiruzek.dagger2android.ui.main

import pl.dawidfiruzek.dagger2android.ui.BasePresenter

class MainActivityPresenter(
        view: MainActivityContract.View,
        router: MainActivityContract.Router
) : BasePresenter<MainActivityContract.View, MainActivityContract.Router>(
        view,
        router
), MainActivityContract.Presenter {

    override fun start() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stop() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}