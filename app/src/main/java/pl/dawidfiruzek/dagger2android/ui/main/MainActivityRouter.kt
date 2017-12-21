package pl.dawidfiruzek.dagger2android.ui.main

import pl.dawidfiruzek.dagger2android.ui.BaseActivityRouter
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivity

class MainActivityRouter(activity: MainActivity) : BaseActivityRouter(activity), MainActivityContract.Router {

    override fun navigateToSecond() {
        startActivity(SecondActivity::class)
    }
}
