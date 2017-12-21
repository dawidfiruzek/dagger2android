package pl.dawidfiruzek.dagger2android.feature.common.navigation

import android.support.annotation.CallSuper
import pl.dawidfiruzek.dagger2android.data.BaseNavigationEvent
import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.feature.common.BaseContract

abstract class BaseEventHelper<out R : BaseContract.Router>(protected val router: R) : EventHelper {

    @CallSuper
    override fun handleEvent(event: NavigationEvent) {
        when (event) {
            BaseNavigationEvent.FINISH -> {
                router.finish()
                return
            }
        }
    }
}
