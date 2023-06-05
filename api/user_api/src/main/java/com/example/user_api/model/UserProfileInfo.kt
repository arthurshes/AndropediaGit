package com.example.user_api.model

import java.util.Date

data class UserProfileInfo(
    val name:String,
    val imageUrl:String,
    val androidPointCount:Int,
    val startDate: Date,
    val impactModeDay:Int,
    val token:String,
    val courseNuber:Int,
    val lastLevelNumber:Int
)