package pl.dawidfiruzek.dagger2android.navigation

import pl.dawidfiruzek.dagger2android.data.NavigationEvent

interface EventHelper {

    fun handleEvent(event: NavigationEvent)
}
