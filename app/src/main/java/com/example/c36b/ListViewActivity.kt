package com.example.c36b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.c36b.ui.theme.C36BTheme

class ListViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListBody()
        }
    }
}

@Composable
fun ListBody() {

    val images = listOf(
        R.drawable.person,
        R.drawable.img,
        R.drawable.img_1,
        R.drawable.img_2,
        R.drawable.img_3,
        R.drawable.img_4,
        R.drawable.img_5,
        R.drawable.img_6,
    )

    val name = listOf<String>(
        "Ram",
        "Info",
        "Momo",
        "Pizza",
        "Panipuri",
        "Grass",
        "Samosa",
        "chatpate",
    )


    Scaffold { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            item {

                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier
                        .height(500.dp)
                        .fillMaxWidth()
                ) {
                    items(images.size) { index ->
                        Image(
                            painterResource(images[index]),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(120.dp)

                        )
                    }
                }

                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    items(images.size) { index ->
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painterResource(images[index]),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .border(
                                        width = 1.dp, color = Color.Blue,
                                        shape = CircleShape
                                    )
                                    .clip(shape = CircleShape)
                            )
                            Text(name[index])
                        }


                    }
                }

                Spacer(modifier = Modifier.height(15.dp))
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()

                ) {
                    item {


                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .background(color = Color.Red)
                        )
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .background(color = Color.Magenta)
                        )
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .background(color = Color.Yellow)
                        )
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .background(color = Color.Green)
                        )

                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .background(color = Color.DarkGray)
                        )
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .background(color = Color.Cyan)
                        )


                    }
                }

                Box(
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(color = Color.Black)
                )

                Box(
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(color = Color.Gray)
                )



                Box(
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(color = Color.Magenta)
                )

                Box(
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(color = Color.Green)
                )

                Box(
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(color = Color.Yellow)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingListView() {
    ListBody()
}