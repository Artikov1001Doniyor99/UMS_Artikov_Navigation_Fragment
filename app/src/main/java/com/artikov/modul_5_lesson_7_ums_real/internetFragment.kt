package com.artikov.modul_5_lesson_7_ums_real

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_tariflar.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [internetFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class internetFragment : Fragment() {
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

        root =  inflater.inflate(R.layout.fragment_internet, container, false)

        var value = arguments?.getString("D")



        if (value == "a"){
            root.tariflar_name.text  = "300 mb"
            root.tariflar_text.text = "Faollashtirilgan Internet-to‘plamning holati va qoldig‘ini bilish uchun *102# USSD-buyrug‘idan foydalanish yoki 613019 raqamiga 3 ni yuborish kerak.\n" +
                    "\n" +
                    "Shartlar:\n" +
                    "Internet-to`plamlardan foydalanish uchun “Mobil Internet” xizmati yoqilgan bo`lishi shart.\n" +
                    "To`plamga kiritilgan trafik hajmi to`plam faollashtirilgan kundan boshlab (abonent raqami bandlangan/bandlanmaganligidan qat’iy nazar) 30kalendar kuni davomida amal qiladi.\n" +
                    "Bir necha to`plamlarni xarid qilish oralig‘idagi vaqt kamida 10 daqiqani tashkil etishi kerak.\n" +
                    "Internet-to‘plamlarni xarid qilgandan so‘ng ular to‘g‘ri narxlanishi uchun telefon planshet yoki 3G modemni o‘chirib-yoqish kerak.\n" +
                    "Ushbu aksiya bo‘yicha xarid qilingan barcha to`plamlarning hajmi qo`shiladi, foydalanish muddati esa ohirgi xarid qilingan to`plam muddatigicha uzaytiriladi va 30 kunni tashkil etadi.\n" +
                    "Ushbu aksiya bo‘yicha xarid qilingan Internet-to‘plamlar va avvalgi “MEGAbaytlar kuymaydi!” aksiya bo‘yicha berilgan megabaytlar hajmi qo‘shilmaydi.\n" +
                    "Belgilangan trafik yakunlanganidan so‘ng yoki to`plam muddati tugaganidan keyin trafik belgilangan narxlar bo`yicha narxlanadi.\n" +
                    " Abonentda bir necha turdagi Internet-to‘plamlar mavjud bo‘lsa, ularni sarflanish tartibi quyidagicha bo‘ladi:\n" +
                    "Kunlik to‘plam - > TR bo‘yicha trafik - > OnNet xizmati bo‘yicha trafik - > Oylik Internet-to‘plam - > Kuymaydigan to‘plam - > Boshqa Internet-opsiyalar.\n" +
                    "\n" +
                    "Tarif rejasi o`zgartirilganda to`plamlarni taqdim etilish shartlari o`zgarmaydi.\n" +
                    "Abonent O`zbekiston hududida, “UMS” MChJ tarmog`ida bo`lgandagina to`plamlar amal qiladi."
        }else{
            if(value == "b"){
                root.tariflar_name.text  = "500 mb"
                root.tariflar_text.text = "Faollashtirilgan Internet-to‘plamning holati va qoldig‘ini bilish uchun *102# USSD-buyrug‘idan foydalanish yoki 613019 raqamiga 3 ni yuborish kerak.\n" +
                        "\n" +
                        "Shartlar:\n" +
                        "Internet-to`plamlardan foydalanish uchun “Mobil Internet” xizmati yoqilgan bo`lishi shart.\n" +
                        "To`plamga kiritilgan trafik hajmi to`plam faollashtirilgan kundan boshlab (abonent raqami bandlangan/bandlanmaganligidan qat’iy nazar) 30kalendar kuni davomida amal qiladi.\n" +
                        "Bir necha to`plamlarni xarid qilish oralig‘idagi vaqt kamida 10 daqiqani tashkil etishi kerak.\n" +
                        "Internet-to‘plamlarni xarid qilgandan so‘ng ular to‘g‘ri narxlanishi uchun telefon planshet yoki 3G modemni o‘chirib-yoqish kerak.\n" +
                        "Ushbu aksiya bo‘yicha xarid qilingan barcha to`plamlarning hajmi qo`shiladi, foydalanish muddati esa ohirgi xarid qilingan to`plam muddatigicha uzaytiriladi va 30 kunni tashkil etadi.\n" +
                        "Ushbu aksiya bo‘yicha xarid qilingan Internet-to‘plamlar va avvalgi “MEGAbaytlar kuymaydi!” aksiya bo‘yicha berilgan megabaytlar hajmi qo‘shilmaydi.\n" +
                        "Belgilangan trafik yakunlanganidan so‘ng yoki to`plam muddati tugaganidan keyin trafik belgilangan narxlar bo`yicha narxlanadi.\n" +
                        " Abonentda bir necha turdagi Internet-to‘plamlar mavjud bo‘lsa, ularni sarflanish tartibi quyidagicha bo‘ladi:\n" +
                        "Kunlik to‘plam - > TR bo‘yicha trafik - > OnNet xizmati bo‘yicha trafik - > Oylik Internet-to‘plam - > Kuymaydigan to‘plam - > Boshqa Internet-opsiyalar.\n" +
                        "\n" +
                        "Tarif rejasi o`zgartirilganda to`plamlarni taqdim etilish shartlari o`zgarmaydi.\n" +
                        "Abonent O`zbekiston hududida, “UMS” MChJ tarmog`ida bo`lgandagina to`plamlar amal qiladi."
            }else{
                if(value == "c"){
                    root.tariflar_name.text  = "1000 mb"
                    root.tariflar_text.text = "Faollashtirilgan Internet-to‘plamning holati va qoldig‘ini bilish uchun *102# USSD-buyrug‘idan foydalanish yoki 613019 raqamiga 3 ni yuborish kerak.\n" +
                            "\n" +
                            "Shartlar:\n" +
                            "Internet-to`plamlardan foydalanish uchun “Mobil Internet” xizmati yoqilgan bo`lishi shart.\n" +
                            "To`plamga kiritilgan trafik hajmi to`plam faollashtirilgan kundan boshlab (abonent raqami bandlangan/bandlanmaganligidan qat’iy nazar) 30kalendar kuni davomida amal qiladi.\n" +
                            "Bir necha to`plamlarni xarid qilish oralig‘idagi vaqt kamida 10 daqiqani tashkil etishi kerak.\n" +
                            "Internet-to‘plamlarni xarid qilgandan so‘ng ular to‘g‘ri narxlanishi uchun telefon planshet yoki 3G modemni o‘chirib-yoqish kerak.\n" +
                            "Ushbu aksiya bo‘yicha xarid qilingan barcha to`plamlarning hajmi qo`shiladi, foydalanish muddati esa ohirgi xarid qilingan to`plam muddatigicha uzaytiriladi va 30 kunni tashkil etadi.\n" +
                            "Ushbu aksiya bo‘yicha xarid qilingan Internet-to‘plamlar va avvalgi “MEGAbaytlar kuymaydi!” aksiya bo‘yicha berilgan megabaytlar hajmi qo‘shilmaydi.\n" +
                            "Belgilangan trafik yakunlanganidan so‘ng yoki to`plam muddati tugaganidan keyin trafik belgilangan narxlar bo`yicha narxlanadi.\n" +
                            " Abonentda bir necha turdagi Internet-to‘plamlar mavjud bo‘lsa, ularni sarflanish tartibi quyidagicha bo‘ladi:\n" +
                            "Kunlik to‘plam - > TR bo‘yicha trafik - > OnNet xizmati bo‘yicha trafik - > Oylik Internet-to‘plam - > Kuymaydigan to‘plam - > Boshqa Internet-opsiyalar.\n" +
                            "\n" +
                            "Tarif rejasi o`zgartirilganda to`plamlarni taqdim etilish shartlari o`zgarmaydi.\n" +
                            "Abonent O`zbekiston hududida, “UMS” MChJ tarmog`ida bo`lgandagina to`plamlar amal qiladi."
                }else{
                    if(value == "d"){
                        root.tariflar_name.text  = "2000 mb"
                        root.tariflar_text.text = "Faollashtirilgan Internet-to‘plamning holati va qoldig‘ini bilish uchun *102# USSD-buyrug‘idan foydalanish yoki 613019 raqamiga 3 ni yuborish kerak.\n" +
                                "\n" +
                                "Shartlar:\n" +
                                "Internet-to`plamlardan foydalanish uchun “Mobil Internet” xizmati yoqilgan bo`lishi shart.\n" +
                                "To`plamga kiritilgan trafik hajmi to`plam faollashtirilgan kundan boshlab (abonent raqami bandlangan/bandlanmaganligidan qat’iy nazar) 30kalendar kuni davomida amal qiladi.\n" +
                                "Bir necha to`plamlarni xarid qilish oralig‘idagi vaqt kamida 10 daqiqani tashkil etishi kerak.\n" +
                                "Internet-to‘plamlarni xarid qilgandan so‘ng ular to‘g‘ri narxlanishi uchun telefon planshet yoki 3G modemni o‘chirib-yoqish kerak.\n" +
                                "Ushbu aksiya bo‘yicha xarid qilingan barcha to`plamlarning hajmi qo`shiladi, foydalanish muddati esa ohirgi xarid qilingan to`plam muddatigicha uzaytiriladi va 30 kunni tashkil etadi.\n" +
                                "Ushbu aksiya bo‘yicha xarid qilingan Internet-to‘plamlar va avvalgi “MEGAbaytlar kuymaydi!” aksiya bo‘yicha berilgan megabaytlar hajmi qo‘shilmaydi.\n" +
                                "Belgilangan trafik yakunlanganidan so‘ng yoki to`plam muddati tugaganidan keyin trafik belgilangan narxlar bo`yicha narxlanadi.\n" +
                                " Abonentda bir necha turdagi Internet-to‘plamlar mavjud bo‘lsa, ularni sarflanish tartibi quyidagicha bo‘ladi:\n" +
                                "Kunlik to‘plam - > TR bo‘yicha trafik - > OnNet xizmati bo‘yicha trafik - > Oylik Internet-to‘plam - > Kuymaydigan to‘plam - > Boshqa Internet-opsiyalar.\n" +
                                "\n" +
                                "Tarif rejasi o`zgartirilganda to`plamlarni taqdim etilish shartlari o`zgarmaydi.\n" +
                                "Abonent O`zbekiston hududida, “UMS” MChJ tarmog`ida bo`lgandagina to`plamlar amal qiladi."
                    }else{
                        if (value == "e"){
                            root.tariflar_name.text  = "2500 mb"
                            root.tariflar_text.text = "Faollashtirilgan Internet-to‘plamning holati va qoldig‘ini bilish uchun *102# USSD-buyrug‘idan foydalanish yoki 613019 raqamiga 3 ni yuborish kerak.\n" +
                                    "\n" +
                                    "Shartlar:\n" +
                                    "Internet-to`plamlardan foydalanish uchun “Mobil Internet” xizmati yoqilgan bo`lishi shart.\n" +
                                    "To`plamga kiritilgan trafik hajmi to`plam faollashtirilgan kundan boshlab (abonent raqami bandlangan/bandlanmaganligidan qat’iy nazar) 30kalendar kuni davomida amal qiladi.\n" +
                                    "Bir necha to`plamlarni xarid qilish oralig‘idagi vaqt kamida 10 daqiqani tashkil etishi kerak.\n" +
                                    "Internet-to‘plamlarni xarid qilgandan so‘ng ular to‘g‘ri narxlanishi uchun telefon planshet yoki 3G modemni o‘chirib-yoqish kerak.\n" +
                                    "Ushbu aksiya bo‘yicha xarid qilingan barcha to`plamlarning hajmi qo`shiladi, foydalanish muddati esa ohirgi xarid qilingan to`plam muddatigicha uzaytiriladi va 30 kunni tashkil etadi.\n" +
                                    "Ushbu aksiya bo‘yicha xarid qilingan Internet-to‘plamlar va avvalgi “MEGAbaytlar kuymaydi!” aksiya bo‘yicha berilgan megabaytlar hajmi qo‘shilmaydi.\n" +
                                    "Belgilangan trafik yakunlanganidan so‘ng yoki to`plam muddati tugaganidan keyin trafik belgilangan narxlar bo`yicha narxlanadi.\n" +
                                    " Abonentda bir necha turdagi Internet-to‘plamlar mavjud bo‘lsa, ularni sarflanish tartibi quyidagicha bo‘ladi:\n" +
                                    "Kunlik to‘plam - > TR bo‘yicha trafik - > OnNet xizmati bo‘yicha trafik - > Oylik Internet-to‘plam - > Kuymaydigan to‘plam - > Boshqa Internet-opsiyalar.\n" +
                                    "\n" +
                                    "Tarif rejasi o`zgartirilganda to`plamlarni taqdim etilish shartlari o`zgarmaydi.\n" +
                                    "Abonent O`zbekiston hududida, “UMS” MChJ tarmog`ida bo`lgandagina to`plamlar amal qiladi."
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
         * @return A new instance of fragment internetFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            internetFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}