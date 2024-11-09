package com.nexrev.myapplication.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.nexrev.myapplication.R
import androidx.compose.foundation.shape.CircleShape

@Composable
fun BottomNavbar(navController: NavController) {
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry.value?.destination

    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Black,
        elevation = 8.dp
    ) {
        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_klasifikasi),
                    contentDescription = "Klasifikasi",
                    modifier = Modifier.size(20.dp)
                )
            },
            label = { Text(text = stringResource(id = R.string.klasifikasi), fontSize = 10.sp) },
            selected = currentDestination?.route == "KlasifikasiDetailPage",
            onClick = {
                navController.navigate("KlasifikasiDetailPage") {
                    launchSingleTop = true
                    restoreState = true
                }
            }
        )

        Spacer(modifier = Modifier.width(16.dp))

        BottomNavigationItem(
            icon = {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(Color.Black)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_home),
                        contentDescription = "Home",
                        tint = Color.White,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            },
            label = null,
            selected = currentDestination?.route == "home",
            onClick = {
                navController.navigate("home") {
                    popUpTo("home") {
                        inclusive = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            }
        )

        Spacer(modifier = Modifier.width(16.dp))

        // About Item
        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_about),
                    contentDescription = "About",
                    modifier = Modifier.size(20.dp)
                )
            },
            label = { Text(text = stringResource(id = R.string.about), fontSize = 10.sp) },
            selected = currentDestination?.route == "about",
            onClick = {
                navController.navigate("about") {
                    launchSingleTop = true
                    restoreState = true
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavbarPreview() {
    BottomNavbar(navController = rememberNavController())
}
