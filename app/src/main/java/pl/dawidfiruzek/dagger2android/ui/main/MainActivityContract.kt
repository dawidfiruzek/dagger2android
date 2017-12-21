package pl.dawidfiruzek.dagger2android.ui.main

import pl.dawidfiruzek.dagger2android.ui.BaseContract

interface MainActivityContract {

    interface View : BaseContract.View

    interface Router : BaseContract.Router {
        fun navigateToSecond()
    }

    interface Presenter : BaseContract.Presenter
}
