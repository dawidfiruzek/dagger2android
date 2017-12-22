package pl.dawidfiruzek.dagger2android.feature.main

import pl.dawidfiruzek.dagger2android.feature.common.BaseContract

interface MainActivityContract {

    interface View {
        fun showMainScreen()
    }

    interface Router : MainFragmentContract.Router

    interface Presenter : BaseContract.Presenter {
        fun eventNavigateToSecond()
    }
}
