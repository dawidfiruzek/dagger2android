package pl.dawidfiruzek.dagger2android.ui.second

import pl.dawidfiruzek.dagger2android.ui.common.BaseContract
import pl.dawidfiruzek.dagger2android.ui.second.fragment.SecondFragmentContract

interface SecondActivityContract {

    interface View : BaseContract.View {
        fun showSecondScreen()
    }

    interface Router : BaseContract.Router, SecondFragmentContract.Router

    interface Presenter : BaseContract.Presenter
}
