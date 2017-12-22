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
    private lateinit var presenter: MainActivityContract.Presenter

    private lateinit var eventHelper: EventHelper

    override fun setup() {
        super.setup()

        eventHelper = MainActivityEventHelper(presenter)
    }

    override fun tearDown() {
        super.tearDown()

        verifyNoMoreInteractions(presenter)
    }


    @Test
    fun `should call presenter's eventNavigateToSecond after NAVIGATE_TO_SECOND occur`() {
        eventHelper.handleEvent(MainNavigationEvent.NAVIGATE_TO_SECOND)

        verify(presenter, times(1)).eventNavigateToSecond()
    }
}