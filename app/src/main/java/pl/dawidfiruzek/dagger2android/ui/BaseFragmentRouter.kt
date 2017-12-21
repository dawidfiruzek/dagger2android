package pl.dawidfiruzek.dagger2android.ui

import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.data.BaseNavigationEvent
import pl.dawidfiruzek.dagger2android.ui.BaseContract

abstract class BaseFragmentRouter(protected val eventBus: EventBus) : BaseContract.Router {

    override fun finish() {
        eventBus.post(BaseNavigationEvent.FINISH)
    }
}
