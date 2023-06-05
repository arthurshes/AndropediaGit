package com.example.core.entities

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "userInfoEntityTable")
data class UserInfoEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int?=null,
    val token:String,
    val image:Bitmap,
    val name:String,
    val startDate: Date,
    val impactModeDay:Int,
    val andropointCount:Int = 0
)
