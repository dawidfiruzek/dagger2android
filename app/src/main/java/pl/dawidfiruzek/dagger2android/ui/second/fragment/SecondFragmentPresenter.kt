package pl.dawidfiruzek.dagger2android.ui.second.fragment

import pl.dawidfiruzek.dagger2android.ui.BasePresenter

class SecondFragmentPresenter(
        view: SecondFragmentContract.View,
        router: SecondFragmentContract.Router
) : BasePresenter<SecondFragmentContract.View, SecondFragmentContract.Router>(
        view,
        router
), SecondFragmentContract.Presenter {

    override fun navigateClicked() {
        router.navigateToMainScreen()
    }
}
