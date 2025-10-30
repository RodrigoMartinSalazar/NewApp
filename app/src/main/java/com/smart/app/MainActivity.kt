package com.smart.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.smart.app.domain.SumTwoNumUseCase
import com.smart.app.ui.screen.Greeting
import com.smart.app.ui.theme.NewAppTheme

class MainActivity : ComponentActivity() {
    val sumTwoNumUseCase = SumTwoNumUseCase()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding),
                        sumTwoNumUseCase
                    )
                }
            }
        }
    }
}