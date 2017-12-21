package pl.dawidfiruzek.dagger2android.ui

interface BaseContract {

    interface View

    interface Router {
        fun navigateBack()
    }

    interface Presenter {
        fun initialize()
        fun clear()
        fun onBackPressed()
    }
}
