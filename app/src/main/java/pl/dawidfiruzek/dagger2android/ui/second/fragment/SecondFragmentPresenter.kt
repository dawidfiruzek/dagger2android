package pl.dawidfiruzek.dagger2android.ui.second.fragment

import pl.dawidfiruzek.dagger2android.ui.BasePresenter
import pl.dawidfiruzek.dagger2android.ui.second.fragment.SecondFragmentContract
import pl.dawidfiruzek.dagger2android.ui.second.fragment.SecondFragmentContract.View
import pl.dawidfiruzek.dagger2android.ui.second.fragment.SecondFragmentContract.Router

class SecondFragmentPresenter(
        view: View,
        router: Router
) : BasePresenter<View, Router>(
        view,
        router
), SecondFragmentContract.Presenter {

    override fun navigateClicked() {
        router.navigateToMainScreen()
    }
}
