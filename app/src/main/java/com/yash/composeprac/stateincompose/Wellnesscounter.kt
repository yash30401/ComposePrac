package com.yash.composeprac.stateincompose

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnrememberedMutableState", "RememberReturnType")
@Composable
fun WellnessCounter(modifier: Modifier) {
    val count = remember {
        mutableStateOf(0)
    }
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "You've had ${count.value} glasses.",
        )
        Button(onClick = {count.value++}, modifier = Modifier.padding(top = 8.dp)) {
            Text(text = "Add One")
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WellnessCounterPreview(modifier: Modifier = Modifier) {
    WellnessCounter(modifier = modifier)
}