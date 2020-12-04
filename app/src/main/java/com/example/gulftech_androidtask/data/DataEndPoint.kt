package com.example.gulftech_androidtask.data

import com.example.gulftech_androidtask.data.model.request.PropertyListRequest
import com.example.gulftech_androidtask.data.model.response.PropertyResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface DataEndPoint {
    @POST("SliderImagesProperty")
    fun getSliderImageProperty(@Body sliderImagePropertyRequest: PropertyListRequest): Single<PropertyResponse>

    @POST("PropertyList")
    fun getProperty(@Body propertyListRequestList: PropertyListRequest): Single<PropertyResponse>
}