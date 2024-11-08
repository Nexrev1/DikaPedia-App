package com.nexrev.myapplication.ui.models

import com.nexrev.myapplication.R

data class Flora(
    val id: String,
    val name: String,
    val imageResId: Int,
    val category: String,
    val description: String
)

object DataFlora {
    fun getFloraData(): List<Flora> {
        return listOf(
            // Kategori Xerofit
            Flora("flora1", "Kaktus", R.drawable.kaktus, "xerofit", "Kaktus adalah tanaman yang mampu bertahan di lingkungan yang kering dan panas."),
            Flora("flora2", "Agave", R.drawable.agave, "xerofit", ""),
            Flora("flora3", "Aloe Vera", R.drawable.aloe_vera, "xerofit", ""),
            Flora("flora4", "Yucca", R.drawable.yucca, "xerofit", ""),
            Flora("flora5", "Euphorbia", R.drawable.euphorbia, "xerofit", ""),
            Flora("flora6", "Saguaro", R.drawable.saguaro, "xerofit", ""),
            Flora("flora7", "Lidah Mertua", R.drawable.lidah_mertua, "xerofit", ""),
            Flora("flora8", "Portulaca", R.drawable.portulaca, "xerofit", ""),
            Flora("flora9", "Bougainvillea", R.drawable.bougainvillea, "xerofit", ""),
            Flora("flora10", "Semak Ratel", R.drawable.lili_gurun, "xerofit", ""),

            // Kategori Hidrofit
            Flora("flora11", "Teratai", R.drawable.teratai, "hidrofit", ""),
            Flora("flora12", "Enceng Gondok", R.drawable.enceng_gondok, "hidrofit", ""),
            Flora("flora13", "Papirus", R.drawable.papirus, "hidrofit", ""),
            Flora("flora14", "Kangkung Air", R.drawable.kangkung_air, "hidrofit", ""),
            Flora("flora15", "Elodea", R.drawable.elodea, "hidrofit", ""),
            Flora("flora16", "Hydrilla", R.drawable.hydrilla, "hidrofit", ""),
            Flora("flora17", "Duckweed", R.drawable.duckweed, "hidrofit", ""),
            Flora("flora18", "Lily Air", R.drawable.lily_air, "hidrofit", ""),
            Flora("flora19", "Bambu Air", R.drawable.bambu_air, "hidrofit", ""),
            Flora("flora20", "Rumbia", R.drawable.rumbia, "hidrofit", ""),

            // Kategori Higrofit
            Flora("flora21", "Pakis", R.drawable.pakis, "higrofit", ""),
            Flora("flora22", "Moss", R.drawable.moss, "higrofit", ""),
            Flora("flora23", "Lumut Hati", R.drawable.lumut_hati, "higrofit", ""),
            Flora("flora24", "Asplenium", R.drawable.asplenium, "higrofit", ""),
            Flora("flora25", "Calathea", R.drawable.calathea, "higrofit", ""),
            Flora("flora26", "Alocasia", R.drawable.alocasia, "higrofit", ""),
            Flora("flora27", "Fittonia", R.drawable.fittonia, "higrofit", ""),
            Flora("flora28", "Maranta", R.drawable.maranta, "higrofit", ""),
            Flora("flora29", "Philodendron", R.drawable.philodendron, "higrofit", ""),
            Flora("flora30", "Selaginella", R.drawable.selaginella, "higrofit", ""),

            // Kategori Halofit
            Flora("flora31", "Mangrove", R.drawable.mangrove, "halofit", ""),
            Flora("flora32", "Saltwort", R.drawable.saltwort, "halofit", ""),
            Flora("flora33", "Salicornia", R.drawable.salicornia, "halofit", ""),
            Flora("flora34", "Rumput Laut", R.drawable.rumput_laut, "halofit", ""),
            Flora("flora35", "Spartina", R.drawable.spartina, "halofit", ""),
            Flora("flora36", "Sea Lavender", R.drawable.sea_lavender, "halofit", ""),
            Flora("flora37", "Sea Blite", R.drawable.sea_blite, "halofit", ""),
            Flora("flora38", "Saltbush", R.drawable.saltbush, "halofit", ""),
            Flora("flora39", "Suaeda", R.drawable.suaeda, "halofit", ""),
            Flora("flora40", "Tamarix", R.drawable.tamarix, "halofit", ""),

            // Kategori Mesofit
            Flora("flora41", "Pohon Jati", R.drawable.pohon_jati, "mesofit", ""),
            Flora("flora42", "Bambu", R.drawable.bambu, "mesofit", ""),
            Flora("flora43", "Pohon Beringin", R.drawable.pohon_beringin, "mesofit", ""),
            Flora("flora44", "Pinus", R.drawable.pinus, "mesofit", ""),
            Flora("flora45", "Bunga Matahari", R.drawable.bunga_matahari, "mesofit", ""),
            Flora("flora46", "Pohon Mangga", R.drawable.pohon_mangga, "mesofit", ""),
            Flora("flora47", "Pohon Kelapa", R.drawable.pohon_kelapa, "mesofit", ""),
            Flora("flora48", "Anggrek", R.drawable.anggrek, "mesofit", ""),
            Flora("flora49", "Mawar", R.drawable.mawar, "mesofit", ""),
            Flora("flora50", "Kamboja", R.drawable.kamboja, "mesofit", "")
        )
    }
    fun getFloraById(floraId: String): Flora? {
        return getFloraData().find { it.id == floraId }
    }
}