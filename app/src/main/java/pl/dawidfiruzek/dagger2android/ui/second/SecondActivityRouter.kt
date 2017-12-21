package pl.dawidfiruzek.dagger2android.ui.second

import android.content.Intent
import pl.dawidfiruzek.dagger2android.ui.BaseActivityRouter
import pl.dawidfiruzek.dagger2android.ui.main.MainActivity

class SecondActivityRouter(activity: SecondActivity) : BaseActivityRouter(activity), SecondActivityContract.Router {

    override fun navigateToMainScreen() {
        startActivity(MainActivity::class, listOf(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TASK))
    }
}
