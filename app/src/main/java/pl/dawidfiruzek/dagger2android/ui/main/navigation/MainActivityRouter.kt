package pl.dawidfiruzek.dagger2android.ui.main.navigation

import pl.dawidfiruzek.dagger2android.ui.BaseActivityRouter
import pl.dawidfiruzek.dagger2android.ui.main.MainActivity
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivity

class MainActivityRouter(
        activity: MainActivity
) : BaseActivityRouter(activity), MainActivityContract.Router {

    override fun navigateToSecondScreen() {
        startActivity(SecondActivity::class)
    }
}
