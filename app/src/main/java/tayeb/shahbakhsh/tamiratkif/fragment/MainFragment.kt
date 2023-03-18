package tayeb.shahbakhsh.tamiratkif.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import tayeb.shahbakhsh.tamiratkif.model.Item
import tayeb.shahbakhsh.tamiratkif.viewmodel.MainFragmentViewModel
import tayeb.shahbakhsh.tamiratkif.MyAdapter
import tayeb.shahbakhsh.tamiratkif.R
import tayeb.shahbakhsh.tamiratkif.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMainBinding.inflate(LayoutInflater.from(activity), container, false)

        var itemsList = mutableListOf<Item>(
            Item("طیب","0902123123","1401/02/01",0),
            Item("طیب","0902123123","1401/02/01",0),
            Item("طیب","0902123123","1401/02/01",0),
            Item("طیب","0902123123","1401/02/01",0),
            Item("طیب","0902123123","1401/02/01",0),
            Item("طیب","0902123123","1401/02/01",0),
            Item("طیب","0902123123","1401/02/01",0),
            Item("طیب","0902123123","1401/02/01",0),
            Item("طیب","0902123123","1401/02/01",0),
            Item("طیب","0902123123","1401/02/01",0),
        )

        binding.itemsRv.layoutManager = LinearLayoutManager(activity)
        binding.itemsRv.adapter = MyAdapter(itemsList)

        binding.addFab.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment2_to_newItemFragment2)
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainFragmentViewModel::class.java)
    }

}