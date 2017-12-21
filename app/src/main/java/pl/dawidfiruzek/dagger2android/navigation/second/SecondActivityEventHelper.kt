package pl.dawidfiruzek.dagger2android.navigation.second

import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.data.SecondNavigationEvent
import pl.dawidfiruzek.dagger2android.navigation.BaseEventHelper
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivityContract.Router

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
