package pl.dawidfiruzek.dagger2android.ui.main

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.util.Log
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.ui.BaseActivity
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragment
import pl.dawidfiruzek.dagger2android.ui.second.SecondActivity
import javax.inject.Inject

class MainActivity : BaseActivity<MainActivityContract.Presenter>(), MainActivityContract.View, MainActivityContract.Router {

    @Inject
    lateinit var fm: FragmentManager

    override val layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        eventBus.register(this)
        fm.beginTransaction().replace(R.id.main_root, MainFragment()).commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        eventBus.unregister(this)
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun navigationEvent(event: NavigationEvent) {
        Log.e("BUS", "Navigation majfrend")
        startActivity(Intent(this, SecondActivity::class.java))
    }
}
