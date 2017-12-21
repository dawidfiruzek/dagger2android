package pl.dawidfiruzek.dagger2android.feature.common.navigation

import pl.dawidfiruzek.dagger2android.data.NavigationEvent

interface EventHelper {

    fun handleEvent(event: NavigationEvent)
}
