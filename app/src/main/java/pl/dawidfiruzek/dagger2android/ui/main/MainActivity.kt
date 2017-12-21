package pl.dawidfiruzek.dagger2android.ui.main

import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.ui.BaseActivity
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragment

class MainActivity : BaseActivity<MainActivityContract.Presenter>(), MainActivityContract.View {

    override val layoutId: Int = R.layout.activity_main

    //region View
    override fun showMainScreen() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.root, MainFragment())
                .commit()
    }
    //endregion
}
