package pl.dawidfiruzek.dagger2android.ui.second

import pl.dawidfiruzek.dagger2android.ui.BasePresenter

class SecondActivityPresenter(
        view: SecondActivityContract.View,
        router: SecondActivityContract.Router
) : BasePresenter<SecondActivityContract.View, SecondActivityContract.Router>(
        view,
        router
), SecondActivityContract.Presenter {

    override fun start() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stop() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
