package com.example.lentera_istiqomah_kmp.screens.home

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import com.example.lentera_istiqomah_kmp.data.PrayersObject
import com.example.lentera_istiqomah_kmp.data.PrayersRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class HomeViewModel(prayersRepository: PrayersRepository) : ScreenModel {
    val objects: StateFlow<List<PrayersObject>> =
        prayersRepository.getObjects()
            .stateIn(screenModelScope, SharingStarted.WhileSubscribed(5000), emptyList())
}