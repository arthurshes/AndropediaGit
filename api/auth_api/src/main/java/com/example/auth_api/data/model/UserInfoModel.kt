package com.example.auth_api.data.model

import android.graphics.Bitmap
import android.media.Image

data class UserInfoModel(
    val token:String,
    val name:String?=null,
    val image: Bitmap?=null
)
