package com.example.lentera_istiqomah_kmp.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.lentera_istiqomah_kmp.utils.PrayersCard

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff359D59)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        PrayersCard(
            prayerNameText = "Imsak",
            prayerTime = "04:22"
        )
        Box(Modifier.height(4.dp))
        PrayersCard(
            prayerNameText = "Subuh",
            prayerTime = "04:32"
        )
        Box(Modifier.height(4.dp))
        PrayersCard(
            prayerNameText = "Syuruq",
            prayerTime = "05:44"
        )
        Box(Modifier.height(4.dp))
        PrayersCard(
            prayerNameText = "Dzuhur",
            prayerTime = "11:56"
        )
        Box(Modifier.height(4.dp))
        PrayersCard(
            prayerNameText = "Ashar",
            prayerTime = "15:03"
        )
        Box(Modifier.height(4.dp))
        PrayersCard(
            prayerNameText = "Maghrib",
            prayerTime = "18:00"
        )
        Box(Modifier.height(4.dp))
        PrayersCard(
            prayerNameText = "Isya",
            prayerTime = "19:09"
        )
        Box(Modifier.height(4.dp))
    }
}