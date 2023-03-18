package tayeb.shahbakhsh.tamiratkif.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import tayeb.shahbakhsh.tamiratkif.data.Item

interface ItemDao {

    @Insert
    fun add(item: Item) : Int
    @Update
    fun update(item:Item) : Int
    @Delete
    fun delete(item: Item) : Int
    @Query("SELECT * FROM table_item ORDER BY id DESC")
    fun getAll(): Flow<List<Item>>
}