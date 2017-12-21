package pl.dawidfiruzek.dagger2android.navigation.main

import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.navigation.BaseFragmentRouter
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragmentContract

class MainFragmentRouter(
        eventBus: EventBus
) : BaseFragmentRouter(eventBus), MainFragmentContract.Router {

    override fun navigateToSecondScreen() {
        eventBus.post(MainNavigationEvent.NAVIGATE_TO_SECOND)
    }
}
