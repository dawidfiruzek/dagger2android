package pl.dawidfiruzek.dagger2android.ui

import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import pl.dawidfiruzek.dagger2android.data.NavigationEvent
import javax.inject.Inject

abstract class BaseActivity<P : BaseContract.Presenter>
    : AppCompatActivity(), HasSupportFragmentInjector, BaseContract.View {

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var presenter: P

    @Inject
    lateinit var eventBus: EventBus

    @Inject
    lateinit var eventHelper: EventHelper

    abstract val layoutId: Int

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        ButterKnife.bind(this)
        presenter.initialize()
    }

    override fun onStart() {
        super.onStart()
        eventBus.register(this)
    }

    override fun onStop() {
        super.onStop()
        eventBus.unregister(this)
    }

    @CallSuper
    override fun onDestroy() {
        super.onDestroy()
        presenter.clear()
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> =
            fragmentInjector

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun navigationEvent(event: NavigationEvent) {
        eventHelper.handleEvent(event)
    }
}
