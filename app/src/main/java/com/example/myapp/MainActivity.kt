package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MyApp( modifier: Modifier = Modifier) {
    val appModifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Text(
            text = "My Title",
            modifier = appModifier,
            style = MaterialTheme.typography.titleLarge

        )
        OutlinedTextField(
            value="",
            onValueChange = { /*Todo*/},
            modifier = appModifier
        )
        Button(
            onClick = { /*Todo*/},
            modifier = appModifier

        ) { Text("Submit")

        }


    }
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    MyAppTheme  {
        MyApp()
    }
}