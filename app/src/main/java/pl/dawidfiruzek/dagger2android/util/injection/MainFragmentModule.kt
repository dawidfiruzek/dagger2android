package pl.dawidfiruzek.dagger2android.util.injection

import dagger.Module
import dagger.Provides
import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragment
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragmentContract
import pl.dawidfiruzek.dagger2android.ui.main.fragment.MainFragmentPresenter
import pl.dawidfiruzek.dagger2android.navigation.main.MainFragmentRouter

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
