package com.example.futuramabasicapp.model.dto.characters

import com.google.gson.annotations.SerializedName

data class Imagens(
    @SerializedName("head-shot")
    val head_shot: String,
    val main: String
)
