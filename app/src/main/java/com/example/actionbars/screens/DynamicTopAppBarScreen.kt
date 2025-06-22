package com.example.actionbars.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DynamicTopAppBarComposable(selectedItems:Set<Int>,modifier: Modifier= Modifier,scrollBehavior: TopAppBarScrollBehavior){
    val hasSelection =selectedItems.isNotEmpty()
    val topBarTitleText=if(hasSelection) {
        "Selected ${selectedItems.size}"
    }else{
        "List of Items"
    }
    TopAppBar(
        title = {
            Text(
                text = topBarTitleText
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary
        ),
        actions = {
            if(hasSelection) {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share icon"
                    )
                }
            }
        },
        scrollBehavior = scrollBehavior
    )

}