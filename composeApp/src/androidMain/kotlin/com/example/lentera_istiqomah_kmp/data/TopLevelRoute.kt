package com.example.lentera_istiqomah_kmp.data

import androidx.compose.ui.graphics.vector.ImageVector

data class TopLevelRoute<T : Any>(
    val label: String,
    val route: T,
    val icon: ImageVector)
