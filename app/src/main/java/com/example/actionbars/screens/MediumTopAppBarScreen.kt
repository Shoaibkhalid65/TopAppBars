package com.example.actionbars.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Preview
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MediumTopAppBarComposable(scrollBehavior: TopAppBarScrollBehavior){
    MediumTopAppBar(
        title = {
            Text(
                text = "Medium topBar title"
            )
        },
        modifier = Modifier,
        navigationIcon = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "account navigation icon"
                )
            }
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Preview,
                    contentDescription = "preview icon"
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Image,
                    contentDescription = "image icon"
                )
            }
        },
        collapsedHeight = 50.dp,
        expandedHeight = 80.dp,
        windowInsets = TopAppBarDefaults.windowInsets,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Red,
            titleContentColor = Color.DarkGray,
        ),
        scrollBehavior = scrollBehavior


    )
}