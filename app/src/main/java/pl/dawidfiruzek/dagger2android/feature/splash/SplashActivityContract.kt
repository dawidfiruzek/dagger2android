package pl.dawidfiruzek.dagger2android.feature.splash

import pl.dawidfiruzek.dagger2android.feature.common.BaseContract

interface SplashActivityContract {

    interface View : BaseContract.View

    interface Router : BaseContract.Router {
        fun navigateToMain()
    }

    interface Presenter : BaseContract.Presenter
}
