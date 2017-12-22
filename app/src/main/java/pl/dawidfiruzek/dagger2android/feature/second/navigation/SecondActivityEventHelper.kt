package pl.dawidfiruzek.dagger2android.feature.second.navigation

import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.data.SecondNavigationEvent
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract
import pl.dawidfiruzek.dagger2android.util.tools.EventHelper

class SecondActivityEventHelper(
        private val presenter: SecondActivityContract.Presenter
) : EventHelper {

    override fun handleEvent(event: NavigationEvent) {
        when (event) {
            SecondNavigationEvent.NAVIGATE_TO_MAIN -> presenter.eventNavigateToMain()
        }
    }
}
