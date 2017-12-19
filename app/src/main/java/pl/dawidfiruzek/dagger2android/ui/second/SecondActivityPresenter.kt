package pl.dawidfiruzek.dagger2android.ui.second

import pl.dawidfiruzek.dagger2android.ui.BasePresenter

class SecondActivityPresenter(
        view: SecondActivityContract.View,
        router: SecondActivityContract.Router
) : BasePresenter<SecondActivityContract.View, SecondActivityContract.Router>(
        view,
        router
), SecondActivityContract.Presenter
