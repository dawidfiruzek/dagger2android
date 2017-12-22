package pl.dawidfiruzek.dagger2android.feature.second

import pl.dawidfiruzek.dagger2android.feature.common.BaseContract

interface SecondActivityContract {

    interface View {
        fun showSecondScreen()
    }

    interface Router : SecondFragmentContract.Router

    interface Presenter : BaseContract.Presenter {
        fun eventNavigateToMain()
    }
}
