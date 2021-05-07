package com.example.practicejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.header),
            contentDescription = null,
            modifier = Modifier
                .paddingFromBaseline(0.dp, bottom = 12.dp)
                .height(180.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop,
        )
        Spacer(modifier = Modifier.padding(8.dp))
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