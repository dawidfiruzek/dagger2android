package pl.dawidfiruzek.dagger2android.ui.main

import pl.dawidfiruzek.dagger2android.ui.BasePresenter

class MainActivityPresenter(
        view: MainActivityContract.View,
        router: MainActivityContract.Router
) : BasePresenter<MainActivityContract.View, MainActivityContract.Router>(
        view,
        router
), MainActivityContract.Presenter {

    override fun viewCreated() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun viewDestroyed() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}