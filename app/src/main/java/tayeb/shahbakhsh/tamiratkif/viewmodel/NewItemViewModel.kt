package tayeb.shahbakhsh.tamiratkif.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import tayeb.shahbakhsh.tamiratkif.data.Item
import tayeb.shahbakhsh.tamiratkif.repository.ItemsRepository

class NewItemViewModel(private val itemsRepository: ItemsRepository) : ViewModel() {
    fun addItemToDb(item:Item){
        viewModelScope.launch(Dispatchers.IO) {
            itemsRepository.add(item)
        }
    }
}