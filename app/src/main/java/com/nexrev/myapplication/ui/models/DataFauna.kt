package com.nexrev.myapplication.ui.models

import com.nexrev.myapplication.R

data class Fauna(
    val id: String,
    val name: String,
    val imageResId: Int,
    val category: String,
    val description: String
)

object DataFauna {
    fun getFaunaData(): List<Fauna> {
        return listOf(
            // Terestrial (Darat)
            Fauna("fauna1", "Singa", R.drawable.singa, "Terestrial", "Singa adalah hewan karnivora yang hidup di padang rumput Afrika."),
            Fauna("fauna2", "Gajah", R.drawable.gajah, "Terestrial", "Gajah adalah mamalia besar yang ditemukan di hutan dan padang rumput."),
            Fauna("fauna3", "Harimau", R.drawable.harimau, "Terestrial", "Harimau adalah predator besar yang terkenal dengan garis-garis tubuhnya yang khas."),
            Fauna("fauna4", "Kangguru", R.drawable.kangguru, "Terestrial", "Kangguru adalah hewan berkantung yang berasal dari Australia."),
            Fauna("fauna5", "Zebra", R.drawable.zebra, "Terestrial", "Zebra dikenal dengan pola garis hitam putih di tubuhnya."),
            Fauna("fauna6", "Serigala", R.drawable.serigala, "Terestrial", "Serigala adalah hewan sosial yang hidup dalam kelompok."),
            Fauna("fauna7", "Beruang", R.drawable.beruang, "Terestrial", "Beruang adalah hewan besar yang hidup di berbagai habitat dari hutan hingga tundra."),
            Fauna("fauna8", "Kucing", R.drawable.kucing, "Terestrial", "Kucing adalah hewan peliharaan yang cenderung mandiri dan tersebar di seluruh dunia."),
            Fauna("fauna9", "Landak", R.drawable.landak, "Terestrial", "Landak memiliki duri di tubuhnya yang berfungsi sebagai perlindungan."),
            Fauna("fauna10", "Kambing", R.drawable.kambing, "Terestrial", "Kambing adalah hewan ternak yang sering ditemukan di perbukitan."),

            // Akuatik (Air)
            Fauna("fauna11", "Ikan Paus", R.drawable.ikan_paus, "Akuatik", "Ikan paus adalah mamalia laut yang memiliki ukuran tubuh sangat besar."),
            Fauna("fauna12", "Lumba-lumba", R.drawable.lumba_lumba, "Akuatik", "Lumba-lumba adalah hewan cerdas yang hidup di laut dan sering berenang dalam kelompok."),
            Fauna("fauna13", "Ikan Hiu", R.drawable.ikan_hiu, "Akuatik", "Ikan hiu adalah predator laut yang terkenal dengan kekuatannya."),
            Fauna("fauna14", "Ikan Buntal", R.drawable.ikan_buntal, "Akuatik", "Ikan buntal memiliki kemampuan mengembungkan tubuhnya sebagai pertahanan."),
            Fauna("fauna15", "Kuda Laut", R.drawable.kuda_laut, "Akuatik", "Kuda laut adalah ikan kecil yang memiliki bentuk tubuh unik seperti kuda."),
            Fauna("fauna16", "Penyu", R.drawable.penyu, "Akuatik", "Penyu adalah reptil yang hidup di laut dan memiliki tempurung keras."),
            Fauna("fauna17", "Beruang Laut", R.drawable.beruang_laut, "Akuatik", "Beruang laut adalah hewan mamalia yang hidup di laut. Kau harus membuat lingkaran agar tak diserang olehnya"),
            Fauna("fauna18", "Ikan Badut", R.drawable.ikan_badut, "Akuatik", "Ikan badut hidup di terumbu karang dan terkenal dengan warna cerahnya."),
            Fauna("fauna19", "Bintang Laut", R.drawable.bintang_laut, "Akuatik", "Bintang laut adalah hewan laut yang memiliki banyak lengan."),
            Fauna("fauna20", "Ubur-ubur", R.drawable.ubur_ubur, "Akuatik", "Ubur-ubur memiliki tubuh yang transparan dan tentakel yang menyengat."),

            // Amfibi (Keduanya)
            Fauna("fauna21", "Katak", R.drawable.katak, "Amfibi", "Katak adalah hewan amfibi yang dapat hidup di darat maupun air."),
            Fauna("fauna22", "Salamander", R.drawable.salamander, "Amfibi", "Salamander adalah amfibi yang mirip kadal dan sering ditemukan di tempat lembab."),
            Fauna("fauna23", "Kodok Pohon", R.drawable.kodok_pohon, "Amfibi", "Kodok pohon hidup di hutan dan memiliki kemampuan untuk memanjat."),
            Fauna("fauna24", "Axolotl", R.drawable.axolotl, "Amfibi", "Axolotl adalah amfibi yang memiliki kemampuan regenerasi tinggi."),
            Fauna("fauna25", "Caecilian", R.drawable.caecilian, "Amfibi", "Caecilian adalah amfibi tanpa kaki yang hidup di bawah tanah."),
            Fauna("fauna26", "Buaya", R.drawable.buaya, "Amfibi", "Buaya adalah reptil besar yang hidup di darat dan air."),
            Fauna("fauna27", "Kodok Hijau", R.drawable.kodok_hijau, "Amfibi", "Kodok hijau dapat ditemukan di habitat basah dan dekat air."),
            Fauna("fauna28", "Kodok Emas", R.drawable.kodok_emas, "Amfibi", "Kodok emas dikenal dengan warna cerahnya dan hidup di hutan hujan."),
            Fauna("fauna29", "Iguana Air", R.drawable.iguana_air, "Amfibi", "Iguana air adalah reptil yang mampu berenang dan hidup di hutan."),
            Fauna("fauna30", "Katak Merah", R.drawable.katak_merah, "Amfibi", "Katak merah hidup di hutan tropis dan dikenal dengan warna cerahnya.")
      )
    }

}
