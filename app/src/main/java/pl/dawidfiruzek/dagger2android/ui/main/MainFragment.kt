package pl.dawidfiruzek.dagger2android.ui.main

import android.util.Log
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.data.ExampleInjectedClass
import pl.dawidfiruzek.dagger2android.ui.BaseFragment
import javax.inject.Inject

class MainFragment : BaseFragment() {

    @Inject
    lateinit var eic: ExampleInjectedClass

    override val layoutId: Int = R.layout.fragment_main

    override fun onResume() {
        super.onResume()

        Log.e("Test injection", eic.id.toString())
    }
}
