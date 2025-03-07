package com.example.lentera_istiqomah_kmp.data


import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.utils.io.CancellationException

interface PrayersApi {
    suspend fun getData(): List<PrayersObject>
}

class KtorPrayersApi(private val client: HttpClient) : PrayersApi {
    companion object {
        private const val API_URL =
            "https://api.myquran.com/v2/sholat/jadwal/1420/2025-03-7"
    }

    override suspend fun getData(): List<PrayersObject> {
        return try {
            client.get(API_URL).body()
        } catch (e: Exception) {
            if (e is CancellationException) throw e
            e.printStackTrace()

            emptyList()
        }
    }
}