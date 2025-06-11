package com.example.c36b.view

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.c36b.model.ProductModel
import com.example.c36b.repository.ProductRepositoryImpl
import com.example.c36b.view.ui.theme.C36BTheme
import com.example.c36b.viewmodel.ProductViewModel

class UpdateProductActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UpdateProductBody()
        }
    }
}

@Composable
fun UpdateProductBody() {

    val repo = remember { ProductRepositoryImpl() }
    val viewModel = remember { ProductViewModel(repo) }

    val context = LocalContext.current
    val activity = context as? Activity

    var pName by remember { mutableStateOf("") }
    var pPrice by remember { mutableStateOf("") }
    var pDesc by remember { mutableStateOf("") }

    Scaffold { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            item {
                OutlinedTextField(
                    value = pName,
                    onValueChange = {
                        pName = it
                    },
                    placeholder = {
                        Text("Product Name")
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                OutlinedTextField(
                    value = pDesc,
                    onValueChange = {
                        pDesc = it
                    },
                    placeholder = {
                        Text("Product Description")
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                OutlinedTextField(
                    value = pPrice,
                    onValueChange = {
                        pPrice = it
                    },
                    placeholder = {
                        Text("Product Price")
                    },
                    modifier = Modifier.fillMaxWidth()
                )

                Button(onClick = {

                }) {
                    Text("Update Product")
                }
            }
        }
    }
}

@Preview
@Composable
fun preUpdate(){
    UpdateProductBody()
}