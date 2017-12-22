package pl.dawidfiruzek.dagger2android.feature.common.ui

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
import pl.dawidfiruzek.dagger2android.feature.common.BaseContract
import javax.inject.Inject

abstract class BaseActivity<P : BaseContract.Presenter>(
        private val isHandlingEvents: Boolean = false
) : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var presenter: P

    @Inject
    lateinit var eventBus: EventBus

    abstract val layoutId: Int

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        ButterKnife.bind(this)
        presenter.initialize()
    }

    @CallSuper
    override fun onStart() {
        super.onStart()
        if (isHandlingEvents) {
            eventBus.register(this)
        }
    }

    @CallSuper
    override fun onStop() {
        super.onStop()
        if (isHandlingEvents) {
            eventBus.unregister(this)
        }
    }

    @CallSuper
    override fun onDestroy() {
        super.onDestroy()
        presenter.clear()
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> =
            fragmentInjector
}
