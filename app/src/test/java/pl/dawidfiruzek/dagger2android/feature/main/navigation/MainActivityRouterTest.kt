package pl.dawidfiruzek.dagger2android.feature.main.navigation

import android.content.Intent
import org.junit.Ignore
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainActivity
import pl.dawidfiruzek.dagger2android.feature.second.ui.SecondActivity

class MainActivityRouterTest : BaseTest() {

    @Mock
    private lateinit var activity: MainActivity

    private lateinit var router: MainActivityContract.Router

    override fun setup() {
        super.setup()

        router = MainActivityRouter(activity)
    }

    override fun tearDown() {
        super.tearDown()

        Mockito.verifyNoMoreInteractions(activity)
    }

    @Ignore("Resolve NPE first")
    @Test
    fun `activity's start should be called after navigateToSecondScreen is called`() {
        val destinationClass = SecondActivity::class
        val intent = Intent(activity, destinationClass.java)

        router.navigateToSecondScreen()

        Mockito.verify(activity, Mockito.times(1)).startActivity(intent)
    }

    @Test
    fun `activity's finish should be called after router's finish is called`() {
        router.finish()

        Mockito.verify(activity, Mockito.times(1)).finish()
    }
}