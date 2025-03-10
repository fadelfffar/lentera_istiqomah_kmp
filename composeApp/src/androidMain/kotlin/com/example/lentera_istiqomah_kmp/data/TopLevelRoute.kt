package com.example.lentera_istiqomah_kmp.data

import android.provider.ContactsContract.Profile
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector

data class TopLevelRoute<T : Any>(
    val label: String,
    val route: T,
    val icon: ImageVector)
