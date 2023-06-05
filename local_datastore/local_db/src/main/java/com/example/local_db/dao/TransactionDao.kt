package com.example.local_db.dao
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.core.entities.TransactionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TransactionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaction(transactionEntity: com.example.core.entities.TransactionEntity)

    @Query("SELECT * FROM TransactionEntityTable")
    fun getAllTranssactions():Flow<List<com.example.core.entities.TransactionEntity>>

    @Delete
    suspend fun deleteTransaction(transactionEntity: TransactionEntity)

    @Update
    suspend fun updateTransaction(transactionEntity: com.example.core.entities.TransactionEntity)

    @Query("DELETE FROM TransactionEntityTable")
    suspend fun deleteAllTransactions()

}