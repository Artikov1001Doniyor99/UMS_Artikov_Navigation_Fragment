package com.artikov.modul_5_lesson_7_ums_real

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_tariflar.view.*
import kotlinx.android.synthetic.main.fragment_xizmatlar.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [xizmatlarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class xizmatlarFragment : Fragment() {
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

        root =  inflater.inflate(R.layout.fragment_xizmatlar, container, false)


        var value = arguments?.getString("D")



        if (value == "a"){
            root.xizmatlar_name.text  = "Balans"
            root.xizmatlar_text.text = " “USSD balans so‘rovi” – qo‘shimcha aloqa xizmati bo‘lib, Mobiuz abonentiga *100# USSD raqamini so‘rash orqali o‘z mobil telefonidagi abonent raqamining shaxsiy hisobidagi qoldiq holati to‘g‘risida ma’lumot olish imkonini beradi. , ovozli yoki Internet-trafikli tarif rejalarida - qolgan bepul daqiqalar yoki MB.\n" +
                    "\n" +
                    "Xalqaro rouming\n" +
                    "\n" +
                    "Abonent “USSD balans so‘rovi” xizmatidan Mobiuz tarmog‘ining butun qamrov zonasida va roumingda foydalanishi mumkin.\n" +
                    "\n" +
                    "Qancha?\n" +
                    "\n" +
                    "Uy tarmog'ida ham, roumingda ham * 100 # raqamlaridan foydalanganlik uchun to'lov tarif rejasi bo'yicha xizmatlar ko'rsatish qoidalariga muvofiq amalga oshirilmaydi.\n" +
                    "\n" +
                    "“USSD – Balans so‘rovi” xizmati orqali Mobiuz o‘qish uchun ixtiyoriy bo‘lgan qo‘shimcha telekommunikatsiya xizmatlari to‘g‘risidagi ma’lumotlarni abonentning shaxsiy kabinetidagi balans holati to‘g‘risidagi ma’lumotlar bilan xabarlarda joylashtirishi mumkin.  "
        }else{
            if(value == "b"){
                root.xizmatlar_name.text  = "Raqam"
                root.xizmatlar_text.text = "Xizmatdan jismoniy va yuridik shaxslar, yakka tartibdagi tadbirkorlar foydalanishlari mumkin.\n" +
                        "\n" +
                        "Xizmatdan xohlagan tarifni tanlagan holda foydalanish mumkin («Tourist SIM», «Tourist SIM Lite», «Tourist SIM+», «Tourist SIM Lite+» tariflari bundan mustasno).\n" +
                        "\n" +
                        "Tarif rejasi o‘zgartirilganda “Alohida toifadagi raqam haqini qismlarga bo‘lib to‘lash” xizmati saqlanib qoladi (qismlarga bo‘lib to‘lash davom etiladi).\n" +
                        "\n" +
                        "«Alohida toifadagi raqam haqini qismlarga bo‘lib to‘lash» xizmati bilan raqamni ulashning birinchi oy uchun to’lovi ulanish paytida (ulanish sanasidan qat’iy nazar) to’liqligicha to’lanadi.\n" +
                        "\n" +
                        "«Alohida toifadagi raqam haqini qismlarga bo‘lib to‘lash» xizmati bo‘yicha kelasi 9 oydagi haq har oyning birinchi sanasida yechib olinadi\n" +
                        "\n" +
                        "Abonent raqami bandlangan bo‘lsa, “Alohida toifadagi raqam haqini qismlarga bo‘lib to‘lash” xizmati bo‘yicha haq yechilmaydi.\n" +
                        "\n" +
                        "Agar “Alohida toifadagi raqam haqini qismlarga bo‘lib to‘lash” xizmati yordamida raqam ulangan bo‘lsa, lekin uning haqi oxirigacha to‘lanmagan bo‘lsa va abonent bilan shartnoma bekor qilinsa, raqam kompaniya tasarrufida qoladi, to‘langan mablag‘lar qaytarib berilmaydi.\n" +
                        "\n" +
                        "Agar abonent bir oydan ko‘proq muddat davomida bandlangan holatda bo‘lsa, “Alohida toifadagi raqam haqini qismlarga bo‘lib to‘lash” xizmatining amal qilish muddati huddis shuncha muddatga uzaytiriladi.\n" +
                        "\n" +
                        "Barcha narxlar QQS bilan ko‘rsatilgan.\n" +
                        "\n" +
                        "\n"
            }else{
                if(value == "c"){
                    root.xizmatlar_name.text  = "Internet balans"
                    root.xizmatlar_text.text = "Eslatmalar (tahrirlash)\n" +
                            "Faollashtirilgan Internet-paketdagi qolgan trafik hajmi haqida bilish uchun * 102 # USSD-buyrug'ini yuborishingiz yoki 616019 raqamiga 3 raqami bilan SMS-xabar yuborishingiz kerak.\n" +
                            "Internet-paketlardan foydalanish uchun, agar u ilgari o'chirilgan bo'lsa, Mobil Internet xizmatini faollashtirishingiz kerak.\n" +
                            "Kiritilgan trafikning tegishli hajmi 30 kunlik muddatga taqdim etiladi.\n" +
                            "Paketlarni xarid qilish orasidagi vaqt oralig'i kamida 10 daqiqa bo'lishi kerak.\n" +
                            "Ushbu aksiya doirasida xarid qilingan Internet-paketlar hajmi sarhisob qilinadi. Foydalanish muddati oxirgi sotib olingan paketning amal qilish muddati tugagunga qadar uzaytiriladi va sotib olingan kundan boshlab 30 kunni tashkil qiladi.\n" +
                            "Kiritilgan trafik tugagandan so'ng, trafik belgilangan tariflar bo'yicha to'lanadi.\n" +
                            "Agar tarif rejasi va Internet-paket ichida bir vaqtning o'zida foydalanilmagan megabaytlar to'plangan bo'lsa, birinchi navbatda tarif rejasidagi megabaytlar sarflanadi.\n" +
                            "Agar abonentda bir nechta paket turlari mavjud bo'lsa, trafik sarfi ustuvorligi:\n" +
                            "Kundalik Internet to'plami -> TP ichidagi trafik -> OnNet xizmati ichidagi trafik-> oylik Internet to'plami> boshqa paketlar\n" +
                            "00:00 dan 8:00 gacha internet-paketlardan foydalanish ustuvorligi:\n" +
                            "Tungi Internet to'plami -> Kunlik Internet to'plami -> Tarif rejasi ichidagi trafik -> OnNet trafik -> Oylik Internet to'plami>> boshqa paketlar.\n" +
                            "\n" +
                            "Xizmat rejasi o'zgartirilganda paket shartlari o'zgarmaydi.\n" +
                            "To‘plamlar abonent O‘zbekiston hududidagi “UMS” MChJ tarmog‘ida bo‘lgandagina amal qiladi.\n" +
                            "Narxlar QQS bilan ko'rsatilgan."
                }else{
                    if(value == "d"){
                        root.xizmatlar_name.text  = "Daqiqani tekshirish"
                        root.xizmatlar_text.text = "o'plam narxi to'plam faollashtirilganda yechib qolinadi.\n" +
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
                                "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljallangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                                "To'plamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                                "\n" +
                                "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                                "\n" +
                                "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                                "\n" +
                                "To'plam muvaffaqiyatli faollashganda bu haqida SMS-xabarnoma keladi;\n" +
                                "\n" +
                                "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati oxirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                                "\n" +
                                "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                                "\n" +
                                "Tarif rejasi o'zgartirilganda daqiqalar to'plamidan foydalanish shartlari o'zgarmaydi;\n" +
                                "\n" +
                                "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                                "\n" +
                                "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                                "\n" +
                                "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilangan tariflar bo'yicha narxlanadi;\n" +
                                "\n" +
                                "Daqiqalarning sarflanish tartibi:"
                    }else{
                        if (value == "e"){
                            root.xizmatlar_name.text  = "Sms"
                            root.xizmatlar_text.text = "Xabar almashish\n" +
                                    "chop etish versiyasi\n" +
                                    "Qisqa xabar yuborish uchun siz mobil telefoningizdagi ko'rsatmalarga amal qilishingiz kerak. Qabul qiluvchining raqamini to'liq xalqaro formatda ko'rsatish yaxshiroqdir, chunki u kiruvchi qo'ng'iroqlar uchun belgilanadi, ya'ni:\n" +
                                    "\n" +
                                    "+998 (hudud kodi) (abonent raqami) .\n" +
                                    "\n" +
                                    "Masalan, Mobiuz abonentiga SMS-xabar yuborish uchun - kod 97\n" +
                                    "\n" +
                                    "SMS markazi raqami (+998972690001) allaqachon SIM kartangiz xotirasida saqlangan\n" +
                                    "\n" +
                                    "Xabar turli xil kodlashlarda uzatilishi mumkin. Qurilmalarning aksariyati ingliz alifbosini qo'llab-quvvatlaydi. Ushbu alifbodagi maksimal xabar hajmi 160 belgidan iborat. Zamonaviy qurilmalar kirill harflarini ham o'z ichiga olgan emnikod kodlashni qo'llab-quvvatlaydi. Biroq, bu kodlash ko'proq \"achchiq\" va bitta xabar 70 dan ortiq belgini o'z ichiga olmaydi. Agar xabar kamida bitta kirillcha belgidan iborat bo'lsa, qurilmadan butun xabar emnikod kodlashda yuboriladi.\n" +
                                    "\n" +
                                    "Deyarli barcha zamonaviy telefonlar lotin alifbosida 160 belgidan yoki kirill alifbosida 70 belgidan uzunroq xabarlar yaratish imkonini beradi, biroq uzatish vaqtida u mos ravishda 160 yoki 70 belgidan iborat bir nechta xabarlarga bo‘linadi. Va siz bir nechta xabarlar uchun hisob-faktura olasiz.\n" +
                                    "\n" +
                                    "Xalqaro SMS\n" +
                                    "1 ta xalqaro chiquvchi SMS narxi 1000 so‘m.\n" +
                                    "\n" +
                                    "Ayni paytda Mobiuz abonentlariga quyidagi xorijiy aloqa operatorlari abonentlari bilan xalqaro SMS-xabar almashish imkoniyati berilgan:"
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
         * @return A new instance of fragment xizmatlarFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            xizmatlarFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}