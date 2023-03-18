package tayeb.shahbakhsh.tamiratkif.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_item")

data class Item(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var name: String,
    var number: String,
    var date: String,
    var photo: Int)
