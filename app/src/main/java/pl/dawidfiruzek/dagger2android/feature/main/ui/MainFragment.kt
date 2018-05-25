package pl.dawidfiruzek.dagger2android.feature.main.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pl.dawidfiruzek.dagger2android.databinding.FragmentMainBinding
import pl.dawidfiruzek.dagger2android.feature.common.ui.BaseFragment
import pl.dawidfiruzek.dagger2android.feature.main.MainFragmentContract

class MainFragment : BaseFragment<MainFragmentContract.Presenter>() {

    override val layoutId: Int = 0
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.presenter = presenter
        return binding.root
    }
}
