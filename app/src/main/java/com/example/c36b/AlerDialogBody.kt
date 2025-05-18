package com.example.c36b

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun AlertDialogBody() {
    var showDialog by remember { mutableStateOf(false) }

    Column {
        // Trigger to show the dialog
        Button(onClick = { showDialog = true }) {
            Text("Show AlertDialog")
        }

        if (showDialog) {
            AlertDialog(
                onDismissRequest = {
                    showDialog = false
                }, // dismiss when clicked outside
                confirmButton = {
                    Button(onClick = {
                        // Confirm action
                        showDialog = false
                    }) {
                        Text("OK")
                    }
                },
                dismissButton = {
                    Button(onClick = {
                        // Cancel action
                        showDialog = false
                    }) {
                        Text("Cancel")
                    }
                },
                title = { Text(text = "Alert Title") },
                text = { Text("This is an alert dialog message.") }
            )
        }
    }
}