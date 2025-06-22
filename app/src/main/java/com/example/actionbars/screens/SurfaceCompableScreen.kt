package com.example.actionbars.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SurfaceComposable() {
    Surface(
        modifier = Modifier
            .height(200.dp)
            .width(400.dp)
            .padding(20.dp),
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(2.dp, Color.Blue),
        tonalElevation = 4.dp,
        shadowElevation = 8.dp,
        contentColor = Color.Magenta,
        onClick = {},
        enabled = true,
        color = Color.Green
    ) {
        Text(
            text = "Text on Surface",
            modifier = Modifier.padding(16.dp).fillMaxSize(),
            textAlign = TextAlign.Center
        )
    }
}
@Preview
@Composable
fun SurfaceComposablePreview() {
    SurfaceComposable()
}