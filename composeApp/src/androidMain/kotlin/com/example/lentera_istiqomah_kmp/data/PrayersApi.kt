package com.example.lentera_istiqomah_kmp.data


import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.utils.io.CancellationException

interface PrayersApi {
    suspend fun getData(): List<PrayersObject>
}



class KtorPrayersApi(private val client: HttpClient) : PrayersApi {
    val db = com.google.firebase.ktx.Firebase.firestore
    val prayers = db.collection("today_prayers_time")
        .get()
        .addOnSuccessListener { result ->
            for (today_prayers_time in result) {
                Log.d(TAG, "${today_prayers_time} => ${today_prayers_time.data}")
            }
        }
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