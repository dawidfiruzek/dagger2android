package pl.dawidfiruzek.dagger2android.ui.main.navigation

import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.ui.common.navigation.BaseEventHelper
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityContract.Router

class MainActivityEventHelper(
        router: Router
) : BaseEventHelper<Router>(router) {

    override fun handleEvent(event: NavigationEvent) {
        super.handleEvent(event)
        when (event) {
            MainNavigationEvent.NAVIGATE_TO_SECOND -> router.navigateToSecondScreen()
        }
    }
}
