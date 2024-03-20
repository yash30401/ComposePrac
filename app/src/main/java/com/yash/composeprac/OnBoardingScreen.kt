package com.yash.composeprac

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OnboardingScreen(modifier: Modifier = Modifier, onContinueClicked: () -> Unit = {}) {

    Column(
        modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome To Basics Code Lab")
        Button(onClick = {
            onContinueClicked()
        }, modifier = Modifier.padding(vertical = 24.dp)) {
            Text(text = "Continue")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnboardingPreview() {
    Surface {
        OnboardingScreen()
    }
}