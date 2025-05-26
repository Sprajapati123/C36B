package com.example.c36b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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

    Scaffold { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),

        ) {
            item {
                // list of widgets

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
//    Scaffold { padding ->
//        LazyColumn(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(padding)
//        ) {
////            for(int index = 0;i<1000;i++)
//            items (1000){index->
//                Text("$index")
//            }
//        }
//    }
//    val scrollState = rememberScrollState()
//
//    val scrollState2 = rememberScrollState()
//
//
//
//    Scaffold { innerPadding ->
//        Column(
//            modifier = Modifier
//                .padding(innerPadding)
//                .fillMaxSize()
//                .verticalScroll(scrollState)
//        ) {
//
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .horizontalScroll(scrollState2)
//
//            ) {
//                Box(
//                    modifier = Modifier
//                        .height(100.dp)
//                        .width(100.dp)
//                        .background(color = Color.Red)
//                )
//                Box(
//                    modifier = Modifier
//                        .height(100.dp)
//                        .width(100.dp)
//                        .background(color = Color.Magenta)
//                )
//                Box(
//                    modifier = Modifier
//                        .height(100.dp)
//                        .width(100.dp)
//                        .background(color = Color.Yellow)
//                )
//                Box(
//                    modifier = Modifier
//                        .height(100.dp)
//                        .width(100.dp)
//                        .background(color = Color.Green)
//                )
//
//                Box(
//                    modifier = Modifier
//                        .height(100.dp)
//                        .width(100.dp)
//                        .background(color = Color.DarkGray)
//                )
//                Box(
//                    modifier = Modifier
//                        .height(100.dp)
//                        .width(100.dp)
//                        .background(color = Color.Cyan)
//                )
//
//
//            }
//
//            Box(
//                modifier = Modifier
//                    .height(300.dp)
//                    .fillMaxWidth()
//                    .padding(20.dp)
//                    .background(color = Color.Black)
//            )
//
//            Box(
//                modifier = Modifier
//                    .height(300.dp)
//                    .fillMaxWidth()
//                    .padding(20.dp)
//                    .background(color = Color.Gray)
//            )
//
//
//
//            Box(
//                modifier = Modifier
//                    .height(300.dp)
//                    .fillMaxWidth()
//                    .padding(20.dp)
//                    .background(color = Color.Magenta)
//            )
//
//            Box(
//                modifier = Modifier
//                    .height(300.dp)
//                    .fillMaxWidth()
//                    .padding(20.dp)
//                    .background(color = Color.Green)
//            )
//
//            Box(
//                modifier = Modifier
//                    .height(300.dp)
//                    .fillMaxWidth()
//                    .padding(20.dp)
//                    .background(color = Color.Yellow)
//            )
//        }
//    }
}

@Preview(showBackground = true)
@Composable
fun GreetingListView() {
    ListBody()
}