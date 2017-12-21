package pl.dawidfiruzek.dagger2android.feature.main.navigation

import pl.dawidfiruzek.dagger2android.feature.common.navigation.BaseActivityRouter
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainActivity
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.feature.second.ui.SecondActivity

class MainActivityRouter(
        activity: MainActivity
) : BaseActivityRouter(activity), MainActivityContract.Router {

    override fun navigateToSecondScreen() {
        startActivity(SecondActivity::class)
    }
}
