package pl.dawidfiruzek.dagger2android.ui

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

abstract class BaseFragment<P : BaseContract.Presenter> : Fragment() {

    @Inject
    lateinit var presenter: P

    abstract val layoutId: Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutId, container, false)
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.viewCreated()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.viewDestroyed()
    }
}