package com.example.actionbars.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Sms
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actionbars.R
import kotlin.io.path.Path

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun CustomTopBar2(){
    TopAppBar(
        title = {
            Text(
                text = "Title",
                color = Color.Black,
                fontWeight = FontWeight.Medium
            )
        },
        modifier = Modifier.shadow(16.dp, shape = RoundedCornerShape(16.dp)).background(color = Color.White),
        subtitle = {
            Text(
                text = "Subtitle",
                color = Color.DarkGray
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.Sms,
                    contentDescription = "sms icon"
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription = "Setting icon"
                )
            }

        }
    )
}
@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun CustomAppBar3(){
    TopAppBar(
        title = {
            Text(
                text = "Top App Bar",
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
            )
        },
        modifier = Modifier.background(color = Color.White, shape = RoundedCornerShape(16.dp)),
        subtitle = {
            Text(
                text = "\uD83E\uDD0C handcrafted by Mana",
                fontSize = 15.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Light
            )
        },
        navigationIcon = {
            Image(
                painter = painterResource(R.drawable.menimg),
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.clip(shape = RoundedCornerShape(50.dp)).size(40.dp),
                contentDescription = "men image"
            )
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "menu icon"
                )
            }
        },
        titleHorizontalAlignment = Alignment.CenterHorizontally
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar4(){
    val provider = GoogleFont.Provider(
        providerAuthority = "com.google.android.gms.fonts",
        providerPackage = "com.google.android.gms",
        certificates = R.array.com_google_android_gms_fonts_certs
    )
    val fontName=GoogleFont("Lobster Two")
    val fontFamily= FontFamily(
        Font(googleFont = fontName, fontProvider = provider)
    )
    TopAppBar(
        title = {
            Text(
                text = buildAnnotatedString {
                    withStyle (style = SpanStyle(color = Color.Blue)){
                        append("Mana")
                    }
                    withStyle(style = SpanStyle(color = Color.Magenta)) {
                        append("UI")
                    }
                },
                fontSize = 40.sp,
                fontFamily = fontFamily
            )
        },
        modifier = Modifier.background(color = Color.White, shape = RoundedCornerShape(16.dp)),
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
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = "notification icon",
                    modifier = Modifier.size(35.dp)
                )
            }
            Image(
                painter = painterResource(R.drawable.menimg),
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.clip(shape = RoundedCornerShape(50.dp)).size(40.dp),
                contentDescription = "men image"
            )

        }

    )
}
@Preview
@Composable
fun CustomTopBarPreview(){
    CustomTopBar4()
}