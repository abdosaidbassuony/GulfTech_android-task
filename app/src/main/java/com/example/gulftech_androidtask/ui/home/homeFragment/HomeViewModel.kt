package com.example.gulftech_androidtask.ui.home.homeFragment

import android.util.Log
import com.example.cleanarchproject.ui.base.BaseViewModel
import com.example.gulftech_androidtask.data.model.request.PropertyListRequest
import com.example.gulftech_androidtask.data.model.response.Data
import com.example.gulftech_androidtask.data.repository.HomeRepository
import com.example.gulftech_androidtask.util.SingleLiveEvent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class HomeViewModel(private val repository: HomeRepository) : BaseViewModel() {
    val sliderData = SingleLiveEvent<List<Data>>()
    val propertyList = SingleLiveEvent<List<Data>>()

    init {
        getSliderImageProperty()
        getPropertyList()
    }

    private fun getSliderImageProperty() =
        repository.getSliderImageProperty(PropertyListRequest.sliderImagesPropertyRequestBody())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.e("dataList", it.data.toString())
                sliderData.value = it.data
            }, {
                Log.e("getSliderImageProperty", it.message.toString())
            })

    private fun getPropertyList() =
        repository.getProperty(PropertyListRequest.propertyListRequestBody())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                propertyList.value = it.data
            }, {
                Log.e("getPropertyList", it.message.toString())
            })

}


