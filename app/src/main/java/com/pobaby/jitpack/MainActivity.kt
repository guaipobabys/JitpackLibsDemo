package com.pobaby.jitpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pobaby.jitpack.ui.theme.JitpackLibsDemoTheme
import com.pobaby.support.CalendarUtils

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JitpackLibsDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! ${CalendarUtils.getFormatYearMonth(2024, 10)}",
        modifier = modifier.padding(16.dp),
        color = androidx.compose.ui.graphics.Color.Red,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JitpackLibsDemoTheme {
        Greeting("Android")
    }
}