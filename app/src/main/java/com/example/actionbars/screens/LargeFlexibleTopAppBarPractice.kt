package com.example.actionbars.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFlexibleTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumFlexibleTopAppBar
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actionbars.R


@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun PracticeLargeFlexibleTopAppBar(scrollBehavior: TopAppBarScrollBehavior){
    val isCollapsed by remember { derivedStateOf { scrollBehavior.state.collapsedFraction>0.95f } }
    LargeFlexibleTopAppBar(
        title = {
            Box {
                if (isCollapsed) CollapsedTitle() else ExpandedTitle()
            }
        },
        navigationIcon = {
                IconButton(
                    onClick = {},
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "back arrow",
                        tint = Color.White
                    )
                }
        },
        scrollBehavior = scrollBehavior,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.onPrimaryContainer,
            scrolledContainerColor = Color.Magenta,
        )

    )
}

@Composable
fun CollapsedTitle(){
    Row {
        Image(
            painter = painterResource(R.drawable.menimg),
            contentDescription = "men image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(36.dp).clip(shape = CircleShape)
        )
        Text(
            text =  "John Doe",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(start = 10.dp)
        )
    }
}
@Composable
fun ExpandedTitle(){
    Column {
        Row {
            Image(
                painter = painterResource(R.drawable.menimg),
                contentDescription = "men image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(70.dp).clip(shape = CircleShape)
            )
            Column(modifier = Modifier.padding(start = 10.dp)) {
                Text(
                    text =  "John Doe",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 16.sp
                )
                Text(
                    text =  "John Doe",
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    fontSize = 15.sp
                )
            }
        }
        Text(
            text = "hello my name is muhammad shoaib khalid i am is an android developer and i love with jetpack compose",
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 15.sp,
        )
    }
}
@Preview
@Composable
fun ComposablePreview(){
   ExpandedTitle()
}
