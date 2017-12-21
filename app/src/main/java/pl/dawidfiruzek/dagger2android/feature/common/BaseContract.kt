package pl.dawidfiruzek.dagger2android.feature.common

interface BaseContract {

    interface View

    interface Router {
        fun finish()
    }

    interface Presenter {
        fun initialize()
        fun clear()
    }
}