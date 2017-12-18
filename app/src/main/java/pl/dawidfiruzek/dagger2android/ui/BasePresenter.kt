package pl.dawidfiruzek.dagger2android.ui

abstract class BasePresenter<out V : BaseContract.View, out R : BaseContract.Router>(
        protected val view: V,
        protected val router: R
) : BaseContract.Presenter
