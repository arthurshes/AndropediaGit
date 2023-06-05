package com.example.local_db.dao
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.core.entities.UserInfoEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UserInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUserInfo(userInfoEntity: UserInfoEntity)

    @Update
    suspend fun updateUserInfo(userInfoEntity: UserInfoEntity)

    @Delete
    suspend fun deleteUserInfo(userInfoEntity: UserInfoEntity)

    @Query("SELECT * FROM userInfoEntityTable")
    fun getMyInfo():Flow<UserInfoEntity>

}