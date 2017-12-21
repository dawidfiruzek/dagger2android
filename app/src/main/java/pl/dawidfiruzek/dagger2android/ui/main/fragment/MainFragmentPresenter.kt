package pl.dawidfiruzek.dagger2android.ui.main.fragment

import pl.dawidfiruzek.dagger2android.ui.BasePresenter

class MainFragmentPresenter(
        view: MainFragmentContract.View,
        router: MainFragmentContract.Router
) : BasePresenter<MainFragmentContract.View, MainFragmentContract.Router>(
        view,
        router
), MainFragmentContract.Presenter {

    override fun navigateClicked() {
        router.navigateToSecondScreen()
    }
}
