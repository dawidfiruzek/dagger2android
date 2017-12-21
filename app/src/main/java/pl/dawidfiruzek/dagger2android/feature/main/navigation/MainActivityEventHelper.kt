package pl.dawidfiruzek.dagger2android.feature.main.navigation

import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.feature.common.navigation.EventHelper
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract.Router

class MainActivityEventHelper(
        private val router: Router
) : EventHelper {

    override fun handleEvent(event: NavigationEvent) {
        when (event) {
            MainNavigationEvent.NAVIGATE_TO_SECOND -> router.navigateToSecondScreen()
        }
    }
}
