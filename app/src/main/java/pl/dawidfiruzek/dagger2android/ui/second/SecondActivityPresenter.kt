package pl.dawidfiruzek.dagger2android.ui.second

import pl.dawidfiruzek.dagger2android.ui.BasePresenter

class SecondActivityPresenter(
        view: SecondActivityContract.View,
        router: SecondActivityContract.Router
) : BasePresenter<SecondActivityContract.View, SecondActivityContract.Router>(
        view,
        router
), SecondActivityContract.Presenter {

    override fun viewCreated() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun viewDestroyed() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
