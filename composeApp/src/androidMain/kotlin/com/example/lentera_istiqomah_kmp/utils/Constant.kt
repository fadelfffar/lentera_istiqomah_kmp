package com.example.lentera_istiqomah_kmp.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import com.example.lentera_istiqomah_kmp.data.TopLevelRoute

object Constants {
    val BottomNavItems = listOf(
        // Home screen
        TopLevelRoute(
            label = "Beranda",
            route = "home",
            icon = Icons.Outlined.Home,
        ),
        // Search screen
        TopLevelRoute(
            label = "Acara Masjid",
            route = "schedule",
            icon = Icons.Outlined.DateRange,
        ),
        // Ramadan Screen
        TopLevelRoute(
            label = "Ramadan",
            route = "ramadan",
            icon = Icons.Outlined.DateRange
        ),
        // Profile screen
        TopLevelRoute(
            label = "Pengaturan",
            route = "settings",
            icon = Icons.Outlined.Settings,
        )
    )
}