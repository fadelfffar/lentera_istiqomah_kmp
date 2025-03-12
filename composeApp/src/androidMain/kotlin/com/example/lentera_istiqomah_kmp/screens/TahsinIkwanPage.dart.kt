package com.example.lentera_istiqomah_kmp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


sealed class Screens(val route: String){
    object TahsinIkhwanPage : Screens("TahsinIkhwan")
    object AddScreen : Screens("AddScreen")
}

@Composable
fun TahsinIkhwanPage() {
    Column {
        Box(Modifier.height(200.dp))
        Text("Tahsin Ikhwan",
            style = TextStyle(fontSize = 24.sp))
    }
}