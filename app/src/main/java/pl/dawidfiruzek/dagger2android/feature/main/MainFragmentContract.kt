package pl.dawidfiruzek.dagger2android.feature.main

import pl.dawidfiruzek.dagger2android.feature.common.BaseContract

interface MainFragmentContract {

    interface Router {
        fun navigateToSecondScreen()
    }

    interface Presenter : BaseContract.Presenter {
        fun navigateClicked()
    }
}
