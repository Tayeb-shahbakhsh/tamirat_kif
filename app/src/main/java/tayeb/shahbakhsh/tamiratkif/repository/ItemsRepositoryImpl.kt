package tayeb.shahbakhsh.tamiratkif.repository

import kotlinx.coroutines.flow.Flow
import tayeb.shahbakhsh.tamiratkif.data.Item
import tayeb.shahbakhsh.tamiratkif.database.ItemDao

class ItemsRepositoryImpl(private val itemsDao: ItemDao) : ItemsRepository {

        override fun add(item: Item): Int = itemsDao.add(item)

        override fun update(item: Item): Int = itemsDao.update(item)

        override fun delete(item: Item): Int = itemsDao.delete(item)

        override fun getAll(): Flow<List<Item>> = itemsDao.getAll()

}