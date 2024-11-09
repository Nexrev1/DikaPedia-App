package com.nexrev.myapplication

import KlasifikasiDetailPage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.nexrev.myapplication.ui.components.BottomNavbar
import com.nexrev.myapplication.ui.screens.*
import com.nexrev.myapplication.ui.theme.DikapediaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            DikapediaAppTheme {
                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "home",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("home") { HomePage(navController) }
                        composable("floraScreen") { FloraPage(navController) }
                        composable("faunaScreen") { FaunaPage(navController) }
                        composable("about") { AboutPage(navController) }
                        composable("KlasifikasiDetailPage") {KlasifikasiDetailPage(navController)}
                        composable("flora_detail/{floraId}") { backStackEntry ->
                            val floraId = backStackEntry.arguments?.getString("floraId") ?: ""
                            FloraDetailPage(navController = navController, floraId = floraId)
                        }
                        composable("fauna_detail/{faunaId}") { backStackEntry ->
                            val faunaId = backStackEntry.arguments?.getString("faunaId") ?: ""
                            FaunaDetailPage(navController = navController, faunaId = faunaId)
                        }
                    }
                }
            }
        }
    }

    companion object {
        private val routesWithBottomNavbar = listOf("floraScreen", "faunaScreen")
    }
}
