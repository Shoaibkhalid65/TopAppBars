package com.example.actionbars.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Preview
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterAlignedTopAppBarComposable(scrollBehavior: TopAppBarScrollBehavior){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "App bar title"
            )
        },
        modifier = Modifier,
        navigationIcon = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "account circle icon"
                )
            }
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "delete icon"
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Preview,
                    contentDescription = "preview icon"
                )
            }
        },
        expandedHeight = 50.dp,
        windowInsets = TopAppBarDefaults.windowInsets,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.LightGray,
            scrolledContainerColor = Color.DarkGray,
            navigationIconContentColor = Color.Yellow,
            titleContentColor = Color.Magenta,
            actionIconContentColor = Color.Red,
            subtitleContentColor = Color.Green
        ),
        scrollBehavior = scrollBehavior
    )
}