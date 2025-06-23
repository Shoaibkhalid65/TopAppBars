package com.example.actionbars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import com.example.actionbars.screens.DynamicTopAppBarComposable2
import com.example.actionbars.screens.OverFlowTopBarComposable
import com.example.actionbars.screens.PracticeLargeFlexibleTopAppBar

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val scrollBehavior= TopAppBarDefaults.enterAlwaysScrollBehavior()
            Scaffold (
                topBar = {
                    PracticeLargeFlexibleTopAppBar(scrollBehavior)
                }
            ){ innerPadding->
                LazyColumn (modifier = Modifier
                    .padding(innerPadding)
                    .nestedScroll(scrollBehavior.nestedScrollConnection)
                ) {
                    items (50){
                        ListItem(
                            headlineContent = {
                                Text(
                                    text = "headline content for $it item"
                                )
                            }
                        )
                    }
                }
            }
//            val scrollBehavior= TopAppBarDefaults.enterAlwaysScrollBehavior()
//            val listOfItems by remember { mutableStateOf(listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)) }
//            var selectedItems by rememberSaveable { mutableStateOf(setOf<Int>()) }
//            Scaffold(
//                modifier = Modifier.fillMaxSize().background(Color.White),
//                topBar = {
//                    DynamicTopAppBarComposable2(scrollBehavior, selectedItems)
//                }
//            ) {innerPadding->
//                LazyColumn(modifier = Modifier.padding(innerPadding).nestedScroll(scrollBehavior.nestedScrollConnection)) {
//                    itemsIndexed (listOfItems){ _,index->
//                        val isSelected=selectedItems.contains(index)
//                        ListItem(
//                            headlineContent = {
//                                Text(
//                                    "double click to select the item no $index"
//                                )
//                            },
//                            leadingContent = {
//                                if(isSelected){
//                                    IconButton(onClick = {}) {
//                                        Icon(
//                                            imageVector = Icons.Default.Check,
//                                            contentDescription = "check icon"
//                                        )
//                                    }
//                                }
//                            },
//                            modifier = Modifier.combinedClickable(
//                                interactionSource = remember { MutableInteractionSource() },
//                                indication = null,
//                                onClick = {},
//                                onLongClick = {
//                                    if(isSelected){
//                                        selectedItems-=index
//                                    }else{
//                                        selectedItems+=index
//                                    }
//                                }
//                            )
//                        )
//                    }
//                }
//            }
        }
    }
}
