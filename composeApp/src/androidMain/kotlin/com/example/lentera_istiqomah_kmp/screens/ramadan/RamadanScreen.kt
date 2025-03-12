package com.example.lentera_istiqomah_kmp.screens.ramadan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RamadanScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff359D59)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Icon on the screen
        androidx.compose.material3.Icon(
            imageVector = Icons.Outlined.DateRange,
            contentDescription = "Ramadan",
            tint = Color(0xFF0F9D58)
        )
        // Text on the screen
        androidx.compose.material3.Text(text = "Ramadan", color = Color.Black)
    }
}
