package pl.dawidfiruzek.dagger2android.feature.second.navigation

import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.data.SecondNavigationEvent
import pl.dawidfiruzek.dagger2android.feature.common.navigation.BaseFragmentRouter
import pl.dawidfiruzek.dagger2android.feature.second.SecondFragmentContract

class SecondFragmentRouter(
        eventBus: EventBus
) : BaseFragmentRouter(eventBus), SecondFragmentContract.Router {

    override fun navigateToMainScreen() {
        eventBus.post(SecondNavigationEvent.NAVIGATE_TO_MAIN)
    }
}
