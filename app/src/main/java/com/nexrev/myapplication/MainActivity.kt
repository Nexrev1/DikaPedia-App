package com.nexrev.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.nexrev.myapplication.ui.screens.FaunaPage
import com.nexrev.myapplication.ui.screens.FloraPage
import com.nexrev.myapplication.ui.screens.HomePage
import com.nexrev.myapplication.ui.screens.FloraDetailPage
import com.nexrev.myapplication.ui.theme.DikapediaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            DikapediaAppTheme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "home",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("home") { HomePage(navController) }
                        composable("floraScreen") { FloraPage(navController) }
                        //composable("faunaScreen") { FaunaPage(navController) }
                        composable("flora_detail/{floraId}") { backStackEntry ->
                            val floraId = backStackEntry.arguments?.getString("floraId")
                            FloraDetailPage(navController = navController, floraId = floraId)
                        }
                    }
                }
            }
        }
    }
}
