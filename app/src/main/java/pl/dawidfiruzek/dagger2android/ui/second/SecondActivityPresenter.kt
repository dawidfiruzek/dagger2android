package pl.dawidfiruzek.dagger2android.ui.second

import pl.dawidfiruzek.dagger2android.ui.BasePresenter
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivityContract.View
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivityContract.Router

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
