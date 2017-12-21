package pl.dawidfiruzek.dagger2android

import android.support.annotation.CallSuper
import org.junit.After
import org.junit.Before
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

abstract class BaseTest {

    @Before
    @CallSuper
    open fun setup() {
        MockitoAnnotations.initMocks(this)
    }

    @After
    @CallSuper
    open fun tearDown() {

    }

    protected fun <T> any(): T {
        Mockito.any<T>()
        return uninitialized()
    }

    protected fun <T> any(c: Class<T>): T {
        Mockito.any<T>(c)
        return uninitialized()
    }

    private fun <T> uninitialized(): T = null as T
}