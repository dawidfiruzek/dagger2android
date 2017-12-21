package pl.dawidfiruzek.dagger2android.feature.main.presentation

import pl.dawidfiruzek.dagger2android.feature.common.presentation.BasePresenter
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract.Router
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract.View

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
