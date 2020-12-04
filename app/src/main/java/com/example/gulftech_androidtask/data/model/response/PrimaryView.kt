package com.example.gulftech_androidtask.data.model.response


import com.google.gson.annotations.SerializedName

data class PrimaryView(
    @SerializedName("id")
    val id: Int?= null,
    @SerializedName("name")
    val name: String?= null
)