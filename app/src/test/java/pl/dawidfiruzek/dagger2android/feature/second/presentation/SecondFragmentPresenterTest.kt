package pl.dawidfiruzek.dagger2android.feature.second.presentation

import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.feature.second.SecondFragmentContract

class SecondFragmentPresenterTest : BaseTest() {

    @Mock
    private lateinit var view: SecondFragmentContract.View

    @Mock
    private lateinit var router: SecondFragmentContract.Router

    private lateinit var presenter: SecondFragmentContract.Presenter

    override fun setup() {
        super.setup()

        presenter = SecondFragmentPresenter(view, router)
        presenter.initialize()
    }

    override fun tearDown() {
        super.tearDown()

        verifyNoMoreInteractions(view, router)
    }

    @Test
    fun `should navigate to main after navigateClicked is called`() {
        presenter.navigateClicked()

        verify(router, times(1)).navigateToMainScreen()
    }

    @Test
    fun `should do nothing after clear is called`() {
        presenter.clear()
    }
}