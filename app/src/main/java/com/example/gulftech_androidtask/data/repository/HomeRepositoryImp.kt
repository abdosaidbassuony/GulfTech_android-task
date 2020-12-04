package com.example.gulftech_androidtask.data.repository

import com.example.gulftech_androidtask.data.DataEndPoint
import com.example.gulftech_androidtask.data.model.request.PropertyListRequest
import com.example.gulftech_androidtask.data.model.response.PropertyResponse
import io.reactivex.Single

class HomeRepositoryImp(private val dataEndPoint: DataEndPoint) : HomeRepository {
    override fun getSliderImageProperty(sliderImagePropertyRequest: PropertyListRequest): Single<PropertyResponse> {
        return dataEndPoint.getSliderImageProperty(sliderImagePropertyRequest)
    }

    override fun getProperty(propertyListRequestList: PropertyListRequest): Single<PropertyResponse> {
        return dataEndPoint.getProperty(propertyListRequestList)
    }
}