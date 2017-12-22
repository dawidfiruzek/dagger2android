package pl.dawidfiruzek.dagger2android.feature.main.presentation

import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.feature.main.MainActivityContract

class MainActivityPresenterTest : BaseTest() {

    @Mock
    private lateinit var view: MainActivityContract.View

    @Mock
    private lateinit var router: MainActivityContract.Router

    private lateinit var presenter: MainActivityContract.Presenter

    override fun setup() {
        super.setup()

        presenter = MainActivityPresenter(view, router)
        presenter.initialize()

        verify(view, times(1)).showMainScreen()
    }

    override fun tearDown() {
        super.tearDown()

        verifyNoMoreInteractions(view, router)
    }

    @Test
    fun `should do nothing after clear is called`() {
        presenter.clear()
    }

    @Test
    fun `should navigate to second after eventNavigateToSecond is called`() {
        presenter.eventNavigateToSecond()

        verify(router, times(1)).navigateToSecondScreen()
    }
}