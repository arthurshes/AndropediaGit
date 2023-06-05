package com.example.local_db.di

import android.content.Context
import androidx.room.Room
import com.example.local_db.MainDb
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object LocalDbModule {

    @Provides
    @Singleton
    fun provideMainDb(context: Context):MainDb =
        Room.databaseBuilder(context.applicationContext,MainDb::class.java,"androidpedia.db")
            .build()

}