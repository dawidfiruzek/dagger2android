package pl.dawidfiruzek.dagger2android.feature.second.navigation

import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.data.SecondNavigationEvent
import pl.dawidfiruzek.dagger2android.feature.common.navigation.BaseEventHelper
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract.Router

class SecondActivityEventHelper(
        router: Router
) : BaseEventHelper<Router>(router) {

    override fun handleEvent(event: NavigationEvent) {
        super.handleEvent(event)
        when (event) {
            SecondNavigationEvent.NAVIGATE_TO_MAIN -> router.navigateToMainScreen()
        }
    }
}
