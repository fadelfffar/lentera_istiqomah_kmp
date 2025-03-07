package com.example.lentera_istiqomah_kmp.data

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class PrayersRepository (
    private val prayersApi: PrayersApi,
    private val prayersStorage: PrayersStorage
){
    private val scope = CoroutineScope(SupervisorJob())

    fun initialize() {
        scope.launch {
            refresh()
        }

        suspend fun refresh () {

        }
    }
    suspend fun refresh() {
        prayersStorage.saveObjects(prayersApi.getData())
    }

    fun getObjects(): Flow<List<PrayersObject>> = prayersStorage.getObjects()
}