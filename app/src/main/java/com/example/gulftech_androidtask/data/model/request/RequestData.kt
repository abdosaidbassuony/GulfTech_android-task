package com.example.gulftech_androidtask.data.model.request


import com.google.gson.annotations.SerializedName

data class RequestData(
    @SerializedName("AreaId")
    val areaId: Int?= null,
    @SerializedName("CategoryId")
    val categoryId: Int?= null,
    @SerializedName("CategoryName")
    val categoryName: String?= null,
    @SerializedName("CityId")
    val cityId: Int?= null,
    @SerializedName("CityName")
    val cityName: String?= null,
    @SerializedName("CountryId")
    val countryId: Int?= null,
    @SerializedName("FurnishedName")
    val furnishedName: String?= null,
    @SerializedName("IsFeature")
    val isFeature: Boolean?= null,
    @SerializedName("isRented")
    val isRented: Int?= null,
    @SerializedName("IsRentedName")
    val isRentedName: String?= null,
    @SerializedName("keyword")
    val keyword: String?= null,
    @SerializedName("LastRowId")
    val lastRowId: Int?= null,
    @SerializedName("MaxArea")
    val maxArea: Int?= null,
    @SerializedName("MaxBathRoom")
    val maxBathRoom: Int?= null,
    @SerializedName("MaxBedRoom")
    val maxBedRoom: Int?= null,
    @SerializedName("MaxPrice")
    val maxPrice: Int?= null,
    @SerializedName("MinArea")
    val minArea: Int?= null,
    @SerializedName("MinBathRoom")
    val minBathRoom: Int?= null,
    @SerializedName("MinBedRoom")
    val minBedRoom: Int?= null,
    @SerializedName("MinPrice")
    val minPrice: Int?= null,
    @SerializedName("PropId")
    val propId: Int?= null,
    @SerializedName("propertyAdOnsDtos")
    val propertyAdOnsDtos: List<Any>?= null,
    @SerializedName("PropertyAmenities")
    val propertyAmenities: List<Any>?= null,
    @SerializedName("PropertyCity")
    val propertyCity: List<Any>?= null,
    @SerializedName("PropertyFurnishingId")
    val propertyFurnishingId: Int?= null,
    @SerializedName("PropertyTypeId")
    val propertyTypeId: Int?= null,
    @SerializedName("PropertyTypeName")
    val propertyTypeName: String?= null,
    @SerializedName("SortTypeId")
    val sortTypeId: Int?= null
)