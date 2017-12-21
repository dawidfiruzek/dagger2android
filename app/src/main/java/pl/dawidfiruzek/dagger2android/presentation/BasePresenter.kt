package pl.dawidfiruzek.dagger2android.presentation

import android.support.annotation.CallSuper
import pl.dawidfiruzek.dagger2android.ui.BaseContract

abstract class BasePresenter<out V : BaseContract.View, out R : BaseContract.Router>(
        protected val view: V,
        protected val router: R
) : BaseContract.Presenter {

    @CallSuper
    override fun initialize() = Unit

    @CallSuper
    override fun clear() = Unit
}
