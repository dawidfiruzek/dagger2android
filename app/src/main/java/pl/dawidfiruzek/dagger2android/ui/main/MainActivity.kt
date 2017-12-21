package pl.dawidfiruzek.dagger2android.ui.main

import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import pl.dawidfiruzek.dagger2android.ui.BaseActivity
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragment
import pl.dawidfiruzek.dagger2android.util.tools.EventHelper
import javax.inject.Inject

class MainActivity : BaseActivity<MainActivityContract.Presenter>(), MainActivityContract.View {

    @Inject
    lateinit var eventHelper: EventHelper

    override val layoutId: Int = R.layout.activity_main

    override fun onStart() {
        super.onStart()
        eventBus.register(this)
    }

    override fun onStop() {
        super.onStop()
        eventBus.unregister(this)
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun navigationEvent(event: NavigationEvent) {
        eventHelper.handleEvent(event)
    }

    //region View
    override fun showMainScreen() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.main_root, MainFragment())
                .commit()
    }
    //endregion
}
