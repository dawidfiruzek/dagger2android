package pl.dawidfiruzek.dagger2android.util.injection.binding

import android.support.v4.app.Fragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.dawidfiruzek.dagger2android.feature.main.ui.MainFragment
import pl.dawidfiruzek.dagger2android.feature.second.ui.SecondFragment
import pl.dawidfiruzek.dagger2android.util.injection.MainFragmentModule
import pl.dawidfiruzek.dagger2android.util.injection.SecondFragmentModule

@Module
abstract class FragmentBinderModule {

    @Binds
    abstract fun fragment(fragment: Fragment): Fragment

    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun bindMainFragment(): MainFragment

    @ContributesAndroidInjector(modules = [SecondFragmentModule::class])
    abstract fun bindSecondFragment(): SecondFragment
}
