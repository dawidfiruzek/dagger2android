package pl.dawidfiruzek.dagger2android.ui.main

import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.ui.BaseEventHelper

class MainActivityEventHelper(
        router: MainActivityContract.Router
) : BaseEventHelper<MainActivityContract.Router>(router) {

    override fun handleEvent(event: NavigationEvent) {
        super.handleEvent(event)
        when (event) {
            MainNavigationEvent.NAVIGATE_TO_SECOND -> router.navigateToSecondScreen()
        }
    }
}
