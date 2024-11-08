package com.nexrev.myapplication.ui.models

import com.nexrev.myapplication.R

data class Flora(
    val name: String,
    val imageResId: Int,
    val category: String
)

object DataFlora {
    fun getFloraData(): List<Flora> {
        return listOf(
            // Kategori Xerofit
            Flora("Kaktus", R.drawable.kaktus, "xerofit"),
            Flora("Agave", R.drawable.agave, "xerofit"),
            Flora("Aloe Vera", R.drawable.aloe_vera, "xerofit"),
            Flora("Yucca", R.drawable.yucca, "xerofit"),
            Flora("Euphorbia", R.drawable.euphorbia, "xerofit"),
            Flora("Saguaro", R.drawable.saguaro, "xerofit"),
            Flora("Lidah Mertua", R.drawable.lidah_mertua, "xerofit"),
            Flora("Portulaca", R.drawable.portulaca, "xerofit"),
            Flora("Bougainvillea", R.drawable.bougainvillea, "xerofit"),
            Flora("Semak Ratel", R.drawable.lili_gurun, "xerofit"),

//            // Kategori Hidrofit
//            Flora("Teratai", R.drawable.teratai, "hidrofit"),
//            Flora("Enceng Gondok", R.drawable.enceng_gondok, "hidrofit"),
//            Flora("Papirus", R.drawable.papirus, "hidrofit"),
//            Flora("Kangkung Air", R.drawable.kangkung_air, "hidrofit"),
//            Flora("Elodea", R.drawable.elodea, "hidrofit"),
//            Flora("Hydrilla", R.drawable.hydrilla, "hidrofit"),
//            Flora("Duckweed", R.drawable.duckweed, "hidrofit"),
//            Flora("Lily Air", R.drawable.lily_air, "hidrofit"),
//            Flora("Bambu Air", R.drawable.bambu_air, "hidrofit"),
//            Flora("Rumbia", R.drawable.rumbia, "hidrofit"),
//
//            // Kategori Higrofit
//            Flora("Pakis", R.drawable.pakis, "higrofit"),
//            Flora("Moss", R.drawable.moss, "higrofit"),
//            Flora("Lumut Hati", R.drawable.lumut_hati, "higrofit"),
//            Flora("Asplenium", R.drawable.asplenium, "higrofit"),
//            Flora("Calathea", R.drawable.calathea, "higrofit"),
//            Flora("Alocasia", R.drawable.alocasia, "higrofit"),
//            Flora("Fittonia", R.drawable.fittonia, "higrofit"),
//            Flora("Maranta", R.drawable.maranta, "higrofit"),
//            Flora("Philodendron", R.drawable.philodendron, "higrofit"),
//            Flora("Selaginella", R.drawable.selaginella, "higrofit"),
//
//            // Kategori Halofit
//            Flora("Mangrove", R.drawable.mangrove, "halofit"),
//            Flora("Saltwort", R.drawable.saltwort, "halofit"),
//            Flora("Salicornia", R.drawable.salicornia, "halofit"),
//            Flora("Rumput Laut", R.drawable.rumput_laut, "halofit"),
//            Flora("Spartina", R.drawable.spartina, "halofit"),
//            Flora("Sea Lavender", R.drawable.sea_lavender, "halofit"),
//            Flora("Sea Blite", R.drawable.sea_blite, "halofit"),
//            Flora("Saltbush", R.drawable.saltbush, "halofit"),
//            Flora("Suaeda", R.drawable.suaeda, "halofit"),
//            Flora("Tamarix", R.drawable.tamarix, "halofit"),
//
            // Kategori Mesofit
//            Flora("Pohon Jati", R.drawable.pohon_jati, "mesofit"),
//            Flora("Bambu", R.drawable.bambu, "mesofit"),
//            Flora("Pohon Beringin", R.drawable.pohon_beringin, "mesofit"),
//            Flora("Pinus", R.drawable.pinus, "mesofit"),
//            Flora("Pohon Jambu", R.drawable.bunga_matahari, "mesofit"),
//            Flora("Pohon Mangga", R.drawable.pohon_mangga, "mesofit"),
//            Flora("Pohon Kelapa", R.drawable.pohon_kelapa, "mesofit"),
//            Flora("Anggrek", R.drawable.anggrek, "mesofit"),
//            Flora("Mawar", R.drawable.mawar, "mesofit"),
//            Flora("Kamboja", R.drawable.kamboja, "mesofit")
        )
    }
}
