package pl.dawidfiruzek.dagger2android.ui.main

import pl.dawidfiruzek.dagger2android.ui.BaseContract
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragmentContract

interface MainActivityContract {

    interface View : BaseContract.View

    interface Router : BaseContract.Router, MainFragmentContract.Router

    interface Presenter : BaseContract.Presenter
}
