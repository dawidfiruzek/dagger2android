package pl.dawidfiruzek.dagger2android.util.injection

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import pl.dawidfiruzek.dagger2android.feature.splash.SplashActivityContract
import pl.dawidfiruzek.dagger2android.feature.splash.navigation.SplashActivityRouter
import pl.dawidfiruzek.dagger2android.feature.splash.presentation.SplashActivityPresenter
import pl.dawidfiruzek.dagger2android.feature.splash.ui.SplashActivity

@Module
class SplashActivityModule {

    @Provides
    fun view(activity: SplashActivity): SplashActivityContract.View =
            activity

    @Provides
    fun router(activity: SplashActivity): SplashActivityContract.Router =
            SplashActivityRouter(activity)

    @Provides
    fun presenter(
            view: SplashActivityContract.View,
            router: SplashActivityContract.Router,
            compositeDisposable: CompositeDisposable
    ): SplashActivityContract.Presenter =
            SplashActivityPresenter(view, router, compositeDisposable)
}
