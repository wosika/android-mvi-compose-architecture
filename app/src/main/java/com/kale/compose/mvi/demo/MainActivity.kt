package com.kale.compose.mvi.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kale.compose.mvi.demo.ui.home.HomePage
import com.kale.compose.mvi.demo.ui.theme.AndroidmvicomposearchitectureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidmvicomposearchitectureTheme {
                // A surface container using the 'background' color from the theme
           /*     Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }*/
                HomePage()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidmvicomposearchitectureTheme {
        HomePage()
    }
}