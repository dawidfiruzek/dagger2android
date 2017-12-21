package pl.dawidfiruzek.dagger2android.ui.second.fragment

import butterknife.OnClick
import pl.dawidfiruzek.dagger2android.R
import pl.dawidfiruzek.dagger2android.ui.BaseFragment

class SecondFragment : BaseFragment<SecondFragmentContract.Presenter>(), SecondFragmentContract.View {

    override val layoutId: Int = R.layout.fragment_second

    @OnClick(R.id.fragment_second_button_navigate)
    fun navigateClicked() {
        presenter.navigateClicked()
    }
}
