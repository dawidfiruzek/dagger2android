package pl.dawidfiruzek.dagger2android.feature.main.ui

import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.feature.common.ui.BaseActivity
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.util.tools.EventHelper
import javax.inject.Inject

class MainActivity : BaseActivity<MainActivityContract.Presenter>(true), MainActivityContract.View {

    @Inject
    lateinit var eventHelper: EventHelper

    override val layoutId: Int = R.layout.activity_main

    //region View
    override fun showMainScreen() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.root, MainFragment())
                .commit()
    }
    //endregion

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun navigationEvent(event: MainNavigationEvent) {
        eventHelper.handleEvent(event)
    }
}
