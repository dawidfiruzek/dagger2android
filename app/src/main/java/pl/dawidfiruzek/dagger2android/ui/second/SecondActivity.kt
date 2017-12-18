package pl.dawidfiruzek.dagger2android.ui.second

import android.content.res.Resources
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.ui.BaseActivity
import javax.inject.Inject

class SecondActivity : BaseActivity() {

    @Inject
    lateinit var res: Resources

    override val layoutId: Int = R.layout.activity_main
}
