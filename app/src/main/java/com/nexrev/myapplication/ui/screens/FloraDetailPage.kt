package com.nexrev.myapplication.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nexrev.myapplication.ui.models.DataFlora

@Composable
fun FloraDetailPage(navController: NavController, floraId: String?) {
    Log.d("FloraDetailPage", "floraId: $floraId")

    if (floraId != null) {
        val floraList = DataFlora.getFloraData()
        val flora = floraList.firstOrNull { it.id == floraId }

        if (flora != null) {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text("Detail Flora", color = Color.White) },
                        backgroundColor = Color(0xFF388E3C),
                        navigationIcon = {
                            IconButton(onClick = { navController.popBackStack() }) {
                                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                            }
                        }
                    )
                }
            ) { paddingValues ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                        .padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = flora.imageResId),
                        contentDescription = flora.name,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .clip(RectangleShape),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = flora.name,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF388E3C)
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Kategori: ${flora.category.capitalize()}",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Gray
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = flora.description,
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                }
            }
        } else {
            Log.e("FloraDetailPage", "Flora dengan ID $floraId tidak ditemukan!")
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Data flora tidak ditemukan",
                    color = Color.Red
                )
            }
        }
    } else {
        Log.e("FloraDetailPage", "floraId tidak valid atau null")
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Data flora tidak ditemukan",
                color = Color.Red
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FloraDetailPagePreview() {
    FloraDetailPage(navController = rememberNavController(), floraId = "flora2")
}
