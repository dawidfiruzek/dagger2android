package pl.dawidfiruzek.dagger2android.feature.second.navigation

import org.greenrobot.eventbus.EventBus
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.data.SecondNavigationEvent
import pl.dawidfiruzek.dagger2android.feature.second.SecondFragmentContract

class SecondFragmentRouterTest : BaseTest() {

    @Mock
    private lateinit var eventBus: EventBus

    private lateinit var router: SecondFragmentContract.Router

    override fun setup() {
        super.setup()

        router = SecondFragmentRouter(eventBus)
    }

    override fun tearDown() {
        super.tearDown()

        verifyNoMoreInteractions(eventBus)
    }

    @Test
    fun `should post NAVIGATE_TO_MAIN after navigateToMainScreen is called`() {
        router.navigateToMainScreen()

        verify(eventBus, times(1)).post(SecondNavigationEvent.NAVIGATE_TO_MAIN)
    }
}