package com.example.gulftech_androidtask.data.model.response


import com.google.gson.annotations.SerializedName

data class PropertyImage(
    @SerializedName("id")
    val id: Int?= null,
    @SerializedName("isIntegration")
    val isIntegration: Boolean?= null,
    @SerializedName("isMain")
    val isMain: Boolean?= null,
    @SerializedName("type")
    val type: String?= null,
    @SerializedName("url")
    val url: String?= null
)