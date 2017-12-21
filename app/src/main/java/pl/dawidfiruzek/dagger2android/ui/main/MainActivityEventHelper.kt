package pl.dawidfiruzek.dagger2android.ui.main

import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.util.tools.EventHelper

class MainActivityEventHelper(private val router: MainActivityContract.Router) : EventHelper {

    override fun handleEvent(event: NavigationEvent) {
        when(event) {
            MainNavigationEvent.NAVIGATE_TO_SECOND -> router.navigateToSecond()
        }
    }
}
