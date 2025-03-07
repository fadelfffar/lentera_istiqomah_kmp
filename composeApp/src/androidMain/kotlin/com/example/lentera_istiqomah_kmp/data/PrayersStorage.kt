package com.example.lentera_istiqomah_kmp.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

interface PrayersStorage {
    suspend fun saveObjects(newObjects: List<PrayersObject>)
    fun getObjects(): Flow<List<PrayersObject>>
}

class InMemoryPrayersStorage : PrayersStorage {
    private val storedObjects = MutableStateFlow(emptyList<PrayersObject>())

    override suspend fun saveObjects(newObjects: List<PrayersObject>) {
        storedObjects.value = newObjects
    }

    override fun getObjects(): Flow<List<PrayersObject>> = storedObjects
}