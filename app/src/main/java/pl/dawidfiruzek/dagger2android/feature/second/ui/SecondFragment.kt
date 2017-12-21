package pl.dawidfiruzek.dagger2android.feature.second.ui

import butterknife.OnClick
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.feature.common.ui.BaseFragment
import pl.dawidfiruzek.dagger2android.feature.second.SecondFragmentContract

class SecondFragment : BaseFragment<SecondFragmentContract.Presenter>(), SecondFragmentContract.View {

    override val layoutId: Int = R.layout.fragment_second

    @OnClick(R.id.fragment_second_button_navigate)
    fun navigateClicked() {
        presenter.navigateClicked()
    }
}
