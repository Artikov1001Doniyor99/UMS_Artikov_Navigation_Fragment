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
 * Use the [daqiqalarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class daqiqalarFragment : Fragment() {
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

        root =  inflater.inflate(R.layout.fragment_daqiqalar, container, false)

        var value = arguments?.getString("D")



        if (value == "a"){
            root.tariflar_name.text  = "60 daqiqa"
            root.tariflar_text.text = "Endi Mobiuz abonentlari 60, 120, 180, 300, 900, 1200, 1800 daqiqalik to‘plamlarni faollashtirishlari mumkin! To‘plamalarga kiritilgan daqiqalardan taqmoq ichida, O‘zbekistonning boshqa mobil operatorlari abonentlariga va shahar raqamlariga qo‘ng‘iroqlar uchun foydalanish mumkin." +
                    "To'plam narxi to'plam faollashtirilganda yechib qolinadi.\n" +
                    "\n" +
                    "To'plam amal qilish muddati – faollashtirilgan kundan boshlab 30 kalendar kuni.\n" +
                    "\n" +
                    "Faollashtirilgan to´plamda daqiqalar qoldig´ini bilish:\n" +
                    "\n" +
                    "USSD-buyruq: *103#\n" +
                    "\n" +
                    "SMS-yordamchi: 616020 raqamiga 3.\n" +
                    "\n" +
                    "Izohlar:\n" +
                    "\n" +
                    "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                    "To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                    "\n" +
                    "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                    "\n" +
                    "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                    "\n" +
                    "To'plam faollashgani haqida SMS-xabarnoma keladi;\n" +
                    "\n" +
                    "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                    "\n" +
                    "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                    "\n" +
                    "Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\n" +
                    "\n" +
                    "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\n" +
                    "\n" +
                    "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                    "\n" +
                    "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\n" +
                    "\n" +
                    "Daqiqalarning sarflanish tartibi:\n" +
                    "\n" +
                    "Tarif rejasi bo‘yicha trafik>Xarid qilingan daqiqalar to‘plami trafigi\n" +
                    "\n" +
                    "Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\n" +
                    "“Gap ko‘p” xizmati (faqat tarmoq ichidagi qo‘ng‘iroqlarga)>7 kunlik Multi-to‘plam trafigi>Hisob to‘ldirilganlik uchun bonus>15 kunlik Multi-to‘plam trafigi>Tarif rejasi bo‘yicha trafik>Xarid qilingan daqiqalar to‘plami bo‘yicha trafik.\n" +
                    "\n" +
                    "«Maxi New», «Ultra», «Maxi Year», «Ultra Year», “Premial”, “Premial Yillik”, “Ideal”, “Ideal Yillik” tarif rejalarida abonent to‘loviga kiritilgan daqiqalar yakunlangandan keyin tarmoq ichidagi qo‘ng‘iroqlar “Daqiqalar to‘plami”dan sarflanmaydi.\n" +
                    "\n" +
                    "Narxlar barcha soliqlarni inobarga olgan ko'rsatilgan"
        }else{
            if(value == "b"){
                root.tariflar_name.text  = "120 daqiqa"
                root.tariflar_text.text = "Endi Mobiuz abonentlari 60, 120, 180, 300, 900, 1200, 1800 daqiqalik to‘plamlarni faollashtirishlari mumkin! To‘plamalarga kiritilgan daqiqalardan taqmoq ichida, O‘zbekistonning boshqa mobil operatorlari abonentlariga va shahar raqamlariga qo‘ng‘iroqlar uchun foydalanish mumkin.\" +\n" +
                        "                    \"To'plam narxi to'plam faollashtirilganda yechib qolinadi.\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"To'plam amal qilish muddati – faollashtirilgan kundan boshlab 30 kalendar kuni.\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Faollashtirilgan to´plamda daqiqalar qoldig´ini bilish:\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"USSD-buyruq: *103#\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"SMS-yordamchi: 616020 raqamiga 3.\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Izohlar:\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\\n\" +\n" +
                        "                    \"To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"To'plam faollashgani haqida SMS-xabarnoma keladi;\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \\\"UMS\\\" MChJ tarmog'ida bo'lgandagina amal qiladi;\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Daqiqalarning sarflanish tartibi:\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Tarif rejasi bo‘yicha trafik>Xarid qilingan daqiqalar to‘plami trafigi\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\\n\" +\n" +
                        "                    \"“Gap ko‘p” xizmati (faqat tarmoq ichidagi qo‘ng‘iroqlarga)>7 kunlik Multi-to‘plam trafigi>Hisob to‘ldirilganlik uchun bonus>15 kunlik Multi-to‘plam trafigi>Tarif rejasi bo‘yicha trafik>Xarid qilingan daqiqalar to‘plami bo‘yicha trafik.\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"«Maxi New», «Ultra», «Maxi Year», «Ultra Year», “Premial”, “Premial Yillik”, “Ideal”, “Ideal Yillik” tarif rejalarida abonent to‘loviga kiritilgan daqiqalar yakunlangandan keyin tarmoq ichidagi qo‘ng‘iroqlar “Daqiqalar to‘plami”dan sarflanmaydi.\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Narxlar barcha soliqlarni inobarga olgan ko'rsatilgan"
            }else{
                if(value == "c"){
                    root.tariflar_name.text  = "180 daqiqa"
                    root.tariflar_text.text = "Endi Mobiuz abonentlari 60, 120, 180, 300, 900, 1200, 1800 daqiqalik to‘plamlarni faollashtirishlari mumkin! To‘plamalarga kiritilgan daqiqalardan taqmoq ichida, O‘zbekistonning boshqa mobil operatorlari abonentlariga va shahar raqamlariga qo‘ng‘iroqlar uchun foydalanish mumkin.\" +\n" +
                            "                    \"To'plam narxi to'plam faollashtirilganda yechib qolinadi.\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"To'plam amal qilish muddati – faollashtirilgan kundan boshlab 30 kalendar kuni.\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"Faollashtirilgan to´plamda daqiqalar qoldig´ini bilish:\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"USSD-buyruq: *103#\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"SMS-yordamchi: 616020 raqamiga 3.\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"Izohlar:\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\\n\" +\n" +
                            "                    \"To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"To'plam faollashgani haqida SMS-xabarnoma keladi;\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \\\"UMS\\\" MChJ tarmog'ida bo'lgandagina amal qiladi;\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"Daqiqalarning sarflanish tartibi:\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"Tarif rejasi bo‘yicha trafik>Xarid qilingan daqiqalar to‘plami trafigi\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\\n\" +\n" +
                            "                    \"“Gap ko‘p” xizmati (faqat tarmoq ichidagi qo‘ng‘iroqlarga)>7 kunlik Multi-to‘plam trafigi>Hisob to‘ldirilganlik uchun bonus>15 kunlik Multi-to‘plam trafigi>Tarif rejasi bo‘yicha trafik>Xarid qilingan daqiqalar to‘plami bo‘yicha trafik.\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"«Maxi New», «Ultra», «Maxi Year», «Ultra Year», “Premial”, “Premial Yillik”, “Ideal”, “Ideal Yillik” tarif rejalarida abonent to‘loviga kiritilgan daqiqalar yakunlangandan keyin tarmoq ichidagi qo‘ng‘iroqlar “Daqiqalar to‘plami”dan sarflanmaydi.\\n\" +\n" +
                            "                    \"\\n\" +\n" +
                            "                    \"Narxlar barcha soliqlarni inobarga olgan ko'rsatilgan"
                }else{
                    if(value == "d"){
                        root.tariflar_name.text  = "300 daqiqa"
                        root.tariflar_text.text = "Endi Mobiuz abonentlari 60, 120, 180, 300, 900, 1200, 1800 daqiqalik to‘plamlarni faollashtirishlari mumkin! To‘plamalarga kiritilgan daqiqalardan taqmoq ichida, O‘zbekistonning boshqa mobil operatorlari abonentlariga va shahar raqamlariga qo‘ng‘iroqlar uchun foydalanish mumkin.\" +\n" +
                                "                    \"To'plam narxi to'plam faollashtirilganda yechib qolinadi.\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"To'plam amal qilish muddati – faollashtirilgan kundan boshlab 30 kalendar kuni.\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"Faollashtirilgan to´plamda daqiqalar qoldig´ini bilish:\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"USSD-buyruq: *103#\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"SMS-yordamchi: 616020 raqamiga 3.\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"Izohlar:\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\\n\" +\n" +
                                "                    \"To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"To'plam faollashgani haqida SMS-xabarnoma keladi;\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \\\"UMS\\\" MChJ tarmog'ida bo'lgandagina amal qiladi;\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"Daqiqalarning sarflanish tartibi:\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"Tarif rejasi bo‘yicha trafik>Xarid qilingan daqiqalar to‘plami trafigi\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\\n\" +\n" +
                                "                    \"“Gap ko‘p” xizmati (faqat tarmoq ichidagi qo‘ng‘iroqlarga)>7 kunlik Multi-to‘plam trafigi>Hisob to‘ldirilganlik uchun bonus>15 kunlik Multi-to‘plam trafigi>Tarif rejasi bo‘yicha trafik>Xarid qilingan daqiqalar to‘plami bo‘yicha trafik.\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"«Maxi New», «Ultra», «Maxi Year», «Ultra Year», “Premial”, “Premial Yillik”, “Ideal”, “Ideal Yillik” tarif rejalarida abonent to‘loviga kiritilgan daqiqalar yakunlangandan keyin tarmoq ichidagi qo‘ng‘iroqlar “Daqiqalar to‘plami”dan sarflanmaydi.\\n\" +\n" +
                                "                    \"\\n\" +\n" +
                                "                    \"Narxlar barcha soliqlarni inobarga olgan ko'rsatilgan"
                    }else{
                        if (value == "e"){
                            root.tariflar_name.text  = "900 daqiqa"
                            root.tariflar_text.text = "Endi Mobiuz abonentlari 60, 120, 180, 300, 900, 1200, 1800 daqiqalik to‘plamlarni faollashtirishlari mumkin! To‘plamalarga kiritilgan daqiqalardan taqmoq ichida, O‘zbekistonning boshqa mobil operatorlari abonentlariga va shahar raqamlariga qo‘ng‘iroqlar uchun foydalanish mumkin.\" +\n" +
                                    "                    \"To'plam narxi to'plam faollashtirilganda yechib qolinadi.\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"To'plam amal qilish muddati – faollashtirilgan kundan boshlab 30 kalendar kuni.\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"Faollashtirilgan to´plamda daqiqalar qoldig´ini bilish:\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"USSD-buyruq: *103#\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"SMS-yordamchi: 616020 raqamiga 3.\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"Izohlar:\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljalangan tarif rejalarida faollashtirish imkoniyati bor;\\n\" +\n" +
                                    "                    \"To'lpamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"To'plam faollashgani haqida SMS-xabarnoma keladi;\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati ohirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"Tarif rejasi o'zgartirilganda daqiqalar to'plami saqlanib qoladi;\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha qo'ng'iroqlar uchun mo'ljallangan;\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \\\"UMS\\\" MChJ tarmog'ida bo'lgandagina amal qiladi;\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilngan tariflar bo'yicha narxlanadi;\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"Daqiqalarning sarflanish tartibi:\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"Tarif rejasi bo‘yicha trafik>Xarid qilingan daqiqalar to‘plami trafigi\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\\n\" +\n" +
                                    "                    \"“Gap ko‘p” xizmati (faqat tarmoq ichidagi qo‘ng‘iroqlarga)>7 kunlik Multi-to‘plam trafigi>Hisob to‘ldirilganlik uchun bonus>15 kunlik Multi-to‘plam trafigi>Tarif rejasi bo‘yicha trafik>Xarid qilingan daqiqalar to‘plami bo‘yicha trafik.\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"«Maxi New», «Ultra», «Maxi Year», «Ultra Year», “Premial”, “Premial Yillik”, “Ideal”, “Ideal Yillik” tarif rejalarida abonent to‘loviga kiritilgan daqiqalar yakunlangandan keyin tarmoq ichidagi qo‘ng‘iroqlar “Daqiqalar to‘plami”dan sarflanmaydi.\\n\" +\n" +
                                    "                    \"\\n\" +\n" +
                                    "                    \"Narxlar barcha soliqlarni inobarga olgan ko'rsatilgan"
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
         * @return A new instance of fragment daqiqalarFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            daqiqalarFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}