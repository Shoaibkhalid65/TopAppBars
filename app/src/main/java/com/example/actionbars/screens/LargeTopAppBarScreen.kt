package com.example.actionbars.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.DragIndicator
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LargeTopAppBarComposable(scrollBehavior: TopAppBarScrollBehavior){
    LargeTopAppBar(
        title = {
            Text(
                text = "Large TopBar Title",
            )
        },
        modifier = Modifier,
        navigationIcon = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.DragIndicator,
                    contentDescription = "Drag indicator icon"
                )
            }
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Drag indicator icon"
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "account circle icon"
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "more vertical icon"
                )
            }
        },
        collapsedHeight = 50.dp,
        expandedHeight = 80.dp,
        windowInsets = TopAppBarDefaults.windowInsets,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Cyan,
            titleContentColor = Color.Green
        ),
        scrollBehavior = scrollBehavior
    )
}