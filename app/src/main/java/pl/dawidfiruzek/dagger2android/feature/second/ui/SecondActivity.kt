package pl.dawidfiruzek.dagger2android.feature.second.ui

import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.feature.common.ui.BaseActivity
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract

class SecondActivity : BaseActivity<SecondActivityContract.Presenter>(), SecondActivityContract.View {

    override val layoutId: Int = R.layout.activity_main

    override fun showSecondScreen() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.root, SecondFragment())
                .commit()
    }
}
