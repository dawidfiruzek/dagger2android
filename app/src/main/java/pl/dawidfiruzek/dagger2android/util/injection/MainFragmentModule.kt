package pl.dawidfiruzek.dagger2android.util.injection

import dagger.Module
import dagger.Provides
import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainFragment
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract
import pl.dawidfiruzek.dagger2android.feature.main.presentation.MainFragmentPresenter
import pl.dawidfiruzek.dagger2android.feature.main.navigation.MainFragmentRouter

@Module
class MainFragmentModule {

    @Provides
    fun view(fragment: MainFragment): MainFragmentContract.View = fragment

    @Provides
    fun router(eventBus: EventBus): MainFragmentContract.Router =
            MainFragmentRouter(eventBus)

    @Provides
    fun presenter(view: MainFragmentContract.View, router: MainFragmentContract.Router): MainFragmentContract.Presenter =
            MainFragmentPresenter(view, router)
}
