package pl.dawidfiruzek.dagger2android.ui.main

import android.content.res.Resources
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.util.Log
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.ui.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var res: Resources

    @Inject
    lateinit var fm: FragmentManager

    override val layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("Test injection", fm.toString())
        Log.e("Test injection", res.toString())

        fm.beginTransaction().replace(R.id.main_root, MainFragment()).commit()
    }
}
