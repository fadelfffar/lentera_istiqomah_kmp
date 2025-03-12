package com.example.lentera_istiqomah_kmp.utils

import android.graphics.Shader.TileMode
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lentera_istiqomah_kmp.R

@Preview
@Composable
fun EventCard() {
    Card(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 4.dp)
            .size(width = 400.dp, height = 60.dp),
//        colors =
//        backgroundColor = _root_ide_package_.androidx.compose.ui.graphics.Color(
//            0xffF9FCF2
//        ),
        shape = MaterialTheme.shapes.small,
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(Modifier.width(16.dp))
            Image(
                painter = androidx.compose.ui.res.painterResource(id = R.mipmap.icon_imsyak_foreground),
                contentDescription = "",
                Modifier.size(height = 60.dp, width = 30.dp)
            )
            Box(Modifier.width(16.dp))
            Column(
            ) {
//                Box(Modifier.height(8.dp))
                Text("Setiap Senin Malam setelah sholat Maghrib",
                    style = TextStyle(fontWeight = FontWeight.W400, fontSize = 12.sp
                    )
                )
                Text("Tahsin Ikhwan",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp
                    )
                )
            }
        }
    }
}

