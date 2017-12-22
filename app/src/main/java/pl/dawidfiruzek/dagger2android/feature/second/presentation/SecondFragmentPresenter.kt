package pl.dawidfiruzek.dagger2android.feature.second.presentation

import pl.dawidfiruzek.dagger2android.feature.second.SecondFragmentContract
import pl.dawidfiruzek.dagger2android.feature.second.SecondFragmentContract.Router
import pl.dawidfiruzek.dagger2android.feature.second.SecondFragmentContract.View

class SecondFragmentPresenter(
        private val view: View,
        private val router: Router
) : SecondFragmentContract.Presenter {

    override fun initialize() = Unit

    override fun clear() = Unit

    override fun navigateClicked() {
        router.navigateToMainScreen()
    }
}
