package com.example.gulftech_androidtask.di

import com.example.gulftech_androidtask.ui.home.HomeSharedViewModel
import com.example.gulftech_androidtask.ui.home.homeFragment.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { HomeSharedViewModel() }

    viewModel { HomeViewModel(get()) }
}