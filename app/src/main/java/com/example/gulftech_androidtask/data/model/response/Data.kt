package com.example.gulftech_androidtask.data.model.response


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("address")
    val address: String?= null,
    @SerializedName("amenities")
    val amenities: List<Amenity>?= null,
    @SerializedName("area")
    val area: Double?= null,
    @SerializedName("areaSpace")
    val areaSpace: Double?= null,
    @SerializedName("bathRoom")
    val bathRoom: Double?= null,
    @SerializedName("bedRoom")
    val bedRoom: Double?= null,
    @SerializedName("category")
    val category: String?= null,
    @SerializedName("description")
    val description: String?= null,
    @SerializedName("distanceFromMe")
    val distanceFromMe: Any?= null,
    @SerializedName("email")
    val email: String?= null,
    @SerializedName("expireDate")
    val expireDate: Any?= null,
    @SerializedName("floorNumber")
    val floorNumber: String?= null,
    @SerializedName("furnishing")
    val furnishing: String?= null,
    @SerializedName("id")
    val id: Int?= null,
    @SerializedName("isFavourit")
    val isFavourite: Boolean?= null,
    @SerializedName("isFeatured")
    val isFeatured: Boolean?= null,
    @SerializedName("isHotDeals")
    val isHotDeals: Boolean?= null,
    @SerializedName("isMap")
    val isMap: Boolean?= null,
    @SerializedName("isRented")
    val isRented: Any?= null,
    @SerializedName("isSold")
    val isSold: Boolean?= null,
    @SerializedName("latitude")
    val latitude: Double?= null,
    @SerializedName("longtiude")
    val longtiude: Double?= null,
    @SerializedName("mortirage")
    val mortirge: Boolean?= null,
    @SerializedName("parking")
    val parking: Int?= null,
    @SerializedName("phone")
    val phone: String?= null,
    @SerializedName("price")
    val price: String?= null,
    @SerializedName("primaryView")
    val primaryView: PrimaryView?= null,
    @SerializedName("propertyImages")
    val propertyImages: List<PropertyImage>?= null,
    @SerializedName("propertyType")
    val propertyType: PropertyType?= null,
    @SerializedName("rentAmount")
    val rentAmount: Any?= null,
    @SerializedName("rowNum")
    val rowNum: Int?= null,
    @SerializedName("serviceCharge")
    val serviceCharge: Any?= null,
    @SerializedName("shareLink")
    val shareLink: String?= null,
    @SerializedName("smsNo")
    val smsNo: String?= null,
    @SerializedName("status")
    val status: Any?= null,
    @SerializedName("title")
    val title: String?= null,
    @SerializedName("unitNo")
    val unitNo: String?= null,
    @SerializedName("unitRef")
    val unitRef: String?= null
)