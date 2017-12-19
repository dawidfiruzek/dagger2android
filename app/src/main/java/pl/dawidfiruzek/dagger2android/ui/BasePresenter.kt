package pl.dawidfiruzek.dagger2android.ui

import android.support.annotation.CallSuper

abstract class BasePresenter<out V : BaseContract.View, out R : BaseContract.Router>(
        protected val view: V,
        protected val router: R
) : BaseContract.Presenter {

    @CallSuper
    override fun start() = Unit

    @CallSuper
    override fun stop() = Unit
}
