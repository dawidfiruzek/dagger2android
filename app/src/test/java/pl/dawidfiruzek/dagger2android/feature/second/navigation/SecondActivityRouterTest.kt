package pl.dawidfiruzek.dagger2android.feature.second.navigation

import android.content.Intent
import org.junit.Ignore
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainActivity
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract
import pl.dawidfiruzek.dagger2android.feature.second.ui.SecondActivity

class SecondActivityRouterTest : BaseTest() {

    @Mock
    private lateinit var activity: SecondActivity

    private lateinit var router: SecondActivityContract.Router

    override fun setup() {
        super.setup()

        router = SecondActivityRouter(activity)
    }

    override fun tearDown() {
        super.tearDown()

        verifyNoMoreInteractions(activity)
    }

    @Ignore("Resolve NPE first")
    @Test
    fun `activity's start should be called after navigateToMainScreen is called`() {
        val destinationClass = MainActivity::class
        val intent = Intent(activity, destinationClass.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)

        router.navigateToMainScreen()

        verify(activity, times(1)).startActivity(intent)
    }
}