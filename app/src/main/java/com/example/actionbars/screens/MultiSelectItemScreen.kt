package com.example.actionbars.screens

import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MultiSelectItemComposable(){
    LazyColumn {
        items(50) {
            var selectedItems by remember { mutableStateOf(setOf<Int>()) }
            val isSelected=selectedItems.contains(it)
            ListItem(
                headlineContent = {
                    Text(
                        text = "double click to select the item$it"
                    )
                },
                leadingContent = {
                    if (isSelected) {
                        IconButton(
                            onClick = {}
                        ) {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = "check icon"
                            )
                        }
                    }
                },
                modifier = Modifier.combinedClickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                    onClick = {},
                    onLongClick = {
                        if(isSelected){
                            selectedItems-=it
                        }else{
                            selectedItems+=it
                        }
                    }
                )
            )
        }
    }
}