package com.nexrev.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nexrev.myapplication.R
import com.nexrev.myapplication.ui.models.DataFauna
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.nexrev.myapplication.ui.components.BottomNavbar

@Composable
fun FaunaPage(navController: NavController) {
    val classifications = listOf(
        Pair("Terestrial", R.drawable.ic_terestrial),
        Pair("Akuatik", R.drawable.ic_akuatik),
        Pair("Amfibi", R.drawable.ic_amfibi)
    )

    val selectedCategory = remember { mutableStateOf("Terestrial") }
    val faunaList = DataFauna.getFaunaData()
    val filteredFaunaList = faunaList.filter { it.category == selectedCategory.value }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Dika Pedia App - Fauna", color = Color.White) },
                backgroundColor = Color(0xFF388E3C)
            )
        },
        bottomBar = {
            BottomNavbar(navController = navController)
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(
                text = "Fauna",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2E7D32),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(24.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(classifications.size) { index ->
                    val (classificationName, iconResId) = classifications[index]
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .clickable { selectedCategory.value = classificationName }
                    ) {
                        Image(
                            painter = painterResource(id = iconResId),
                            contentDescription = "$classificationName icon",
                            modifier = Modifier
                                .size(100.dp)
                                .background(Color(0xFFE8F5E9), CircleShape),
                        )
                        Text(
                            text = classificationName,
                            fontSize = 14.sp,
                            color = Color(0xFF558B2F),
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 6.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(filteredFaunaList.size) { index ->
                    val fauna = filteredFaunaList[index]
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(180.dp)
                            .clip(RectangleShape)
                            .clickable {
                                navController.navigate("fauna_detail/${fauna.id}")
                            }
                    ) {
                        Image(
                            painter = painterResource(id = fauna.imageResId),
                            contentDescription = fauna.name,
                            modifier = Modifier.fillMaxSize(),
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
                            text = fauna.name,
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
fun FaunaPagePreview() {
    FaunaPage(navController = rememberNavController())
}
