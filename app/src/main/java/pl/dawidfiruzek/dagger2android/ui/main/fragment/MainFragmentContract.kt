package pl.dawidfiruzek.dagger2android.ui.main.fragment

import pl.dawidfiruzek.dagger2android.ui.BaseContract

interface MainFragmentContract {

    interface View : BaseContract.View

    interface Router : BaseContract.Router

    interface Presenter : BaseContract.Presenter {
        fun navigateClicked()
    }
}
