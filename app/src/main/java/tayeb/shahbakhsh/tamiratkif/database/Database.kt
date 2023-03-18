package tayeb.shahbakhsh.tamiratkif.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import tayeb.shahbakhsh.tamiratkif.data.Item

@Database(entities = [Item::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase(){
    companion object {
        @JvmStatic
        private var database: AppDatabase? = null

        @JvmStatic
        fun getAppDataBase(context: Context): AppDatabase {
            if (database == null) {
                database = Room.databaseBuilder(context, AppDatabase::class.java, "items.db")
                    .build()
            }
            return database as AppDatabase
        }
    }

    abstract val itemDao : ItemDao
}