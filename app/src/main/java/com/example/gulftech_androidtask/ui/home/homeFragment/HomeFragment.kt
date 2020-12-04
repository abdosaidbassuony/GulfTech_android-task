package com.example.gulftech_androidtask.ui.home.homeFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.cleanarchproject.ui.base.BaseFragment
import com.example.gulftech_androidtask.R
import com.example.gulftech_androidtask.databinding.FragmentHomeBinding
import com.example.gulftech_androidtask.databinding.PropertyListItemBinding
import com.example.gulftech_androidtask.ui.home.HomeSharedViewModel
import com.example.gulftech_androidtask.ui.home.homeFragment.adapter.PropertyListAdapter
import com.example.gulftech_androidtask.ui.home.homeFragment.adapter.PropertySliderAdapter
import org.koin.android.viewmodel.ext.android.sharedViewModel
import org.koin.android.viewmodel.ext.android.viewModel


class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val viewModel by viewModel<HomeViewModel>()

    override val layoutId: Int = R.layout.fragment_home

    private lateinit var propertyBinding: PropertyListItemBinding


    val sharedViewModel by sharedViewModel<HomeSharedViewModel>()

    private val propertySliderAdapter by lazy { PropertySliderAdapter() }

    private val propertyListAdapter by lazy { PropertyListAdapter() }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAllAdapters()
        initObserver()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        propertyBinding = PropertyListItemBinding.inflate(inflater, container, false)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    private fun initObserver() {
        viewModel.sliderData.observe(this, Observer {
            propertySliderAdapter.submitList(it)
        })
        viewModel.propertyList.observe(this, Observer {
            propertyListAdapter.submitList(it)
        })

    }

    private fun setupAllAdapters() {
        setupPropertySliderAdapter()
        setupPropertyListAdapter()

    }

    private fun setupPropertySliderAdapter() {
        binding.sliderProperty.itemAnimator = null
        binding.sliderProperty.adapter = propertySliderAdapter
    }

    private fun setupPropertyListAdapter() {
        binding.propertyList.itemAnimator = null
        binding.propertyList.adapter = propertyListAdapter

    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}
