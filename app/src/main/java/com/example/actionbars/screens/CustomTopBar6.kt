package com.example.actionbars.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.actionbars.R
import java.nio.file.WatchEvent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar6(){
    TopAppBar(
        title = {
          ButtonComposable()
        },
        modifier = Modifier.background(color = Color.Black, shape = RoundedCornerShape(26.dp)),
        actions = {
            ActionsComposable(Icons.Default.Search)
            Spacer(modifier = Modifier.width(10.dp))
            ActionsComposable(Icons.Default.Notifications)
            Spacer(modifier = Modifier.width(10.dp))
            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(48.dp).clip(CircleShape)
                    .border(width = 1.dp, color = Color.LightGray, shape = CircleShape)
            ) {
                Image(
                    painter = painterResource(R.drawable.menimg),
                    contentDescription = "men image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

        }
    )
}
@Composable
fun ButtonComposable(){
        Box(
            modifier = Modifier
                .background(color = Color(0xff163d39),
                    shape = RoundedCornerShape(8.dp))
                .height(48.dp)
                .width(200.dp)
        ){
            Text(
                text = "New Invoice",
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(start = 10.dp),
                color = Color.White
            )
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "add icon",
                tint = Color.White,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 20.dp)
                    .size(24.dp)
            )
        }
    }
@Composable
fun ActionsComposable(imageVector: ImageVector){
    IconButton(
        onClick = {},
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = CircleShape
            )
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = "search icon",
            tint = Color.LightGray
        )
    }
}

@Preview
@Composable
fun ButtonComposablePreview(){
   CustomTopBar6()
}