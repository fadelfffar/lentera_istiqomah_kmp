package com.example.lentera_istiqomah_kmp.screens.schedule

import android.media.metrics.Event
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.lentera_istiqomah_kmp.screens.TahsinIkhwanPage
import com.example.lentera_istiqomah_kmp.utils.EventCard


@Composable
fun ScheduleScreen(
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff359D59)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        EventCard(
            titleText = "Setiap Senin Malam setelah sholat Maghrib",
            subtitleText = "Tahsin Ikhwan"
        )
        Box(Modifier.height(12.dp))
        EventCard(
            titleText = "Setiap Selasa Malam setelah sholat Maghrib",
            subtitleText = "Tahsin Akhwat"
        )
        Box(Modifier.height(12.dp))
        EventCard(
            titleText = "Setiap Kamis Malam setelah sholat Maghrib",
            subtitleText = "Kajian Ba'daa Maghrib Kamis",
        )
        Box(Modifier.height(12.dp))
        EventCard(
            titleText = "Setiap Jumat malam setelah sholat Maghrib",
            subtitleText = "Kajian Ba'da Maghrib Jumat"
        )
        Box(Modifier.height(12.dp))
        EventCard(
            titleText = "Setiap Jumat",
            subtitleText = "Khutbah Jum'at",
        )
        Box(Modifier.height(12.dp))
        EventCard(
            titleText = "Setiap Ahad pagi setelah sholat Subuh",
            subtitleText = "Kajian Syuruq",
        )
    }
}