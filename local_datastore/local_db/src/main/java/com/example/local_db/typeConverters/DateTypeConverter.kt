package com.example.local_db.typeConverters

import androidx.room.TypeConverter
import java.util.Date

class DateTypeConverter {

    @TypeConverter
    fun convertToLong(date: Date?):Long? =
        date?.time

    @TypeConverter
    fun convertToDate(long: Long?):Date? =
        long?.let { Date(it) }

}