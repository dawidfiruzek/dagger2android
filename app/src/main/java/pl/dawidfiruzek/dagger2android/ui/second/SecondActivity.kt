package pl.dawidfiruzek.dagger2android.ui.second

import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.ui.BaseActivity

class SecondActivity : BaseActivity<SecondActivityContract.Presenter>(), SecondActivityContract.View {

    override val layoutId: Int = R.layout.activity_main
}
