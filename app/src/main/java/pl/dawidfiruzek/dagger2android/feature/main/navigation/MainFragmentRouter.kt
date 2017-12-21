package pl.dawidfiruzek.dagger2android.feature.main.navigation

import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract

class MainFragmentRouter(
        private val eventBus: EventBus
) : MainFragmentContract.Router {

    override fun navigateToSecondScreen() {
        eventBus.post(MainNavigationEvent.NAVIGATE_TO_SECOND)
    }
}
