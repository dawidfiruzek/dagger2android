package pl.dawidfiruzek.dagger2android.feature.splash.presentation

import android.util.Log
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import pl.dawidfiruzek.dagger2android.feature.splash.SplashActivityContract
import java.util.concurrent.TimeUnit

class SplashActivityPresenter(
        private val view: SplashActivityContract.View,
        private val router: SplashActivityContract.Router,
        private val compositeDisposable: CompositeDisposable
) : SplashActivityContract.Presenter {

    override fun initialize() {
        val disposable = Single.just(false)
                .delay(1500, TimeUnit.MILLISECONDS)
                .subscribe({
                    router.navigateToMain()
                }, {
                    Log.e("sdfsdf", "sdfsdf")
                })

        compositeDisposable.add(disposable)
    }

    override fun clear() {
        compositeDisposable.clear()
    }
}
