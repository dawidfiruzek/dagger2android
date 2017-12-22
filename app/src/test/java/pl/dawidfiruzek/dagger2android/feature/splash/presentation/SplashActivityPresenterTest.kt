package pl.dawidfiruzek.dagger2android.feature.splash.presentation

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import pl.dawidfiruzek.dagger2android.BaseTest
import pl.dawidfiruzek.dagger2android.feature.splash.SplashActivityContract

class SplashActivityPresenterTest : BaseTest() {

    @Mock
    private lateinit var view: SplashActivityContract.View

    @Mock
    private lateinit var router: SplashActivityContract.Router

    @Mock
    private lateinit var compositeDisposable: CompositeDisposable

    private lateinit var presenter: SplashActivityContract.Presenter

    override fun setup() {
        super.setup()
        trampolineRxPlugin()

        presenter = SplashActivityPresenter(view, router, compositeDisposable)
        presenter.initialize()

        verify(compositeDisposable, times(1)).add(any(Disposable::class.java))
        verify(router, times(1)).navigateToMain()
    }

    override fun tearDown() {
        super.tearDown()

        verifyNoMoreInteractions(view, router, compositeDisposable)
    }

    @Test
    fun clear() {
        presenter.clear()

        verify(compositeDisposable, times(1)).clear()
    }
}