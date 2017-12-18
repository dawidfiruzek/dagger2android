package pl.dawidfiruzek.dagger2android.ui

interface BaseContract {

    interface View

    interface Router

    interface Presenter {
        fun viewCreated()
        fun viewDestroyed()
    }
}