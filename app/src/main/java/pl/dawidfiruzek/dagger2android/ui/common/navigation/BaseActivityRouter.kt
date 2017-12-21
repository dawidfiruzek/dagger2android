package pl.dawidfiruzek.dagger2android.ui.common.navigation

import android.support.v7.app.AppCompatActivity
import pl.dawidfiruzek.dagger2android.extensions.startActivity
import pl.dawidfiruzek.dagger2android.ui.common.BaseContract
import kotlin.reflect.KClass

abstract class BaseActivityRouter(protected val activity: AppCompatActivity) : BaseContract.Router {

    override fun finish() {
        activity.finish()
    }

    protected fun startActivity(activityClass: KClass<*>, flags: List<Int>? = null) {
        activity.startActivity(activityClass, flags)
    }
}
