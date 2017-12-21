package pl.dawidfiruzek.dagger2android.feature.common.presentation

import android.support.annotation.CallSuper
import pl.dawidfiruzek.dagger2android.feature.common.BaseContract

abstract class BasePresenter<out V : BaseContract.View, out R : BaseContract.Router>(
        protected val view: V,
        protected val router: R
) : BaseContract.Presenter {

    @CallSuper
    override fun initialize() = Unit

    @CallSuper
    override fun clear() = Unit
}
