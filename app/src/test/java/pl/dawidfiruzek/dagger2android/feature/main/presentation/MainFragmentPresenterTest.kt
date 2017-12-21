package pl.dawidfiruzek.dagger2android.feature.main.presentation

import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract

class MainFragmentPresenterTest : BaseTest() {

    @Mock
    private lateinit var view: MainFragmentContract.View

    @Mock
    private lateinit var router: MainFragmentContract.Router

    private lateinit var presenter: MainFragmentContract.Presenter

    override fun setup() {
        super.setup()

        presenter = MainFragmentPresenter(view, router)
        presenter.initialize()
    }

    override fun tearDown() {
        super.tearDown()

        verifyNoMoreInteractions(view, router)
    }

    @Test
    fun `should navigate to second activity after navigateClicked is called`() {
        presenter.navigateClicked()

        verify(router, times(1)).navigateToSecondScreen()
    }

    @Test
    fun `should do nothing after clear is called`() {
        presenter.clear()
    }
}
