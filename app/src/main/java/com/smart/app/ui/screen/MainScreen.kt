package com.smart.app.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.smart.app.domain.SumTwoNumUseCase

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, sumTwoNumUseCase: SumTwoNumUseCase) {
    Column {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Button(
            onClick = {
                sumTwoNumUseCase.invoke(1, 2)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Sum")
        }
    }
}