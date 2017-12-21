package pl.dawidfiruzek.dagger2android.ui.main.fragment

import pl.dawidfiruzek.dagger2android.ui.BasePresenter
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragmentContract
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragmentContract.View
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragmentContract.Router

class MainFragmentPresenter(
        view: View,
        router: Router
) : BasePresenter<View, Router>(
        view,
        router
), MainFragmentContract.Presenter {

    override fun navigateClicked() {
        router.navigateToSecondScreen()
    }
}
