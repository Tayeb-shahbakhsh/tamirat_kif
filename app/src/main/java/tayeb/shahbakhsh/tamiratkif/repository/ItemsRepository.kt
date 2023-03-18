package tayeb.shahbakhsh.tamiratkif.repository

import kotlinx.coroutines.flow.Flow
import tayeb.shahbakhsh.tamiratkif.data.Item

interface ItemsRepository {
    fun add(item:Item) : Int

    fun update(item:Item) : Int

    fun delete(item:Item) : Int

    fun getAll() : Flow<List<Item>>
}