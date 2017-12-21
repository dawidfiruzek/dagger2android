package pl.dawidfiruzek.dagger2android.feature.second.navigation

import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.data.BaseNavigationEvent
import pl.dawidfiruzek.dagger2android.data.SecondNavigationEvent
import pl.dawidfiruzek.dagger2android.feature.common.navigation.EventHelper
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract

class SecondActivityEventHelperTest : BaseTest() {

    @Mock
    private lateinit var router: SecondActivityContract.Router

    private lateinit var eventHelper: EventHelper

    override fun setup() {
        super.setup()

        eventHelper = SecondActivityEventHelper(router)
    }

    override fun tearDown() {
        super.tearDown()

        verifyNoMoreInteractions(router)
    }


    @Test
    fun `should navigate to main after it's event occur`() {
        eventHelper.handleEvent(SecondNavigationEvent.NAVIGATE_TO_MAIN)

        verify(router, times(1)).navigateToMainScreen()
    }

    @Test
    fun `should finish after it's event occur`() {
        eventHelper.handleEvent(BaseNavigationEvent.FINISH)

        verify(router, times(1)).finish()
    }
}