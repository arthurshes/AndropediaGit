package com.example.local_db.dao
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.core.entities.LevelEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LevelsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLevel(levelEntity: com.example.core.entities.LevelEntity)

    @Query("SELECT * FROM levelTableEnt")
    fun getAllLevel():Flow<List<com.example.core.entities.LevelEntity>>

    @Update
    suspend fun updateLevel(levelEntity: com.example.core.entities.LevelEntity)

    @Delete
    suspend fun deleteLevel(levelEntity: com.example.core.entities.LevelEntity)

    @Query("DELETE FROM levelTableEnt")
    suspend fun deleteAllLevels()

}