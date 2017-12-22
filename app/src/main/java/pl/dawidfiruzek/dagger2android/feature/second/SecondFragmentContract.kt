package pl.dawidfiruzek.dagger2android.feature.second

import pl.dawidfiruzek.dagger2android.feature.common.BaseContract

interface SecondFragmentContract {

    interface View

    interface Router {
        fun navigateToMainScreen()
    }

    interface Presenter : BaseContract.Presenter {
        fun navigateClicked()
    }
}
