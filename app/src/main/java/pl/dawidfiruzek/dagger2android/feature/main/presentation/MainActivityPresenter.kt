package pl.dawidfiruzek.dagger2android.feature.main.presentation

import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract.Router
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract.View

class MainActivityPresenter(
        private val view: View,
        private val router: Router
) : MainActivityContract.Presenter {

    override fun initialize() {
        view.showMainScreen()
    }

    override fun clear() = Unit

    override fun eventNavigateToSecond() {
        router.navigateToSecondScreen()
    }
}
