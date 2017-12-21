package pl.dawidfiruzek.dagger2android.util.tools

import pl.dawidfiruzek.dagger2android.data.NavigationEvent

interface EventHelper {

    fun handleEvent(event: NavigationEvent)
}
