package com.artikov.modul_5_lesson_7_ums_real

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root =  inflater.inflate(R.layout.fragment_home, container, false)

        val bundle = Bundle()

        val navOptions = NavOptions.Builder()
        navOptions.setEnterAnim(R.anim.exit_anim)
        navOptions.setExitAnim(R.anim.pop_enter_anim)
        navOptions.setPopEnterAnim(R.anim.enter_anim)
        navOptions.setPopExitAnim(R.anim.pop_exit_anim)

       root.tariflar.setOnClickListener {
            findNavController().navigate(R.id.firstFragment2,bundle,navOptions.build())
        }

        root.daqiqalar.setOnClickListener {
            findNavController().navigate(R.id.secondFragment,bundle,navOptions.build())
        }

        root.internet.setOnClickListener {
            findNavController().navigate(R.id.thirdFragment,bundle,navOptions.build())
        }

        root.xizmatlar.setOnClickListener {
            findNavController().navigate(R.id.fourFragment,bundle,navOptions.build())
        }

        root.sms.setOnClickListener {
            findNavController().navigate(R.id.fifthFragment,bundle,navOptions.build())
        }

        root.yangiliklar.setOnClickListener {
            findNavController().navigate(R.id.sixFragment,bundle,navOptions.build())
        }

        return root

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}