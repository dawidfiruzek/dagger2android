package pl.dawidfiruzek.dagger2android.ui.main

import android.os.Bundle
import android.support.v4.app.FragmentManager
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.ui.BaseActivity
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragment
import javax.inject.Inject

class MainActivity : BaseActivity<MainActivityContract.Presenter>(), MainActivityContract.View, MainActivityContract.Router {

    @Inject
    lateinit var fm: FragmentManager

    override val layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fm.beginTransaction().replace(R.id.main_root, MainFragment()).commit()
    }
}
