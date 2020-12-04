package com.example.gulftech_androidtask.data.model.response


import com.google.gson.annotations.SerializedName

data class Amenity(
    @SerializedName("id")
    val id: Int?= null,
    @SerializedName("imageUrl")
    val imageUrl: Any?= null,
    @SerializedName("name")
    val name: String?= null
)