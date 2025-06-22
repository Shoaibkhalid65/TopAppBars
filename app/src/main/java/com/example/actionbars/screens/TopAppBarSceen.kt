package com.example.actionbars.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBarScrollBehavior
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarComposable(scrollBehavior: TopAppBarScrollBehavior) {
    TopAppBar(
        title = {
            Text(
                text = "Top bar title"
            )
        },
        navigationIcon = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "menu icon"
                )
            }
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "add icon"
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search icon"
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "setting icon"
                )
            }

        },
        expandedHeight = 62.dp,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            scrolledContainerColor = Color.Blue,
            navigationIconContentColor = MaterialTheme.colorScheme.onTertiary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
            actionIconContentColor = MaterialTheme.colorScheme.onSecondary

        ),
        scrollBehavior = scrollBehavior
    )
}