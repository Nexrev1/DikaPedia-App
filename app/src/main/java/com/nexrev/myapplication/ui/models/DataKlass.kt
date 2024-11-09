package com.nexrev.myapplication.ui.models

data class KlassDetail(
    val name: String,
    val description: String
)

object DataKlass {
    val klassList = listOf(
        // Klasifikasi Fauna
        KlassDetail(
            name = "Terestrial",
            description = "Fauna yang hidup di darat, mencakup hewan seperti kucing, gajah, dan singa."
        ),
        KlassDetail(
            name = "Akuatik",
            description = "Fauna yang hidup di air, termasuk ikan, lumba-lumba, dan paus."
        ),
        KlassDetail(
            name = "Amfibi",
            description = "Fauna yang dapat hidup di darat maupun di air, seperti katak dan salamander."
        ),
        // Klasifikasi Flora
        KlassDetail(
            name = "Higrofit",
            description = "Tumbuhan yang hidup di lingkungan lembab atau banyak air."
        ),
        KlassDetail(
            name = "Xerofit",
            description = "Tumbuhan yang mampu hidup di lingkungan kering atau dengan sedikit air."
        ),
        KlassDetail(
            name = "Mesofit",
            description = "Tumbuhan yang hidup di lingkungan dengan kelembaban sedang."
        ),
        KlassDetail(
            name = "Halofit",
            description = "Tumbuhan yang hidup di lingkungan dengan kadar garam tinggi, seperti di pantai."
        )
    )
}
