package com.nexrev.myapplication.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun FaunaPage(navController: NavController) {
    Text(
        text = "Welcome to Fauna Page!",
        modifier = Modifier.fillMaxSize()
    )
}
