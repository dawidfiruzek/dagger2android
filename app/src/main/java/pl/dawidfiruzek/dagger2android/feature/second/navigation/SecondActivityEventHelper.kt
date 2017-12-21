package pl.dawidfiruzek.dagger2android.feature.second.navigation

import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.data.SecondNavigationEvent
import pl.dawidfiruzek.dagger2android.util.tools.EventHelper
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract.Router

class SecondActivityEventHelper(
        private val router: Router
) : EventHelper {

    override fun handleEvent(event: NavigationEvent) {
        when (event) {
            SecondNavigationEvent.NAVIGATE_TO_MAIN -> router.navigateToMainScreen()
        }
    }
}
