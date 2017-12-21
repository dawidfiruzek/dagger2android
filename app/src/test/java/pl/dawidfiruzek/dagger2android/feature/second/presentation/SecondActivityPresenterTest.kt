package pl.dawidfiruzek.dagger2android.feature.second.presentation

import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.feature.second.SecondActivityContract
import kotlin.concurrent.timer

class SecondActivityPresenterTest : BaseTest() {

    @Mock
    private lateinit var view: SecondActivityContract.View

    @Mock
    private lateinit var router: SecondActivityContract.Router

    private lateinit var presenter: SecondActivityContract.Presenter

    override fun setup() {
        super.setup()

        presenter = SecondActivityPresenter(view, router)
        presenter.initialize()

        verify(view, times(1)).showSecondScreen()
    }

    override fun tearDown() {
        super.tearDown()

        verifyNoMoreInteractions(view, router)
    }

    @Test
    fun `should do nothing after clear is called`() {
        presenter.clear()
    }
}