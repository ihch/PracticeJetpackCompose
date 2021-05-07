package com.example.practicejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    Column() {
        Text("A day in Shark Fin Cove")
        Text("O-tani san!")
        Text("10 home run!")
    }
}

@Preview
@Composable
fun PreviewNewsStory() {
    NewsStory()
}