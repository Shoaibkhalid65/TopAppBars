package com.example.actionbars.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person3
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person3
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actionbars.R

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun CustomTopAppBar1(){
    TopAppBar(
        title = {
            Text(
                text = "myfitnesspal",
                fontSize = 28.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Blue
            )
        },
        modifier = Modifier,
        subtitle = {
           SubTitleComposable()
        },
        navigationIcon = {
           NavigationComposable()
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = "notifications icon"
                )
            }
        },
        titleHorizontalAlignment = Alignment.CenterHorizontally


    )
}
@Preview
@Composable
fun TopBarPreview(){
    CustomTopAppBar1()
}

@Composable
fun SubTitleComposable(){
    Row {
        Text(
            text = "PREMIUM",
            color = Color.Black,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp
        )
        Image(
            painter = painterResource(R.drawable.crown_24dp_000000_fill1_wght400_grad0_opsz24),
            contentDescription = "crown image",
            modifier = Modifier.size(20.dp)
        )
    }
}
@Composable
fun NavigationComposable(){
    Card (
        modifier = Modifier
            .size(40.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Blue
        ),
        shape = RoundedCornerShape(50.dp)
    ){
        Icon(
            imageVector = Icons.Filled.Person3,
            contentDescription = "peron icon",
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 7.dp),
            tint = Color.White
        )
    }
}



