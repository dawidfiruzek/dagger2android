package pl.dawidfiruzek.dagger2android.ui.main

import pl.dawidfiruzek.dagger2android.ui.BaseContract

interface MainActivityContract {

    interface View : BaseContract.View

    interface Router : BaseContract.Router

    interface Presenter : BaseContract.Presenter
}
