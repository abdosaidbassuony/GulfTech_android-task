package com.example.gulftech_androidtask.ui.home

import com.example.cleanarchproject.ui.base.BaseViewModel
import com.example.gulftech_androidtask.util.SingleLiveEvent

class HomeSharedViewModel : BaseViewModel() {
    val openHome = SingleLiveEvent<Boolean>()

    init {
        openHome()
    }

    private fun openHome() {
        openHome.value = true
    }
}