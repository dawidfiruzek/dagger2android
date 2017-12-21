package pl.dawidfiruzek.dagger2android.feature.main.ui

import butterknife.OnClick
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.feature.common.ui.BaseFragment
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract

class MainFragment : BaseFragment<MainFragmentContract.Presenter>(), MainFragmentContract.View {

    override val layoutId: Int = R.layout.fragment_main

    @OnClick(R.id.fragment_main_button_navigate)
    fun navigateClicked() {
        presenter.navigateClicked()
    }
}
