package com.example.gulftech_androidtask.data.model.response


import com.google.gson.annotations.SerializedName

data class PropertyResponse(
    @SerializedName("data")
    val data: List<Data>? = null,
    @SerializedName("responseCode")
    val responseCode: Int? = null,
    @SerializedName("responseMessage")
    val responseMessage: String? = null,
    @SerializedName("responseMessageAr")
    val responseMessageAr: String? = null,
    @SerializedName("responseMessageEn")
    val responseMessageEn: String? = null,
    @SerializedName("responseRemark")
    val responseRemark: String? = null
)