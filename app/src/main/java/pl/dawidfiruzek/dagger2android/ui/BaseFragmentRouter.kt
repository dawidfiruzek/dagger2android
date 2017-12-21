package pl.dawidfiruzek.dagger2android.ui

import org.greenrobot.eventbus.EventBus

abstract class BaseFragmentRouter(protected val eventBus: EventBus) : BaseContract.Router
