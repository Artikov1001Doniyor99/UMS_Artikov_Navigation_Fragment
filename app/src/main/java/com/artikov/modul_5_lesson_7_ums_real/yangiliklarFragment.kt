package com.artikov.modul_5_lesson_7_ums_real

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sms.view.*
import kotlinx.android.synthetic.main.fragment_yangiliklar.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [yangiliklarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class yangiliklarFragment : Fragment() {
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

        root =  inflater.inflate(R.layout.fragment_yangiliklar, container, false)


        var value = arguments?.getString("D")



        if (value == "a"){
            root.yangiliklar_name.text  = "«Qulay taklif V.3» aksiyasi!"
            root.yangiliklar_text.text = "Steel Light, Steel, Bronze, Silver Light, Silver toifasidagi raqamlarni manfaatli narxlar bo‘yicha ulang!\n" +
                    "\n" +
                    "Shoshiling, raqamlarning soni cheklangan!\n" +
                    "\n" +
                    "Corporate 30, Corporate 777, Corporate Maxi, Corporate 50, Corporate 80, Corporate 100, Corporate 130, Corporate 200 tarif rejalariga ulanganda, alohida toifadagi raqamlarni ulash narxiga quyidagi chegirmalar taqdim etiladi:"
        }else{
            if(value == "b"){
                root.yangiliklar_name.text  = "ASKUG tarif rejasi shartlarining o‘zgartirilishi"
                root.yangiliklar_text.text = "ASKUG tarif rejasi shartlarining o‘zgartirilishi\n" +
                        "Chop etish versiyasi\n" +
                        "Hurmatli abonentlar!\n" +
                        "\n" +
                        "2021-yil 13-oktabrdan «Hududgazta’minot» AJ uchun taqdim etilayotgan ASKUG tarif rejasidagi abonent to‘lovining miqdoriga o‘zgartirishlar kiritilmoqda. \n" +
                        "\n" +
                        "Qo‘shimcha ma'lumotni 0990 raqami bo‘yicha yoki kompaniya ofislarida olish mumkin."
            }else{
                if(value == "c"){
                    root.yangiliklar_name.text  = "Corporate 30, Corporate 50,Corporate 80 tarif rejalaridagi to‘plamlarning yangilanishi!"
                    root.yangiliklar_text.text = "Corporate 30, Corporate 50,Corporate 80 tarif rejalaridagi to‘plamlarning yangilanishi!\n" +
                            "Chop etish versiyasi\n" +
                            "Hurmatli abonentlar!\n" +
                            "\n" +
                            "Corporate 30, Corporate 50 tarif rejalaridagi daqiqa va SMS to‘plamlari hamda  Corporate 80 tarif rejasidagi SMS to‘plami yangilanganini, ma'lum qilishdan mamnunmiz.\n" +
                            "\n" +
                            "Corporate 30 tarif rejasi\n" +
                            "\n" +
                            "Corporate 50 tarif rejasi\n" +
                            "\n" +
                            "Corporate 80 tarif rejasi"
                }else{
                    if(value == "d"){
                        root.yangiliklar_name.text  = "«Qulay taklif V.2» aksiyasidagi o‘zgarishlar!"
                        root.yangiliklar_text.text = "«Qulay taklif V.2» aksiyasidagi o‘zgarishlar!\n" +
                                "Chop etish versiyasi\n" +
                                "Hurmatli abonentlar!\n" +
                                "\n" +
                                "«Qulay taklif V.2» aksiyasi 2021-yilning 30-sentabr  sanasigacha (shu jumladan) uzaytirilayotganini, ma'lum qilishdan mamnunmiz.\n" +
                                "\n" +
                                "Endilikda Corporate 30, Corporate 777, Corporate 50, Corporate Maxi, Corporate 80, Corporate 100, Corporate 130, Corporate 200 tarif rejalariga ulanganda, alohida toifadagi raqamlarni ulashning narxiga quyidagi chegirmalar taqdim etiladi:"
                    }else{
                        if (value == "e"){
                            root.yangiliklar_name.text  = "Yangi «Inspektor Ovoz» xizmati!"
                            root.yangiliklar_text.text = "Yangi «Inspektor Ovoz» xizmati!\n" +
                                    "Chop etish versiyasi\n" +
                                    "Sizning e’tiboringizga yangi, to‘langan daqiqalar hajmi (tarif rejasiga kiritilgan daqiqalar to‘plami, xarid qilingan daqiqalar to‘plamlari), abonent tomonidan joriy kalendar oyi davomida sarflab bo‘lingandan keyin, chiquvchi ovozli aloqani bloklab qo‘yadigan «Inspektor Ovoz» xizmatini taqdim qilamiz.\n" +
                                    "\n" +
                                    "Batafsil\n" +
                                    "\n" +
                                    "\n"
                        }
                    }
                }
            }
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
         * @return A new instance of fragment yangiliklarFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            yangiliklarFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}