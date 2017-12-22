package pl.dawidfiruzek.dagger2android.feature.second.ui

import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.data.SecondNavigationEvent
import pl.dawidfiruzek.dagger2android.feature.common.ui.BaseActivity
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract
import pl.dawidfiruzek.dagger2android.util.tools.EventHelper
import javax.inject.Inject

class SecondActivity : BaseActivity<SecondActivityContract.Presenter>(true), SecondActivityContract.View {

    @Inject
    lateinit var eventHelper: EventHelper

    override val layoutId: Int = R.layout.activity_main

    override fun showSecondScreen() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.root, SecondFragment())
                .commit()
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun navigationEvent(event: SecondNavigationEvent) {
        eventHelper.handleEvent(event)
    }
}
