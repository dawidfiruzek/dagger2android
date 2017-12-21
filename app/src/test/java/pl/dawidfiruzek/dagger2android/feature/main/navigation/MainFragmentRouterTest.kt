package pl.dawidfiruzek.dagger2android.feature.main.navigation

import org.greenrobot.eventbus.EventBus
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.data.MainNavigationEvent
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract

class MainFragmentRouterTest : BaseTest() {

    @Mock
    private lateinit var eventBus: EventBus

    private lateinit var router: MainFragmentContract.Router

    override fun setup() {
        super.setup()

        router = MainFragmentRouter(eventBus)
    }

    override fun tearDown() {
        super.tearDown()

        Mockito.verifyNoMoreInteractions(eventBus)
    }

    @Test
    fun `should post NAVIGATE_TO_SECOND after navigateToMainScreen is called`() {
        router.navigateToSecondScreen()

        Mockito.verify(eventBus, Mockito.times(1)).post(MainNavigationEvent.NAVIGATE_TO_SECOND)
    }
}