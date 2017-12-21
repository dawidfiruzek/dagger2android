package pl.dawidfiruzek.dagger2android.ui.second.fragment

import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.data.SecondNavigationEvent
import pl.dawidfiruzek.dagger2android.ui.BaseFragmentRouter
import pl.dawidfiruzek.dagger2android.ui.second.fragment.SecondFragmentContract

class SecondFragmentRouter(
        eventBus: EventBus
) : BaseFragmentRouter(eventBus), SecondFragmentContract.Router {

    override fun navigateToMainScreen() {
        eventBus.post(SecondNavigationEvent.NAVIGATE_TO_MAIN)
    }
}
