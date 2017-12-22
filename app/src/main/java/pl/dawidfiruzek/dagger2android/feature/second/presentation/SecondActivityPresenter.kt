package pl.dawidfiruzek.dagger2android.feature.second.presentation

import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract.Router
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract.View

class SecondActivityPresenter(
        private val view: View,
        private val router: Router
) :  SecondActivityContract.Presenter {

    override fun initialize() {
        view.showSecondScreen()
    }

    override fun clear() = Unit
}
