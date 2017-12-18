package pl.dawidfiruzek.dagger2android.util.injection

import android.app.FragmentManager
import dagger.Module
import dagger.Provides
import pl.dawidfiruzek.dagger2android.ui.main.MainActivity

@Module
class MainActivityModule {

    @Provides
    fun fm(activity: MainActivity): FragmentManager = activity.fragmentManager
}
