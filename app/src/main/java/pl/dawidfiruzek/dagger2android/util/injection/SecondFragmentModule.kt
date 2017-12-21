package pl.dawidfiruzek.dagger2android.util.injection

import dagger.Module
import dagger.Provides
import org.greenrobot.eventbus.EventBus
import pl.dawidfiruzek.dagger2android.ui.second.fragment.SecondFragment
import pl.dawidfiruzek.dagger2android.ui.second.fragment.SecondFragmentContract
import pl.dawidfiruzek.dagger2android.ui.second.fragment.SecondFragmentPresenter
import pl.dawidfiruzek.dagger2android.ui.second.fragment.SecondFragmentRouter

@Module
class SecondFragmentModule {

    @Provides
    fun view(fragment: SecondFragment): SecondFragmentContract.View = fragment

    @Provides
    fun router(eventBus: EventBus): SecondFragmentContract.Router =
            SecondFragmentRouter(eventBus)

    @Provides
    fun presenter(view: SecondFragmentContract.View, router: SecondFragmentContract.Router): SecondFragmentContract.Presenter =
            SecondFragmentPresenter(view, router)
}
