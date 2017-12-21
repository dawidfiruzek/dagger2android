package pl.dawidfiruzek.dagger2android.extensions

import android.app.Activity
import android.content.Intent
import kotlin.reflect.KClass

fun Activity.startActivity(activityClass: KClass<*>, flags: List<Int>? = null) {
    val intent = Intent(this, activityClass.java)
    flags?.forEach { intent.addFlags(it) }
    startActivity(intent)
}
