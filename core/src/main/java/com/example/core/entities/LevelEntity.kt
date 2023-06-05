package com.example.core.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "levelTableEnt")
data class LevelEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int?=null,
    val passedOn:Int,
    val date: Date,
    val isInteractive:Boolean = false,
    val isVictorine:Boolean = false,
    val mistakes:Int?=null,
    val isClose:Boolean = true,
    val isBreak:Boolean = false,
    val isBreakHours:Int?=null
)