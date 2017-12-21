package pl.dawidfiruzek.dagger2android.navigation.main

import pl.dawidfiruzek.dagger2android.navigation.BaseActivityRouter
import pl.dawidfiruzek.dagger2android.ui.main.MainActivity
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivity

class MainActivityRouter(activity: MainActivity) : BaseActivityRouter(activity), MainActivityContract.Router {

    override fun navigateToSecondScreen() {
        startActivity(SecondActivity::class)
    }
}
