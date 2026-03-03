package com.example.chaipani.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Entity(tableName = "favorites")
data class FavoriteItem(
    @PrimaryKey val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val category: String,
    val imageUrl: String
)

@Dao
interface FavoriteDao {
    @Query("SELECT * FROM favorites")
    fun getAllFavorites(): Flow<List<FavoriteItem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(item: FavoriteItem)

    @Delete
    suspend fun deleteFavorite(item: FavoriteItem)

    @Query("SELECT EXISTS(SELECT * FROM favorites WHERE id = :itemId)")
    fun isFavorite(itemId: Int): Flow<Boolean>
}

@Database(entities = [FavoriteItem::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favoriteDao(): FavoriteDao
}
