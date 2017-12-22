package pl.dawidfiruzek.dagger2android.feature.main.navigation

import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.util.tools.EventHelper

class MainActivityEventHelper(
        private val presenter: MainActivityContract.Presenter
) : EventHelper {

    override fun handleEvent(event: NavigationEvent) {
        when (event) {
            MainNavigationEvent.NAVIGATE_TO_SECOND -> presenter.eventNavigateToSecond()
        }
    }
}
