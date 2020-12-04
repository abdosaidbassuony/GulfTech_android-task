package com.example.gulftech_androidtask.data.repository

import com.example.gulftech_androidtask.data.model.request.PropertyListRequest
import com.example.gulftech_androidtask.data.model.response.PropertyResponse
import io.reactivex.Single

interface HomeRepository {

    fun getSliderImageProperty(sliderImagePropertyRequest: PropertyListRequest): Single<PropertyResponse>

    fun getProperty(propertyListRequestList: PropertyListRequest): Single<PropertyResponse>

}