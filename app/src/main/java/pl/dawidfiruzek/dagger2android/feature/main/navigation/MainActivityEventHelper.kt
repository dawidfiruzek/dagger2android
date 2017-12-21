package pl.dawidfiruzek.dagger2android.feature.main.navigation

import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.feature.common.navigation.BaseEventHelper
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract.Router

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
