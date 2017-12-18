package pl.dawidfiruzek.dagger2android.ui.main.fragment

import pl.dawidfiruzek.dagger2android.ui.BasePresenter
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityContract

class MainFragmentPresenter(
        view: MainFragmentContract.View,
        router: MainFragmentContract.Router
) : BasePresenter<MainFragmentContract.View, MainFragmentContract.Router>(
        view,
        router
), MainFragmentContract.Presenter {

    override fun viewCreated() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun viewDestroyed() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
