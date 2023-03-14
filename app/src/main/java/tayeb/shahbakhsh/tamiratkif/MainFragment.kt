package tayeb.shahbakhsh.tamiratkif

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
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


        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainFragmentViewModel::class.java)
    }

}