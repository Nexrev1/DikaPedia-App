package com.nexrev.myapplication.ui.models

import com.nexrev.myapplication.R

data class Flora(
    val name: String,
    val imageResId: Int,
)

object DataFlora {
    fun getFloraData(): List<Flora> {
        return listOf(
            // Kategori Xerofit

            // Kategori Mesofit
        )
    }
}
