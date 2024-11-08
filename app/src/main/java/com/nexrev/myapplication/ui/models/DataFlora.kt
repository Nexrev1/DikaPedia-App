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
            Flora("flora1", "Kaktus", R.drawable.kaktus, "xerofit", "Kaktus adalah tanaman yang mampu bertahan di lingkungan yang kering dan panas, dengan daun yang berubah menjadi duri untuk mengurangi penguapan air."),
            Flora("flora2", "Agave", R.drawable.agave, "xerofit", "Agave adalah tanaman gurun yang tahan terhadap kondisi kering. Daunnya tebal dengan tepi berduri untuk melindungi dari pemangsa."),
            Flora("flora3", "Aloe Vera", R.drawable.aloe_vera, "xerofit", "Aloe Vera dikenal dengan daun yang berdaging untuk menyimpan air, serta memiliki khasiat penyembuhan pada kulit."),
            Flora("flora4", "Yucca", R.drawable.yucca, "xerofit", "Yucca adalah tanaman yang sering ditemukan di daerah gurun dan semi-gurun, dengan daun panjang dan runcing serta sistem akar yang kuat untuk menyerap air."),
            Flora("flora5", "Euphorbia", R.drawable.euphorbia, "xerofit", "Euphorbia memiliki getah susu yang sering digunakan sebagai perlindungan dari pemangsa. Tanaman ini sangat tahan terhadap kekeringan."),
            Flora("flora6", "Saguaro", R.drawable.saguaro, "xerofit", "Saguaro adalah kaktus besar yang dapat menyimpan air dalam jumlah besar di batangnya, memungkinkan hidup di gurun dalam waktu lama."),
            Flora("flora7", "Lidah Mertua", R.drawable.lidah_mertua, "xerofit", "Lidah Mertua atau Sansevieria memiliki daun tebal yang membantu menyimpan air. Tanaman ini juga dikenal bisa menyaring polusi udara."),
            Flora("flora8", "Portulaca", R.drawable.portulaca, "xerofit", "Portulaca memiliki daun berdaging yang menyimpan air dan bunga kecil berwarna cerah, serta mampu tumbuh di tanah yang minim nutrisi."),
            Flora("flora9", "Bougainvillea", R.drawable.bougainvillea, "xerofit", "Bougainvillea memiliki bract atau daun modifikasi yang berwarna-warni dan sangat tahan terhadap kondisi kering."),
            Flora("flora10", "Semak Ratel", R.drawable.lili_gurun, "xerofit", "Semak Ratel adalah tanaman yang mampu hidup di tanah berpasir dan mampu bertahan di bawah sinar matahari yang terik."),

                    // Kategori Hidrofit
            Flora("flora11", "Teratai", R.drawable.teratai, "hidrofit", "Teratai adalah tanaman air dengan daun lebar yang mengapung di permukaan air, membantu fotosintesis dan penyerapan cahaya."),
            Flora("flora12", "Enceng Gondok", R.drawable.enceng_gondok, "hidrofit", "Enceng Gondok memiliki akar yang mengapung, memungkinkan tanaman ini menyerap nutrisi dari air di sekitarnya."),
            Flora("flora13", "Papirus", R.drawable.papirus, "hidrofit", "Papirus adalah tanaman yang tumbuh di rawa dan perairan dangkal, dengan batang berongga yang kuat."),
            Flora("flora14", "Kangkung Air", R.drawable.kangkung_air, "hidrofit", "Kangkung Air tumbuh di air dangkal dengan daun yang mengapung, sehingga mudah menyerap nutrisi."),
            Flora("flora15", "Elodea", R.drawable.elodea, "hidrofit", "Elodea adalah tanaman air yang sering dijadikan tanaman hias akuarium, dengan daun kecil yang tumbuh rapat."),
            Flora("flora16", "Hydrilla", R.drawable.hydrilla, "hidrofit", "Hydrilla adalah tanaman air yang tumbuh cepat, sering kali menjadi gulma di perairan karena pertumbuhannya yang lebat."),
            Flora("flora17", "Duckweed", R.drawable.duckweed, "hidrofit", "Duckweed adalah tanaman kecil yang mengapung di permukaan air, berperan penting dalam siklus ekosistem air."),
            Flora("flora18", "Lily Air", R.drawable.lily_air, "hidrofit", "Lily Air memiliki daun lebar yang mengapung dan bunga cantik yang muncul di permukaan air."),
            Flora("flora19", "Bambu Air", R.drawable.bambu_air, "hidrofit", "Bambu Air memiliki batang berongga yang menyerap air, memungkinkan tanaman ini bertahan di lingkungan basah."),
            Flora("flora20", "Rumbia", R.drawable.rumbia, "hidrofit", "Rumbia tumbuh di lahan basah dan rawa, dikenal dengan batangnya yang kokoh dan daunnya yang lebar."),

                    // Kategori Higrofit
            Flora("flora21", "Pakis", R.drawable.pakis, "higrofit", "Pakis adalah tanaman yang tumbuh subur di lingkungan lembap, dengan daun berbentuk spiral yang khas."),
            Flora("flora22", "Moss", R.drawable.moss, "higrofit", "Moss adalah tanaman kecil yang tumbuh di tanah atau bebatuan lembap, tanpa akar sejati."),
            Flora("flora23", "Lumut Hati", R.drawable.lumut_hati, "higrofit", "Lumut Hati adalah tanaman kecil berwarna hijau yang tumbuh di lingkungan lembap dan teduh."),
            Flora("flora24", "Asplenium", R.drawable.asplenium, "higrofit", "Asplenium adalah pakis besar yang tumbuh di hutan lembap, sering menghiasi ruangan sebagai tanaman hias."),
            Flora("flora25", "Calathea", R.drawable.calathea, "higrofit", "Calathea memiliki daun lebar dengan pola menarik, tumbuh subur di tempat teduh dan lembap."),
            Flora("flora26", "Alocasia", R.drawable.alocasia, "higrofit", "Alocasia dikenal dengan daun lebar berbentuk panah, menyukai lingkungan lembap dan teduh."),
            Flora("flora27", "Fittonia", R.drawable.fittonia, "higrofit", "Fittonia memiliki daun kecil dengan urat warna-warni, ideal untuk lingkungan lembap."),
            Flora("flora28", "Maranta", R.drawable.maranta, "higrofit", "Maranta atau tanaman doa memiliki daun yang melipat pada malam hari, tumbuh baik di lingkungan lembap."),
            Flora("flora29", "Philodendron", R.drawable.philodendron, "higrofit", "Philodendron adalah tanaman merambat yang tumbuh baik di tempat teduh dengan kelembapan tinggi."),
            Flora("flora30", "Selaginella", R.drawable.selaginella, "higrofit", "Selaginella adalah tanaman kecil yang membutuhkan kelembapan tinggi, sering dijumpai di hutan hujan."),

            // Kategori Halofit
            Flora("flora31", "Mangrove", R.drawable.mangrove, "halofit", "Mangrove adalah tanaman yang tumbuh di lingkungan payau, dengan akar yang menyerap oksigen dari udara."),
            Flora("flora32", "Saltwort", R.drawable.saltwort, "halofit", "Saltwort adalah tanaman tahan garam yang tumbuh di pantai atau tanah yang mengandung garam."),
            Flora("flora33", "Salicornia", R.drawable.salicornia, "halofit", "Salicornia atau Samphire adalah tanaman yang tumbuh di lingkungan asin dan memiliki rasa gurih."),
            Flora("flora34", "Rumput Laut", R.drawable.rumput_laut, "halofit", "Rumput Laut adalah tanaman yang tumbuh di air laut, penting sebagai sumber makanan dan ekosistem laut."),
            Flora("flora35", "Spartina", R.drawable.spartina, "halofit", "Spartina adalah rumput yang tumbuh di dataran pasang surut dan beradaptasi dengan kadar garam tinggi."),
            Flora("flora36", "Sea Lavender", R.drawable.sea_lavender, "halofit", "Sea Lavender adalah tanaman pantai dengan bunga ungu yang tumbuh di habitat berair payau."),
            Flora("flora37", "Sea Blite", R.drawable.sea_blite, "halofit", "Sea Blite adalah tanaman yang tumbuh di lingkungan asin, dikenal dengan daun berbentuk silindris."),
            Flora("flora38", "Saltbush", R.drawable.saltbush, "halofit", "Saltbush adalah tanaman yang dapat menyerap garam melalui akarnya dan tumbuh di tanah berpasir."),
            Flora("flora39", "Suaeda", R.drawable.suaeda, "halofit", "Suaeda adalah tanaman yang tumbuh di lingkungan berair asin, sering dijumpai di dataran pasang surut."),
            Flora("flora40", "Tamarix", R.drawable.tamarix, "halofit", "Tamarix adalah tanaman dengan daun kecil dan berbulu yang tahan terhadap salinitas tinggi."),

            // Kategori Mesofit
            Flora("flora41", "Pohon Jati", R.drawable.pohon_jati, "mesofit", "Pohon Jati dikenal dengan kayunya yang kuat dan sering ditemukan di hutan tropis."),
            Flora("flora42", "Bambu", R.drawable.bambu, "mesofit", "Bambu adalah tanaman serbaguna dengan batang berongga, sering dijumpai di dataran tropis."),
            Flora("flora43", "Pohon Beringin", R.drawable.pohon_beringin, "mesofit", "Pohon Beringin memiliki akar gantung dan tumbuh baik di lingkungan lembap."),
            Flora("flora44", "Pinus", R.drawable.pinus, "mesofit", "Pinus adalah pohon yang tumbuh di pegunungan, menghasilkan resin yang berguna untuk berbagai keperluan."),
            Flora("flora45", "Bunga Matahari", R.drawable.bunga_matahari, "mesofit", "Bunga Matahari tumbuh di tanah yang cukup lembap dan mampu berputar menghadap matahari."),
            Flora("flora46", "Pohon Mangga", R.drawable.pohon_mangga, "mesofit", "Pohon Mangga adalah tanaman buah tropis yang menyukai iklim hangat dan tanah subur."),
            Flora("flora47", "Pohon Kelapa", R.drawable.pohon_kelapa, "mesofit", "Pohon Kelapa tumbuh di pantai tropis dan dikenal dengan buah serta kelapanya."),
            Flora("flora48", "Anggrek", R.drawable.anggrek, "mesofit", "Anggrek adalah tanaman hias yang tumbuh baik di lingkungan lembap dengan pencahayaan cukup."),
            Flora("flora49", "Mawar", R.drawable.mawar, "mesofit", "Mawar adalah tanaman berbunga yang membutuhkan tanah subur dan perawatan yang baik."),
            Flora("flora50", "Kamboja", R.drawable.kamboja, "mesofit", "Kamboja memiliki bunga yang wangi dan tumbuh baik di iklim tropis dengan tanah yang cukup lembap.")

        )
    }
    fun getFloraById(floraId: String): Flora? {
        return getFloraData().find { it.id == floraId }
    }
}