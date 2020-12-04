package com.example.gulftech_androidtask.data.model.request


import com.google.gson.annotations.SerializedName

data class PropertyListRequest(
    @SerializedName("appLanguage")
    val appLanguage: String? = null,
    @SerializedName("appversion")
    val appversion: String? = null,
    @SerializedName("CountryId")
    val countryId: Int? = null,
    @SerializedName("CurrencyId")
    val currencyId: Int? = null,
    @SerializedName("data")
    val data: RequestData? = null,
    @SerializedName("deviceSerial")
    val deviceSerial: String? = null,
    @SerializedName("deviceType")
    val deviceType: Int? = null,
    @SerializedName("ip")
    val ip: String? = null,
    @SerializedName("MeasureUnitId")
    val measureUnitId: Int? = null,
    @SerializedName("notificationToken")
    val notificationToken: String? = null,
    @SerializedName("osversion")
    val osversion: String? = null,
    @SerializedName("userId")
    val userId: Int? = null
) {
    companion object {
        fun sliderImagesPropertyRequestBody() = PropertyListRequest(
            appLanguage = "en",
            deviceSerial = "DA3D4B85-2809-485D-A93B-3F0B582FBF72",
            measureUnitId = 1,
            appversion = "",
            notificationToken = "e9JCuaNS-0ZWgE7jwEr3-9:APA91bGw_QzWLtCEGUA7zFRJoiySzFra1i4IXMZBhDQaH1z3QuyInt726Wb7en4Xcbt7sj4HOSLPQITmvg2s7w6p_aTJtjOHS3kRT3jPz-HqpdvC7qLoqmduvJl2pU3kver_-l9QjSVG",
            deviceType = 1,
            userId = 1140,
            data = RequestData(),
            ip = "",
            currencyId = 1,
            countryId = 65946,
            osversion = ""
        )

        fun propertyListRequestBody() = PropertyListRequest(
            appLanguage = "en",
            deviceSerial = "DA3D4B85-2809-485D-A93B-3F0B582FBF72",
            measureUnitId = 1,
            appversion = "",
            notificationToken = "e9JCuaNS-0ZWgE7jwEr3-9:APA91bGw_QzWLtCEGUA7zFRJoiySzFra1i4IXMZBhDQaH1z3QuyInt726Wb7en4Xcbt7sj4HOSLPQITmvg2s7w6p_aTJtjOHS3kRT3jPz-HqpdvC7qLoqmduvJl2pU3kver_-l9QjSVG",
            deviceType = 1,
            userId = 1140,
            data = dataRequestBody(),
            ip = "",
            currencyId = 1,
            countryId = 65946,
            osversion = ""
        )

        private fun dataRequestBody() = RequestData(
            propertyFurnishingId = -1,
            minBathRoom = -1,
            isRented = -1,
            keyword = "",
            minPrice = -1,
            propId = -1,
            minArea = -1,
            areaId = -1,
            countryId = 65946,
            categoryName = "",
            cityName = "",
            propertyAmenities = emptyList(),
            lastRowId = 20,
            cityId = -1,
            propertyAdOnsDtos = emptyList(),
            isRentedName = "",
            propertyTypeName = "",
            maxArea = -1,
            isFeature = false,
            maxBathRoom = -1,
            minBedRoom = -1,
            maxPrice = -1,
            categoryId = -1,
            furnishedName = "",
            propertyTypeId = 1,
            sortTypeId = -1,
            maxBedRoom = -1,
            propertyCity = emptyList()

        )
    }


}