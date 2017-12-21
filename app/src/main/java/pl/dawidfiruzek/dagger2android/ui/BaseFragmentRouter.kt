package pl.dawidfiruzek.dagger2android.ui

import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.data.BaseNavigationEvent

abstract class BaseFragmentRouter(protected val eventBus: EventBus) : BaseContract.Router {

    override fun navigateBack() {
        eventBus.post(BaseNavigationEvent.NAVIGATE_BACK)
    }
}
