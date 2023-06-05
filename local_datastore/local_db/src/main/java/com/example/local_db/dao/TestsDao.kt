package com.example.local_db.dao
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.core.entities.CourseEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TestsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLevels(courseEntity: com.example.core.entities.CourseEntity)

    @Query("SELECT * FROM courseTableEnt")
    fun getAllLevels():Flow<List<com.example.core.entities.CourseEntity>>

    @Update
    suspend fun updateLevel(courseEntity: com.example.core.entities.CourseEntity)

    @Delete
    suspend fun deleteLevel(courseEntity: com.example.core.entities.CourseEntity)

    @Query("DELETE FROM courseTableEnt")
    suspend fun deleteAllLevel()

}