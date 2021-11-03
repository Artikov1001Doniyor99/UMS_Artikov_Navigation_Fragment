package com.artikov.modul_5_lesson_7_ums_real

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_fifth.view.*
import kotlinx.android.synthetic.main.fragment_six.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [sixFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class sixFragment : Fragment() {
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

        root =  inflater.inflate(R.layout.fragment_six, container, false)

        root.back_yangiliklar.setOnClickListener {
            findNavController().popBackStack()
        }

        val bundle = Bundle()

        val navOptions = NavOptions.Builder()
        navOptions.setEnterAnim(R.anim.exit_anim)
        navOptions.setExitAnim(R.anim.pop_enter_anim)
        navOptions.setPopEnterAnim(R.anim.enter_anim)
        navOptions.setPopExitAnim(R.anim.pop_exit_anim)



        root.one_new.setOnClickListener {
            bundle.putString("D","a")
            findNavController().navigate(R.id.yangiliklarFragment,bundle,navOptions.build())
        }

        root.two_new.setOnClickListener {
            bundle.putString("D","b")
            findNavController().navigate(R.id.yangiliklarFragment,bundle,navOptions.build())
        }

        root.three_new.setOnClickListener {
            bundle.putString("D","c")
            findNavController().navigate(R.id.yangiliklarFragment,bundle,navOptions.build())
        }

        root.four_new.setOnClickListener {
            bundle.putString("D","d")
            findNavController().navigate(R.id.yangiliklarFragment,bundle,navOptions.build())
        }

        root.five_new.setOnClickListener {
            bundle.putString("D","e")
            findNavController().navigate(R.id.yangiliklarFragment,bundle,navOptions.build())
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
         * @return A new instance of fragment sixFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            sixFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}