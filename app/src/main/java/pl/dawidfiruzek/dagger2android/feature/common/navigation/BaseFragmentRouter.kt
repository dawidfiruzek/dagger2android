package pl.dawidfiruzek.dagger2android.feature.common.navigation

import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.data.BaseNavigationEvent
import pl.dawidfiruzek.dagger2android.feature.common.BaseContract

abstract class BaseFragmentRouter(protected val eventBus: EventBus) : BaseContract.Router {

    override fun finish() {
        eventBus.post(BaseNavigationEvent.FINISH)
    }
}
