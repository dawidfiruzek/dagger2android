package pl.dawidfiruzek.dagger2android.ui.main.fragment

import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent

class MainFragmentRouter(private val eventBus: EventBus) : MainFragmentContract.Router {

    override fun navigateToSecondScreen() {
        eventBus.post(MainNavigationEvent())
    }
}
