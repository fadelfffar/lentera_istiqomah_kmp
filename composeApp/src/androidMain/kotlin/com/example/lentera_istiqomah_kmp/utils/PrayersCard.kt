package com.example.lentera_istiqomah_kmp.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lentera_istiqomah_kmp.R

@Composable
fun PrayersCard(prayerNameText: String, prayerTime :String) {
    Card(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 4.dp)
            .size(width = 400.dp, height = 60.dp),
        backgroundColor = Color(
            0xffF9FCF2
        ),
        elevation = 3.dp,
        shape = MaterialTheme.shapes.small
    ) {
        Row {
            Divider(Modifier.width(12.dp))
            Image(
                painter = androidx.compose.ui.res.painterResource(id = R.mipmap.icon_imsyak_foreground),
                contentDescription = "",
                Modifier.size(height = 60.dp, width = 30.dp)
            )
            Divider(Modifier.width(12.dp))
            Column {
                Text(
                    text = prayerNameText,
                    style = TextStyle(
                        color = _root_ide_package_.androidx.compose.ui.graphics.Color(
                            0xff778288
                        ),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400
                    ),
                    modifier = Modifier
                        .padding(4.dp),
                    textAlign = TextAlign.Left,
                )
                Text(
                    text = prayerTime,
                    style = TextStyle(
                        color = _root_ide_package_.androidx.compose.ui.graphics.Color(
                            0xff474E52
                        ),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .padding(4.dp),
                    textAlign = TextAlign.Left,
                )
            }
        }
    }
}