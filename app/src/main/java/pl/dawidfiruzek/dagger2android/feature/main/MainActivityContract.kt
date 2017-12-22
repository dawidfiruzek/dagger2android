package pl.dawidfiruzek.dagger2android.feature.main

import pl.dawidfiruzek.dagger2android.feature.common.BaseContract

interface MainActivityContract {

    interface View : BaseContract.View {
        fun showMainScreen()
    }

    interface Router : BaseContract.Router, MainFragmentContract.Router

    interface Presenter : BaseContract.Presenter {
        fun eventNavigateToSecond()
    }
}
