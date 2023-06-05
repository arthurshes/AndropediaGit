package com.example.core.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "TransactionEntityTable")
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int?=null,
    val date:Date,
    val transactionToken:String,
    val term:Int,
    val userToken:String
)