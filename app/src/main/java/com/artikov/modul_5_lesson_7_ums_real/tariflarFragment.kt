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
 * Use the [tariflarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class tariflarFragment : Fragment() {
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

        root =  inflater.inflate(R.layout.fragment_tariflar, container, false)

        var value = arguments?.getString("D")



        if (value == "a"){
            root.tariflar_name.text  = "Mobi 20"
            root.tariflar_text.text = "Qo'ng'iroqlar daqiqasiga to'lanadi.\n" +
                    "\n" +
                    "Barcha chiquvchi qo'ng'iroqlar 1 soniyadan to'lanadi. Va ular daqiqalargacha yaxlitlanadi.\n" +
                    "\n" +
                    "Internet-trafik kvantini yaxlitlash 1KB\n" +
                    "\n" +
                    "“Mobi 20” tarif rejasida “Gap ko'p” xizmati mavjud. Ulanish narxi 10 000 so'm.\n" +
                    "\n" +
                    "Yangi ulanish yoki ushbu tarif rejasiga o‘tishda abonent to‘lovi darhol yechib olinadi, abonent to‘loviga kiritilgan daqiqalar, MB va SMSlar to‘plamlari hisobi to‘liq hajmda chiqariladi.\n" +
                    "\n" +
                    "Ushbu tarifga o‘tish uchun abonent balansida kamida 24 210,35 so‘m (tarif rejasini o‘zgartirish narxi 4210,35 so‘m miqdorida) yoki 40 000 so‘m (so‘mdagi tarif rejasini o‘zgartirish xarajatlari hisobga olingan holda) bo‘lishi kerak. 20 000 so'm). Balans yuqoridagi summalardan kamroq bo'lsa, o'tish mumkin emas.\n" +
                    "\n" +
                    "Abonent to‘lovi yuqori bo‘lgan tarif rejalaridan “Mobi 20” tarif rejasiga o‘tish narxi – 20 000 so‘m;\n" +
                    "\n" +
                    "Abonent to‘lovi past bo‘lgan tarif rejalaridan “Mobi 20” tarif rejasiga o‘tish narxi – 4210,35 so‘m\n" +
                    "\n" +
                    "\"Mobi 20\" tarif rejasidan / tarif rejalaridan / tarif rejalariga o'tish narxi: Faxriy, Mobiuz bilan birga - 0.\n" +
                    "\n" +
                    "“Mobi 20” tarif rejasidan “Oson”, “Terminal Yillik” tarif rejalariga o‘tish mumkin emas.\n" +
                    "\n" +
                    "Tarif rejasini o'zgartirganda foydalanilmagan daqiqalar, megabaytlar va SMS xabarlar  o'tkaziladi va yig'iladi .\n" +
                    "\n" +
                    "Nol yoki manfiy balansga erishilganda, raqam qisman bloklanadi (qisman blokirovkada, chiquvchi daqiqalar, SMS va Internet bloklanadi), bunda abonent \"Onlayn\" xizmati shartlariga muvofiq kiruvchi qo'ng'iroqlar va SMSlarni qabul qilishi mumkin. ."
        }else{
            if(value == "b"){
                root.tariflar_name.text  = "Mobi 25"
                root.tariflar_text.text = "Qo'ng'iroqlar daqiqasiga to'lanadi.\n" +
                        "Barcha chiquvchi qo'ng'iroqlar 1 soniyadan to'lanadi. Va ular daqiqalargacha yaxlitlanadi.\n" +
                        "\n" +
                        "Internet-trafik kvantini yaxlitlash 1KB\n" +
                        "\n" +
                        "“Mobi 25” tarif rejasida “Gap ko'p” xizmati mavjud. Ulanish narxi 10 000 so'm.\n" +
                        "Yangi ulanish yoki ushbu tarif rejasiga o‘tishda abonent to‘lovi darhol yechib olinadi, abonent to‘loviga kiritilgan daqiqalar, MB va SMSlar to‘plamlari hisobi to‘liq hajmda chiqariladi;\n" +
                        "\n" +
                        "Ushbu tarifga o‘tish uchun abonent balansi kamida 29 210,35 so‘m (4210,35 so‘m TP o‘zgartirish narxini hisobga olgan holda) yoki 35 000 so‘m (10 000 so‘m miqdoridagi TP o‘zgartirish narxini hisobga olgan holda) bo‘lishi kerak. so‘m). Balans yuqoridagi summalardan kamroq bo'lsa, o'tish mumkin emas.\n" +
                        "\"Mobi 25\" tarif rejasidan / tarif rejalaridan / tarif rejalariga o'tish narxi: Faxriy, Mobiuz bilan birga - 0 so'm.\n" +
                        "Abonent toʻlovi yuqori boʻlgan tarif rejalaridan “Mobi 25” TP ga oʻtish narxi – 10 000 soʻm\n" +
                        "Abonent to‘lovi past bo‘lgan tarif rejalaridan “Mobi 25” TP ga o‘tish narxi – 4210,35 so‘m\n" +
                        "Tarif rejasini o'zgartirganda foydalanilmagan daqiqalar, megabaytlar va SMS xabarlar  o'tkaziladi va yig'iladi .\n" +
                        "Nol yoki manfiy balansga erishilganda, raqam qisman bloklanadi (qisman blokirovkada, chiquvchi daqiqalar, SMS va Internet bloklanadi), bunda abonent \"Onlayn\" xizmati shartlariga muvofiq kiruvchi qo'ng'iroqlar va SMSlarni qabul qilishi mumkin. ."
            }else{
                if(value == "c"){
                    root.tariflar_name.text  = "Mobi 30+"
                    root.tariflar_text.text = "\t\n" +
                            "Qo'ng'iroqlar daqiqasiga to'lanadi.\n" +
                            "\n" +
                            "Barcha chiquvchi qo'ng'iroqlar 1 soniyadan to'lanadi. Va ular daqiqalargacha yaxlitlanadi.\n" +
                            "\n" +
                            "Internet-trafik kvantini yaxlitlash 1KB\n" +
                            "\n" +
                            "“Mobi 30+” tarif rejasida “Gap ko'p” xizmati mavjud. Xizmatni ulash narxi 10 000 so'm.\n" +
                            "Yangi ulanish yoki ushbu tarif rejasiga o‘tishda abonent to‘lovi darhol yechib olinadi, abonent to‘loviga kiritilgan daqiqalar, MB va SMSlar to‘plamlari hisobi to‘liq hajmda chiqariladi.\n" +
                            "\n" +
                            "Ushbu tarifga o‘tish uchun abonent balansida kamida 34 210,35 so‘m (tarif rejasini o‘zgartirish narxi 4210,35 so‘m miqdorida) yoki 40 000 so‘m (so‘mdagi tarif rejasini o‘zgartirish xarajatlari hisobga olingan holda) bo‘lishi kerak. 10 000 so'm). Balans yuqoridagi summalardan kamroq bo'lsa, o'tish mumkin emas.\n" +
                            "\n" +
                            "“Mobi 30” tarif rejasidan “Mobi 30+” tarif rejasiga o‘tish narxi – 0 so‘m.\n" +
                            "\"Mobi 30+\" tarif rejasidan / tarif rejalaridan / tarif rejalariga o'tish narxi: Faxriy, MOBIUZ bilan birga - 0.\n" +
                            "Terminal, Chilla Lite, O'qituvchi 1, Mobi 20, Fidokor tarif rejalariga o'tish narxi - 10000 so'm\n" +
                            "\n" +
                            "Oʻqituvchi 2, Fidokor+, Gap yoʻq, Gap yoʻq Pro, Mobi 40, Mobi 50, Mobi 70, Mobi 90, Mobi 110, Mobi 150, Mobi 50 Yillik, Mobi tarif rejalariga oʻtish narxi 70 Yillik, Mobi 90 Yillik, Mobi 110 Yillik, Mobi 150 Yillik - 4210,35 so'm.\n" +
                            "\n" +
                            "Terminal, Fidokor, Talaba, Maktab, Chilla Lite, Omad Plus, O'qituvchi1, O'qituvchi 2, Mobi 20, tarif rejalaridan “Mobi 30+” tarif rejasiga o'tish narxi - 4210,35 so'm.\n" +
                            "“Mobi 30+” tarif rejasiga o‘tish narxi, tarif rejalaridan – Gap yo‘q, Gap yo‘q Pro, Talaba+, Mobi 40, Mobi 50, Mobi 70, Fidokor+, Mobi 90, Mobi 110, Mobi 150, Mobi 50 Yillik, Mobi 70 Yillik, Mobi 90 Yillik, Mobi 110 Yillik, Mobi 150 Yillik - 10 000 so'm."
                }else{
                    if(value == "d"){
                        root.tariflar_name.text  = "Mobi 40"
                        root.tariflar_text.text = "\t\n" +
                                "Qo'ng'iroqlar daqiqasiga to'lanadi.\n" +
                                "\n" +
                                "Barcha chiquvchi qo'ng'iroqlar 1 soniyadan to'lanadi. Va ular daqiqalargacha yaxlitlanadi.\n" +
                                "\n" +
                                "Internet-trafik kvantini yaxlitlash 1KB\n" +
                                "\n" +
                                "Yangi ulanish yoki ushbu tarif rejasiga o‘tishda abonent to‘lovi darhol yechib olinadi, abonent to‘loviga kiritilgan daqiqalar, MB va SMSlar to‘plamlari hisobi to‘liq hajmda chiqariladi.\n" +
                                "\n" +
                                "Ushbu tarifga o‘tish uchun abonent balansida kamida 44 210,35 so‘m (tarif rejasini o‘zgartirish narxi 4210,35 so‘m miqdorida) yoki 50 000 so‘m (so‘mdagi tarif rejasini o‘zgartirish xarajatlari hisobga olingan holda) bo‘lishi kerak. 10 000 so'm). Balans yuqoridagi summalardan kamroq bo'lsa, o'tish mumkin emas.\n" +
                                "\n" +
                                "Abonent to‘lovi yuqori bo‘lgan tarif rejalaridan “Mobi 40” tarif rejasiga o‘tish narxi – 10 000 so‘m.\n" +
                                "\n" +
                                "Abonent to‘lovi pastroq bo‘lgan tarif rejalaridan “Mobi 40” tarif rejasiga o‘tish narxi – 4210,35 so‘m.\n" +
                                "\n" +
                                "\"Mobi 40\" tarif rejasidan / tarif rejalaridan / tarif rejalariga o'tish narxi: Faxriy, Mobiuz bilan birga - 0.\n" +
                                "\n" +
                                "“Mobi 40” tarif rejasidan “Oson”, “Terminal Yillik” tarif rejalariga o‘tish mumkin emas.\n" +
                                "\n" +
                                "Tarif rejasini o'zgartirganda foydalanilmagan daqiqalar, megabaytlar va SMS xabarlar  o'tkaziladi va yig'iladi .\n" +
                                "\n" +
                                "Nol yoki manfiy balansga erishilganda, raqam qisman bloklanadi (qisman blokirovkada, chiquvchi daqiqalar, SMS va Internet bloklanadi), bunda abonent \"Onlayn\" xizmati shartlariga muvofiq kiruvchi qo'ng'iroqlar va SMSlarni qabul qilishi mumkin. .   \n" +
                                "\n" +
                                "Bloklangan holatda abonent to'lovi olinmaydi;\n" +
                                "\n" +
                                "Abonent to‘lovini oylik undirish rejimida hisoblagichlar 1 kalendar oyga to‘liq chiqariladi.\n" +
                                "\n" +
                                "Agar abonent to‘lovi yechib olingan vaqtga kelib, abonent balansida oylik abonent to‘lovini yechish uchun yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to‘lovini hisobdan chiqarish kifoya bo‘lsa, to‘lov va abonent hisoblagichlari kunlik rejimga o‘tkaziladi. . Oylik to'lov 1 kunga o'zgartiriladi.\n" +
                                "\n" +
                                "Abonent to‘lovini kunlik yechib olish rejimida hisoblagichlar 1 kunlik daqiqalar, MB va SMSlar uchun belgilangan miqdorda chiqariladi.\n" +
                                "\n" +
                                "Agar abonent to‘lovi yechib olingan vaqtga kelib, abonent balansida oylik va kunlik abonent to‘lovini hisobdan chiqarish uchun yetarli mablag‘ bo‘lmasa, abonent yetarli mablag‘ bo‘lmagani uchun bloklanadi, bu haqda SMS orqali xabar qilinadi. Abonent abonent to‘lovini tarif bo‘yicha (oylik yoki kunlik) undirish uchun yetarli miqdorda balans to‘ldirilgunga qadar bloklanadi. Abonent to‘lovi hisob to‘ldirilgandan so‘ng darhol yechib olinadi.\n" +
                                "\n" +
                                "Agar to'lov vaqtida abonent kunlik to'lovga ega bo'lsa , oylik to'lovni olishning quyidagi qoidalari qo'llaniladi:"
                    }else{
                        if (value == "e"){
                            root.tariflar_name.text  = "Mobi 50"
                            root.tariflar_text.text = "\t\n" +
                                    "Qo'ng'iroqlar daqiqasiga to'lanadi.\n" +
                                    "\n" +
                                    "Barcha chiquvchi qo'ng'iroqlar 1 soniyadan to'lanadi. Va ular bir daqiqagacha yaxlitlanadi.\n" +
                                    "\n" +
                                    "Internet-trafik kvantini yaxlitlash 1KB\n" +
                                    "\n" +
                                    "Qo'shilgan daqiqalar, MB, SMSlar to'plamlari (TP uchun abonent to'lovi doirasida) 1 kalendar oylik muddatga taqdim etiladi. Har oyning birinchi kunida yangi paket yig'iladi.\n" +
                                    "\n" +
                                    "Tarif rejasini o'zgartirganda foydalanilmagan daqiqalar, megabaytlar va SMS xabarlar  o'tkaziladi va yig'iladi .\n" +
                                    "\n" +
                                    "Nol yoki manfiy balansga erishilganda, raqam qisman bloklanadi (qisman blokirovkada, chiquvchi daqiqalar, SMS va Internet bloklanadi), bunda abonent \"Onlayn\" xizmati shartlariga muvofiq kiruvchi qo'ng'iroqlar va SMSlarni qabul qilishi mumkin. .\n" +
                                    "\n" +
                                    "Tarif rejasiga kiritilgan 5 000 daqiqa O‘zbekiston Respublikasi bo‘ylab chiquvchi qo‘ng‘iroqlarni amalga oshirish uchun (O‘zbekistondagi uyali aloqa operatorlari tarmoqlariga va shahar telefon raqamlariga) taqdim etiladi.\n" +
                                    "\n" +
                                    "\"Mobi 50\" TP da \"Gap ko'p\" xizmati mavjud emas.\n" +
                                    "\n" +
                                    "\"Mobi 50\" TP-da konferents-aloqa xizmati mavjud.\n" +
                                    "\"Mobi 50\" tarif rejasidan / tarif rejalaridan / tarif rejalariga o'tish narxi: Faxriy, MOBIUZ bilan birga - 0.\n" +
                                    "\n" +
                                    "Abonent toʻlovi yuqori boʻlgan tarif rejalaridan “Mobi 50” TP ga oʻtish narxi – 10 000 soʻm\n" +
                                    "\n" +
                                    "Abonent toʻlovi past boʻlgan tarif rejalaridan “Mobi 50” TP ga oʻtish narxi – 4210,35 soʻm\n" +
                                    "\n" +
                                    "Markaziy Osiyo zonasi quyidagi yoʻnalishlarga qoʻngʻiroqlarni oʻz ichiga oladi: Tojikiston, Qozogʻiston, Turkmaniston, Qirgʻiziston\n" +
                                    "\n" +
                                    "MDH zonasi quyidagi yoʻnalishlarga qoʻngʻiroqlarni oʻz ichiga oladi: Ozarbayjon, Armaniston, Belarusiya, Gruziya, Qozogʻiston, Qirgʻiziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.   "
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
         * @return A new instance of fragment tariflarFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            tariflarFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}