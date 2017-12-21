package pl.dawidfiruzek.dagger2android.ui.main.fragment

import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.ui.BaseFragmentRouter

class MainFragmentRouter(eventBus: EventBus) : BaseFragmentRouter(eventBus), MainFragmentContract.Router {

    override fun navigateToSecondScreen() {
        eventBus.post(MainNavigationEvent())
    }
}
