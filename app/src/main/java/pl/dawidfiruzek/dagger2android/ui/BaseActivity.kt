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
import javax.inject.Inject

abstract class BaseActivity<P : BaseContract.Presenter>
    : AppCompatActivity(), HasSupportFragmentInjector, BaseContract.View, BaseContract.Router {

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var presenter: P

    abstract val layoutId: Int

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        ButterKnife.bind(this)
        EventBus.getDefault().register(this)
        presenter.initialize()
    }

    @CallSuper
    override fun onDestroy() {
        super.onDestroy()
        presenter.clear()
        EventBus.getDefault().unregister(this)
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> =
            fragmentInjector
}
