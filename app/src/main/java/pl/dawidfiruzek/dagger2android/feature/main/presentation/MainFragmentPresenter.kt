package pl.dawidfiruzek.dagger2android.feature.main.presentation

import android.util.Log
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract.Router
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract.View

class MainFragmentPresenter(
        private val view: View,
        private val router: Router
) : MainFragmentContract.Presenter {

    init {
        Log.e("Main Fragment Presenter", this.toString())
    }

    override fun initialize() = Unit

    override fun clear() = Unit

    override fun navigateClicked() {
        router.navigateToSecondScreen()
    }
}
