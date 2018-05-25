package pl.dawidfiruzek.dagger2android.util.injection

import dagger.Module
import dagger.Provides
import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract
import pl.dawidfiruzek.dagger2android.feature.main.navigation.MainFragmentRouter
import pl.dawidfiruzek.dagger2android.feature.main.presentation.MainFragmentPresenter
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainFragment

@Module
class MainFragmentModule {

    @Provides
    fun router(eventBus: EventBus): MainFragmentContract.Router =
            MainFragmentRouter(eventBus)

    @Provides
    fun presenter(router: MainFragmentContract.Router): MainFragmentContract.Presenter =
            MainFragmentPresenter(router)
}
