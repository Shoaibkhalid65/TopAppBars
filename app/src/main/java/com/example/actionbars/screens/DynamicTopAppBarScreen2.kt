package com.example.actionbars.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DynamicTopAppBarComposable2(scrollBehavior: TopAppBarScrollBehavior, selectedItems: Set<Int>, modifier: Modifier= Modifier){
    val isSelected=selectedItems.isNotEmpty()
    TopAppBar(
        title = {
            Text(
               text = if(isSelected){
                   "${selectedItems.size} items Selected"
               }else{
                   "List of items"
               }
            )
        },
        actions = {
            if(isSelected){
                IconButton(onClick = {}) {
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