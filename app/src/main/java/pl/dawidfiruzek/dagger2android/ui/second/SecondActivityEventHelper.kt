package pl.dawidfiruzek.dagger2android.ui.second

import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.data.SecondNavigationEvent
import pl.dawidfiruzek.dagger2android.util.tools.EventHelper

class SecondActivityEventHelper(private val router: SecondActivityContract.Router) : EventHelper {

    override fun handleEvent(event: NavigationEvent) {
        when (event) {
            SecondNavigationEvent.NAVIGATE_TO_MAIN -> router.navigateToMainScreen()
        }
    }
}
