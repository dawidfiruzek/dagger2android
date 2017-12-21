package pl.dawidfiruzek.dagger2android.ui.second

import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.data.SecondNavigationEvent
import pl.dawidfiruzek.dagger2android.ui.BaseEventHelper

class SecondActivityEventHelper(
        router: SecondActivityContract.Router
) : BaseEventHelper<SecondActivityContract.Router>(router) {

    override fun handleEvent(event: NavigationEvent) {
        super.handleEvent(event)
        when (event) {
            SecondNavigationEvent.NAVIGATE_TO_MAIN -> router.navigateToMainScreen()
        }
    }
}
