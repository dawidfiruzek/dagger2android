package pl.dawidfiruzek.dagger2android.util.injection

import dagger.Module
import dagger.Provides
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivity
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivityContract
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivityPresenter

@Module
class SecondActivityModule {

    @Provides
    fun view(activity: SecondActivity): SecondActivityContract.View = activity

    @Provides
    fun router(activity: SecondActivity): SecondActivityContract.Router = activity

    @Provides
    fun presenter(view: SecondActivityContract.View, router: SecondActivityContract.Router): SecondActivityContract.Presenter =
            SecondActivityPresenter(view, router)
}
