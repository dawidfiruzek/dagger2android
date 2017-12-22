package pl.dawidfiruzek.dagger2android.feature.splash.navigation

import android.content.Intent
import org.junit.Ignore
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainActivity
import pl.dawidfiruzek.dagger2android.feature.splash.SplashActivityContract
import pl.dawidfiruzek.dagger2android.feature.splash.ui.SplashActivity

class SplashActivityRouterTest : BaseTest() {

    @Mock
    private lateinit var activity: SplashActivity

    private lateinit var router: SplashActivityContract.Router

    override fun setup() {
        super.setup()

        router = SplashActivityRouter(activity)
    }

    override fun tearDown() {
        super.tearDown()

        verifyNoMoreInteractions(activity)
    }

    @Ignore("Resolve NPE first")
    @Test
    fun `should navigate to main after navigateMain is called`() {
        val destinationClass = MainActivity::class
        val intent = Intent(activity, destinationClass.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)

        router.navigateToMain()

        verify(activity, times(1)).startActivity(intent)
    }
}