package pl.dawidfiruzek.dagger2android.util.injection

import android.support.v4.app.FragmentManager
import dagger.Module
import dagger.Provides
import pl.dawidfiruzek.dagger2android.ui.main.MainActivity
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityPresenter
import pl.dawidfiruzek.dagger2android.ui.main.MainActivityRouter

@Module
class MainActivityModule {

    @Provides
    fun view(activity: MainActivity): MainActivityContract.View = activity

    @Provides
    fun router(activity: MainActivity): MainActivityContract.Router =
            MainActivityRouter(activity)

    @Provides
    fun presenter(view: MainActivityContract.View, router: MainActivityContract.Router): MainActivityContract.Presenter =
            MainActivityPresenter(view, router)

    @Provides
    fun fm(activity: MainActivity): FragmentManager = activity.supportFragmentManager
}
