package pl.dawidfiruzek.dagger2android.util.injection

import dagger.Module
import dagger.Provides
import pl.dawidfiruzek.dagger2android.data.ExampleInjectedClass

@Module
class MainFragmentModule {

    @Provides
    fun exampleInjectedClass(): ExampleInjectedClass = ExampleInjectedClass(2323)
}
