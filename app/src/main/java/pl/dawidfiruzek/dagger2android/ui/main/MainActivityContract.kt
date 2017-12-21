package pl.dawidfiruzek.dagger2android.ui.main

import pl.dawidfiruzek.dagger2android.ui.common.BaseContract
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragmentContract

interface MainActivityContract {

    interface View : BaseContract.View {
        fun showMainScreen()
    }

    interface Router : BaseContract.Router, MainFragmentContract.Router

    interface Presenter : BaseContract.Presenter
}
