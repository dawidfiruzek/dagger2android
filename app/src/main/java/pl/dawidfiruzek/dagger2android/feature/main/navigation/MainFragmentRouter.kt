package pl.dawidfiruzek.dagger2android.feature.main.navigation

import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.feature.common.navigation.BaseFragmentRouter
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract

class MainFragmentRouter(
        eventBus: EventBus
) : BaseFragmentRouter(eventBus), MainFragmentContract.Router {

    override fun navigateToSecondScreen() {
        eventBus.post(MainNavigationEvent.NAVIGATE_TO_SECOND)
    }
}
