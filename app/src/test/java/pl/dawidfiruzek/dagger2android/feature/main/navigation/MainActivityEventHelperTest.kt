package pl.dawidfiruzek.dagger2android.feature.main.navigation

import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.util.tools.EventHelper
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract

class MainActivityEventHelperTest : BaseTest() {

    @Mock
    private lateinit var router: MainActivityContract.Router

    private lateinit var eventHelper: EventHelper

    override fun setup() {
        super.setup()

        eventHelper = MainActivityEventHelper(router)
    }

    override fun tearDown() {
        super.tearDown()

        verifyNoMoreInteractions(router)
    }


    @Test
    fun `should navigate to second after it's event occur`() {
        eventHelper.handleEvent(MainNavigationEvent.NAVIGATE_TO_SECOND)

        verify(router, times(1)).navigateToSecondScreen()
    }
}