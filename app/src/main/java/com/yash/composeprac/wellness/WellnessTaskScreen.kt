package com.yash.composeprac.wellness

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun WellnessTaskScreen(modifier: Modifier = Modifier) {

        val list = remember { getWellnessTasks().toMutableStateList() }
        WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })

}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }