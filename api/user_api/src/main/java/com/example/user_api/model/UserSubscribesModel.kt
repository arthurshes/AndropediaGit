package com.example.user_api.model

import java.util.Date

data class UserSubscribesModel(
    val token:String,
    val subscribeToken:String,
    val date: Date,
    val term:Int
)