package com.example.final_test_01.data.model.product_dto


import com.google.gson.annotations.SerializedName

data class Dimensions(
    @SerializedName("height")
    val height: String?,
    @SerializedName("length")
    val length: String?,
    @SerializedName("width")
    val width: String?
)