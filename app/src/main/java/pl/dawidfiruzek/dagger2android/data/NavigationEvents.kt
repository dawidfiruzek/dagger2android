package pl.dawidfiruzek.dagger2android.data

interface NavigationEvent

enum class MainNavigationEvent : NavigationEvent {
    NAVIGATE_TO_SECOND
}

enum class SecondNavigationEvent : NavigationEvent {
    NAVIGATE_TO_MAIN
}
