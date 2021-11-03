package com.artikov.modul_5_lesson_7_ums_real

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sms.view.*
import kotlinx.android.synthetic.main.fragment_xizmatlar.view.*
import kotlinx.android.synthetic.main.fragment_xizmatlar.view.xizmatlar_name

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [smsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class smsFragment : Fragment() {
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

        root = inflater.inflate(R.layout.fragment_sms, container, false)

        var value = arguments?.getString("D")



        if (value == "a"){
            root.sms_name.text  = "Sms 100"
            root.sms_text.text = "Paket narxi faollashtirilgandan so'ng yechib olinadi.\n" +
                    "\n" +
                    "Faollashtirilgan “SMS-to‘plam”da qolgan xabarlar soni haqida bilish uchun 104 USSD-buyrug‘ini yuborish yoki 616018 raqamiga 3 raqami bilan SMS-xabar yuborish kerak.\n" +
                    "\n" +
                    "\n" +
                    "Eslatmalar:\n" +
                    "Kontent-provayderlarning xizmatlariga xalqaro chiquvchi SMS-xabarlar va SMS-so‘rovlar ular uchun belgilangan tariflar bo‘yicha to‘lanadi.\n" +
                    "Tegishli SMS-xabarlar hajmidan abonent ushbu muddat davomida vaqtincha blokirovkada bo'lgan vaqtdan qat'i nazar, to'plam faollashtirilgan kundan boshlab 30 kalendar kuni ichida foydalanish mumkin.\n" +
                    "SMS-paketlarni faollashtirish mumkin, agar to'plam faollashtirilgandan so'ng abonent hisobida kamida 42,10 so'm bo'lishi kerak\n" +
                    "Paketlarni xarid qilish orasidagi vaqt oralig'i kamida 10 daqiqa bo'lishi kerak.\n" +
                    "Barcha sotib olingan paketlar hajmi umumlashtiriladi va foydalanish muddati oxirgi xarid qilingan paketning amal qilish muddati tugagunga qadar uzaytiriladi va xarid qilingan kundan boshlab 30 kunni tashkil etadi.\n" +
                    "Xizmat barcha tarif rejalarida xizmat ko'rsatuvchi jismoniy va yuridik shaxslar abonentlari uchun mavjud.\n" +
                    "To‘plamlar faqat abonent O‘zbekistonda “UMS” MChJ tarmog‘ida bo‘lganida va faqat O‘zbekistondagi uyali aloqa operatorlari abonentlariga yuborish uchun amal qiladi.\n" +
                    "Narxlar barcha soliqlarni o'z ichiga olgan.\n" +
                    "\n "
        }else{
            if(value == "b"){
                root.sms_name.text  = "Sms 300"
                root.sms_text.text = "Paket narxi faollashtirilgandan so'ng yechib olinadi.\n" +
                        "\n" +
                        "Faollashtirilgan “SMS-to‘plam”da qolgan xabarlar soni haqida bilish uchun 104 USSD-buyrug‘ini yuborish yoki 616018 raqamiga 3 raqami bilan SMS-xabar yuborish kerak.\n" +
                        "\n" +
                        "\n" +
                        "Eslatmalar:\n" +
                        "Kontent-provayderlarning xizmatlariga xalqaro chiquvchi SMS-xabarlar va SMS-so‘rovlar ular uchun belgilangan tariflar bo‘yicha to‘lanadi.\n" +
                        "Tegishli SMS-xabarlar hajmidan abonent ushbu muddat davomida vaqtincha blokirovkada bo'lgan vaqtdan qat'i nazar, to'plam faollashtirilgan kundan boshlab 30 kalendar kuni ichida foydalanish mumkin.\n" +
                        "SMS-paketlarni faollashtirish mumkin, agar to'plam faollashtirilgandan so'ng abonent hisobida kamida 42,10 so'm bo'lishi kerak\n" +
                        "Paketlarni xarid qilish orasidagi vaqt oralig'i kamida 10 daqiqa bo'lishi kerak.\n" +
                        "Barcha sotib olingan paketlar hajmi umumlashtiriladi va foydalanish muddati oxirgi xarid qilingan paketning amal qilish muddati tugagunga qadar uzaytiriladi va xarid qilingan kundan boshlab 30 kunni tashkil etadi.\n" +
                        "Xizmat barcha tarif rejalarida xizmat ko'rsatuvchi jismoniy va yuridik shaxslar abonentlari uchun mavjud.\n" +
                        "To‘plamlar faqat abonent O‘zbekistonda “UMS” MChJ tarmog‘ida bo‘lganida va faqat O‘zbekistondagi uyali aloqa operatorlari abonentlariga yuborish uchun amal qiladi.\n" +
                        "Narxlar barcha soliqlarni o'z ichiga olgan.\n" +
                        "\n"
            }else{
                if(value == "c"){
                    root.sms_name.text  = "Sms 400"
                    root.sms_text.text = "Paket narxi faollashtirilgandan so'ng yechib olinadi.\n" +
                            "\n" +
                            "Faollashtirilgan “SMS-to‘plam”da qolgan xabarlar soni haqida bilish uchun 104 USSD-buyrug‘ini yuborish yoki 616018 raqamiga 3 raqami bilan SMS-xabar yuborish kerak.\n" +
                            "\n" +
                            "\n" +
                            "Eslatmalar:\n" +
                            "Kontent-provayderlarning xizmatlariga xalqaro chiquvchi SMS-xabarlar va SMS-so‘rovlar ular uchun belgilangan tariflar bo‘yicha to‘lanadi.\n" +
                            "Tegishli SMS-xabarlar hajmidan abonent ushbu muddat davomida vaqtincha blokirovkada bo'lgan vaqtdan qat'i nazar, to'plam faollashtirilgan kundan boshlab 30 kalendar kuni ichida foydalanish mumkin.\n" +
                            "SMS-paketlarni faollashtirish mumkin, agar to'plam faollashtirilgandan so'ng abonent hisobida kamida 42,10 so'm bo'lishi kerak\n" +
                            "Paketlarni xarid qilish orasidagi vaqt oralig'i kamida 10 daqiqa bo'lishi kerak.\n" +
                            "Barcha sotib olingan paketlar hajmi umumlashtiriladi va foydalanish muddati oxirgi xarid qilingan paketning amal qilish muddati tugagunga qadar uzaytiriladi va xarid qilingan kundan boshlab 30 kunni tashkil etadi.\n" +
                            "Xizmat barcha tarif rejalarida xizmat ko'rsatuvchi jismoniy va yuridik shaxslar abonentlari uchun mavjud.\n" +
                            "To‘plamlar faqat abonent O‘zbekistonda “UMS” MChJ tarmog‘ida bo‘lganida va faqat O‘zbekistondagi uyali aloqa operatorlari abonentlariga yuborish uchun amal qiladi.\n" +
                            "Narxlar barcha soliqlarni o'z ichiga olgan.\n" +
                            "\n"
                }else{
                    if(value == "d"){
                        root.sms_name.text  = "Sms 450"
                        root.sms_text.text = "Paket narxi faollashtirilgandan so'ng yechib olinadi.\n" +
                                "\n" +
                                "Faollashtirilgan “SMS-to‘plam”da qolgan xabarlar soni haqida bilish uchun 104 USSD-buyrug‘ini yuborish yoki 616018 raqamiga 3 raqami bilan SMS-xabar yuborish kerak.\n" +
                                "\n" +
                                "\n" +
                                "Eslatmalar:\n" +
                                "Kontent-provayderlarning xizmatlariga xalqaro chiquvchi SMS-xabarlar va SMS-so‘rovlar ular uchun belgilangan tariflar bo‘yicha to‘lanadi.\n" +
                                "Tegishli SMS-xabarlar hajmidan abonent ushbu muddat davomida vaqtincha blokirovkada bo'lgan vaqtdan qat'i nazar, to'plam faollashtirilgan kundan boshlab 30 kalendar kuni ichida foydalanish mumkin.\n" +
                                "SMS-paketlarni faollashtirish mumkin, agar to'plam faollashtirilgandan so'ng abonent hisobida kamida 42,10 so'm bo'lishi kerak\n" +
                                "Paketlarni xarid qilish orasidagi vaqt oralig'i kamida 10 daqiqa bo'lishi kerak.\n" +
                                "Barcha sotib olingan paketlar hajmi umumlashtiriladi va foydalanish muddati oxirgi xarid qilingan paketning amal qilish muddati tugagunga qadar uzaytiriladi va xarid qilingan kundan boshlab 30 kunni tashkil etadi.\n" +
                                "Xizmat barcha tarif rejalarida xizmat ko'rsatuvchi jismoniy va yuridik shaxslar abonentlari uchun mavjud.\n" +
                                "To‘plamlar faqat abonent O‘zbekistonda “UMS” MChJ tarmog‘ida bo‘lganida va faqat O‘zbekistondagi uyali aloqa operatorlari abonentlariga yuborish uchun amal qiladi.\n" +
                                "Narxlar barcha soliqlarni o'z ichiga olgan.\n" +
                                "\n"
                    }else{
                        if (value == "e"){
                            root.sms_name.text  = "Sms 500"
                            root.sms_text.text = "Paket narxi faollashtirilgandan so'ng yechib olinadi.\n" +
                                    "\n" +
                                    "Faollashtirilgan “SMS-to‘plam”da qolgan xabarlar soni haqida bilish uchun 104 USSD-buyrug‘ini yuborish yoki 616018 raqamiga 3 raqami bilan SMS-xabar yuborish kerak.\n" +
                                    "\n" +
                                    "\n" +
                                    "Eslatmalar:\n" +
                                    "Kontent-provayderlarning xizmatlariga xalqaro chiquvchi SMS-xabarlar va SMS-so‘rovlar ular uchun belgilangan tariflar bo‘yicha to‘lanadi.\n" +
                                    "Tegishli SMS-xabarlar hajmidan abonent ushbu muddat davomida vaqtincha blokirovkada bo'lgan vaqtdan qat'i nazar, to'plam faollashtirilgan kundan boshlab 30 kalendar kuni ichida foydalanish mumkin.\n" +
                                    "SMS-paketlarni faollashtirish mumkin, agar to'plam faollashtirilgandan so'ng abonent hisobida kamida 42,10 so'm bo'lishi kerak\n" +
                                    "Paketlarni xarid qilish orasidagi vaqt oralig'i kamida 10 daqiqa bo'lishi kerak.\n" +
                                    "Barcha sotib olingan paketlar hajmi umumlashtiriladi va foydalanish muddati oxirgi xarid qilingan paketning amal qilish muddati tugagunga qadar uzaytiriladi va xarid qilingan kundan boshlab 30 kunni tashkil etadi.\n" +
                                    "Xizmat barcha tarif rejalarida xizmat ko'rsatuvchi jismoniy va yuridik shaxslar abonentlari uchun mavjud.\n" +
                                    "To‘plamlar faqat abonent O‘zbekistonda “UMS” MChJ tarmog‘ida bo‘lganida va faqat O‘zbekistondagi uyali aloqa operatorlari abonentlariga yuborish uchun amal qiladi.\n" +
                                    "Narxlar barcha soliqlarni o'z ichiga olgan.\n" +
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
         * @return A new instance of fragment smsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            smsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}