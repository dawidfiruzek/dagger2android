package pl.dawidfiruzek.dagger2android.feature.main.presentation

import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract.Router

class MainFragmentPresenter(
        private val router: Router
) : MainFragmentContract.Presenter {

    override fun initialize() = Unit

    override fun clear() = Unit

    override fun navigateClicked() {
        router.navigateToSecondScreen()
    }
}
