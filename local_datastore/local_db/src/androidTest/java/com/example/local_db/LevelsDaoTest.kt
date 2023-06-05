package com.example.local_db

import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.filters.SmallTest
import com.example.local_db.dao.LevelsDao
import com.example.core.entities.LevelEntity
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.util.Date

@OptIn(ExperimentalCoroutinesApi::class)
@SmallTest
class LevelsDaoTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    lateinit var mainDb: MainDb
    lateinit var levelsDao: LevelsDao

    @Before
    fun setUp(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        mainDb = Room.inMemoryDatabaseBuilder(context,MainDb::class.java)
            .build()
        levelsDao = mainDb.getLevelDao()
    }

    @After
    fun turnUp(){
        mainDb.close()
    }


    @Test()
    fun insertTestFun() = runTest {
        val levelEntity = com.example.core.entities.LevelEntity(
            date = Date(),
            id = 1,
            isClose = true,
            isVictorine = true,
            passedOn = 4
        )
        levelsDao.insertLevel(levelEntity)
        val response = levelsDao.getAllLevel()
    }

}