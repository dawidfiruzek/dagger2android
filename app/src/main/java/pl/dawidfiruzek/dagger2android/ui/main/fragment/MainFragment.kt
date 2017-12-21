package pl.dawidfiruzek.dagger2android.ui.main.fragment

import butterknife.OnClick
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.ui.common.BaseFragment

class MainFragment : BaseFragment<MainFragmentContract.Presenter>(), MainFragmentContract.View {

    override val layoutId: Int = R.layout.fragment_main

    @OnClick(R.id.fragment_main_button_navigate)
    fun navigateClicked() {
        presenter.navigateClicked()
    }
}
