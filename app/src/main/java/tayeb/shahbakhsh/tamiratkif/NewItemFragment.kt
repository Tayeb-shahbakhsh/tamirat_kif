package tayeb.shahbakhsh.tamiratkif

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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



        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[NewItemViewModel::class.java]
        // TODO: Use the ViewModel
    }

}