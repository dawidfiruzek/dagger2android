package pl.dawidfiruzek.dagger2android.feature.splash.navigation

import android.content.Intent
import pl.dawidfiruzek.dagger2android.extensions.startActivity
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainActivity
import pl.dawidfiruzek.dagger2android.feature.splash.SplashActivityContract
import pl.dawidfiruzek.dagger2android.feature.splash.ui.SplashActivity

class SplashActivityRouter(
        private val activity: SplashActivity
) : SplashActivityContract.Router {

    override fun navigateToMain() {
        activity.startActivity(
                MainActivity::class,
                listOf(
                        Intent.FLAG_ACTIVITY_NEW_TASK,
                        Intent.FLAG_ACTIVITY_CLEAR_TASK
                )
        )
    }
}
