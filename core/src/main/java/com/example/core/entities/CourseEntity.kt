package com.example.core.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "courseTableEnt")
data class CourseEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int?=null,
    val levelsComleted:Int,
    val isClose:Boolean = true,
    val isBuy:Boolean = false,
    val isFreeGet:Boolean = false
)