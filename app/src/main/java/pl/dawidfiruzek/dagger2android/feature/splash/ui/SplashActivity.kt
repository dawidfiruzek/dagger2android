package pl.dawidfiruzek.dagger2android.feature.splash.ui

import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.feature.common.ui.BaseActivity
import pl.dawidfiruzek.dagger2android.feature.splash.SplashActivityContract

class SplashActivity : BaseActivity<SplashActivityContract.Presenter>(), SplashActivityContract.View {

    override val layoutId: Int = R.layout.activity_splash
}
