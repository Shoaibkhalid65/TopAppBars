package com.example.actionbars.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OverFlowTopBarComposable(){
    var showMenu by remember { mutableStateOf(false) }
    TopAppBar(
        title = {
            Text(
                text = "My top bar"
            )
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "setting icon"
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search icon"
                )
            }
            IconButton(
                onClick = {showMenu=true}
            ) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "more icon"
                )
            }
            DropdownMenu(
                expanded = showMenu,
                onDismissRequest = {
                    showMenu=false
                }
            ) {
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Favourites"
                        )
                    },
                    onClick = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "favourites icon"
                        )
                    }
                )
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Profile"
                        )
                    },
                    onClick = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "person icon"
                        )
                    }
                )
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Notifications"
                        )
                    },
                    onClick = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "notifications icon"
                        )
                    }
                )
            }
        }
    )
}