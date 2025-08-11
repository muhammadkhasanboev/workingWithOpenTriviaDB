package com.android.workingwithapi.ui.theme.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent
import com.android.workingwithapi.R

data class Subject (
         val nameOfTheSubject: String,
        val idOfTheSubject: Int,
        val icon: Int
        )

@Composable
fun activityMain(modifier: Modifier = Modifier){
    val subjectList = listOf(
        Subject("General Knowledge", 9, R.drawable.general_knowledge),
        Subject("Books", 10, R.drawable.books),
        Subject("Video Games", 15, R.drawable.games),
        Subject("Math", 19, R.drawable.math)
    )
}