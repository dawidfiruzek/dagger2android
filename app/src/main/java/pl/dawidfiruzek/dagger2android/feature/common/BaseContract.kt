package pl.dawidfiruzek.dagger2android.feature.common

interface BaseContract {

    interface Presenter {
        fun initialize()
        fun clear()
    }
}
