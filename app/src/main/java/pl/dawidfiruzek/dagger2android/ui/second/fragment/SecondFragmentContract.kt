package pl.dawidfiruzek.dagger2android.ui.second.fragment

import pl.dawidfiruzek.dagger2android.ui.common.BaseContract

interface SecondFragmentContract {

    interface View : BaseContract.View

    interface Router : BaseContract.Router {
        fun navigateToMainScreen()
    }

    interface Presenter : BaseContract.Presenter {
        fun navigateClicked()
    }
}
