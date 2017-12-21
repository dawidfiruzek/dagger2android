package pl.dawidfiruzek.dagger2android.feature.second.navigation

import android.content.Intent
import pl.dawidfiruzek.dagger2android.feature.common.navigation.BaseActivityRouter
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainActivity
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract
import pl.dawidfiruzek.dagger2android.feature.second.ui.SecondActivity

class SecondActivityRouter(
        activity: SecondActivity
) : BaseActivityRouter(activity), SecondActivityContract.Router {

    override fun navigateToMainScreen() {
        startActivity(MainActivity::class, listOf(
                Intent.FLAG_ACTIVITY_NEW_TASK,
                Intent.FLAG_ACTIVITY_CLEAR_TASK
        ))
    }
}
