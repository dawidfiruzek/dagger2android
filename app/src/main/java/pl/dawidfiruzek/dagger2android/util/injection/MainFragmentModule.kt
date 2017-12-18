package pl.dawidfiruzek.dagger2android.util.injection

import dagger.Module
import dagger.Provides
import pl.dawidfiruzek.dagger2android.data.ExampleInjectedClass
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragment
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragmentContract
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragmentPresenter

@Module
class MainFragmentModule {

    @Provides
    fun view(fragment: MainFragment): MainFragmentContract.View = fragment

    @Provides
    fun router(fragment: MainFragment): MainFragmentContract.Router = fragment

    @Provides
    fun presenter(view: MainFragmentContract.View, router: MainFragmentContract.Router): MainFragmentContract.Presenter =
            MainFragmentPresenter(view, router)

    @Provides
    fun exampleInjectedClass(): ExampleInjectedClass = ExampleInjectedClass(2323)
}
