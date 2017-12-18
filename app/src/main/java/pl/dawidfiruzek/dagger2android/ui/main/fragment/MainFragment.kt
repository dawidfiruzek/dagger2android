package pl.dawidfiruzek.dagger2android.ui.main.fragment

import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.ui.BaseFragment

class MainFragment : BaseFragment<MainFragmentContract.Presenter>(), MainFragmentContract.View, MainFragmentContract.Router {

    override val layoutId: Int = R.layout.fragment_main
}
