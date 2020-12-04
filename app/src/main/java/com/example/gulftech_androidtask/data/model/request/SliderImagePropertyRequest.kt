package com.example.gulftech_androidtask.data.model.request


import com.example.gulftech_androidtask.data.model.response.Data
import com.google.gson.annotations.SerializedName

data class SliderImagePropertyRequest(
    @SerializedName("appLanguage")
    val appLanguage: String? = null,
    @SerializedName("appversion")
    val appVersion: String?= null,
    @SerializedName("CountryId")
    val countryId: Int?= null,
    @SerializedName("CurrencyId")
    val currencyId: Int?= null,
    @SerializedName("data")
    val data: Data?= null,
    @SerializedName("deviceSerial")
    val deviceSerial: String?= null,
    @SerializedName("deviceType")
    val deviceType: Int?= null,
    @SerializedName("ip")
    val ip: String?= null,
    @SerializedName("MeasureUnitId")
    val measureUnitId: Int?= null,
    @SerializedName("notificationToken")
    val notificationToken: String?= null,
    @SerializedName("osversion")
    val osVersion: String?= null,
    @SerializedName("userId")
    val userId: Int?= null
)