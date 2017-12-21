package pl.dawidfiruzek.dagger2android.feature.second.presentation

import pl.dawidfiruzek.dagger2android.feature.common.presentation.BasePresenter
import pl.dawidfiruzek.dagger2android.feature.second.SecondFragmentContract
import pl.dawidfiruzek.dagger2android.feature.second.SecondFragmentContract.View
import pl.dawidfiruzek.dagger2android.feature.second.SecondFragmentContract.Router

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
