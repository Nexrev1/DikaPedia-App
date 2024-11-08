package com.nexrev.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nexrev.myapplication.R
import com.nexrev.myapplication.ui.models.DataFlora
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FloraPage(navController: NavController) {
    val classifications = listOf(
        Pair("Xerofit", R.drawable.ic_xerofit),
        Pair("Hidrofit", R.drawable.ic_hidrofit),
        Pair("Higrofit", R.drawable.ic_higrofit),
        Pair("Halofit", R.drawable.ic_halofit),
        Pair("Mesofit", R.drawable.ic_mesofit)
    )
    val floraList = DataFlora.getFloraData()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Dika Pedia App", color = Color.White) },
                backgroundColor = Color(0xFF388E3C)
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(
                text = "Flora",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2E7D32),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Updated LazyRow with Icons and Text Below
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(classifications.size) { index ->
                    val (classificationName, iconResId) = classifications[index]
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(vertical = 8.dp)
                    ) {
                        // Display Icon
                        Image(
                            painter = painterResource(id = iconResId),
                            contentDescription = "$classificationName icon",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFE8F5E9), CircleShape),
                            contentScale = ContentScale.Crop,
                          //  colorFilter = ColorFilter.tint(Color(0xFF558B2F))
                        )
                        Text(
                            text = classificationName,
                            fontSize = 12.sp,
                            color = Color(0xFF558B2F),
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // LazyVerticalGrid for Flora List
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(floraList.size) { index ->
                    val flora = floraList[index]
                    Box(
                        modifier = Modifier
                            .height(180.dp)
                            .clip(RectangleShape)
                    ) {
                        Image(
                            painter = painterResource(id = flora.imageResId),
                            contentDescription = flora.name,
                            modifier = Modifier
                                .fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(Color.Transparent, Color(0x80000000)),
                                        startY = 50f
                                    )
                                )
                        )
                        Text(
                            text = flora.name,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .padding(8.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FloraPagePreview() {
    FloraPage(navController = rememberNavController())
}
