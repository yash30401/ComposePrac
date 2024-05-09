package com.yash.composeprac.wellness

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = remember {
        getwellnessTask()
    }
) {
    LazyColumn(modifier = modifier) {
        items(list) { task ->
            WellnessTaskItem(taskName = task.lable)
        }
    }
}

private fun getwellnessTask(): List<WellnessTask> {
    return List(30){i-> WellnessTask(i,"Task $i")}
}