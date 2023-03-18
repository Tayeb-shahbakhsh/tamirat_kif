package tayeb.shahbakhsh.tamiratkif.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tayeb.shahbakhsh.tamiratkif.data.Item
import tayeb.shahbakhsh.tamiratkif.viewmodel.NewItemViewModel
import tayeb.shahbakhsh.tamiratkif.databinding.FragmentNewItemBinding

class NewItemFragment : Fragment() {

    companion object {
        fun newInstance() = NewItemFragment()
    }

    private lateinit var viewModel: NewItemViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentNewItemBinding.inflate(LayoutInflater.from(activity),container,false)
        binding.saveItemButton.setOnClickListener {
            var newItem = Item(id = 0, name = binding.addNameTv.text.toString(), number = binding.addNumberTv.text.toString(), date = "0,0,0" , photo = 1)
            addItemToDataBase(newItem)
        }


        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[NewItemViewModel::class.java]
    }

    private fun addItemToDataBase(item:Item){
        viewModel.addItemToDb(item)
    }
}