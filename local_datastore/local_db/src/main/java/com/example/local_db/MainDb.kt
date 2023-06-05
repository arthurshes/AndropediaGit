package com.example.local_db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.local_db.dao.LevelsDao
import com.example.local_db.dao.TestsDao
import com.example.local_db.dao.TransactionDao
import com.example.core.entities.CourseEntity
import com.example.core.entities.LevelEntity
import com.example.core.entities.TransactionEntity
import com.example.core.entities.UserInfoEntity
import com.example.local_db.dao.UserInfoDao
import com.example.local_db.typeConverters.DateTypeConverter

@Database(entities = [CourseEntity::class,LevelEntity::class, TransactionEntity::class,UserInfoEntity::class], version = 1)
@TypeConverters(DateTypeConverter::class)
abstract class MainDb:RoomDatabase() {
    abstract fun getLevelDao(): LevelsDao
    abstract fun getTestsDao(): TestsDao
    abstract fun getUserInfoDao():UserInfoDao
    abstract fun getTransactionDao(): TransactionDao
}