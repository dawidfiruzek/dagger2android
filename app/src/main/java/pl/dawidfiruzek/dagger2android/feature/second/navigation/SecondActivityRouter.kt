package pl.dawidfiruzek.dagger2android.feature.second.navigation

import android.content.Intent
import pl.dawidfiruzek.dagger2android.extensions.startActivity
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainActivity
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract
import pl.dawidfiruzek.dagger2android.feature.second.ui.SecondActivity

class SecondActivityRouter(
        private val activity: SecondActivity
) : SecondActivityContract.Router {

    override fun navigateToMainScreen() {
        activity.startActivity(
                MainActivity::class,
                listOf(
                        Intent.FLAG_ACTIVITY_NEW_TASK,
                        Intent.FLAG_ACTIVITY_CLEAR_TASK
                )
        )
    }
}
