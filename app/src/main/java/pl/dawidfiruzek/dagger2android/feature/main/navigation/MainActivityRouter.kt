package pl.dawidfiruzek.dagger2android.feature.main.navigation

import pl.dawidfiruzek.dagger2android.extensions.startActivity
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainActivity
import pl.dawidfiruzek.dagger2android.feature.second.ui.SecondActivity

class MainActivityRouter(
        private val activity: MainActivity
) : MainActivityContract.Router {

    override fun navigateToSecondScreen() {
        activity.startActivity(SecondActivity::class)
    }
}
