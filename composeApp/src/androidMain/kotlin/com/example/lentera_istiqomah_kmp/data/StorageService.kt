package com.example.lentera_istiqomah_kmp.data

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

interface StorageService {
    fun addListener(
        userId: String,
        onDocumentEvent: (Boolean, PrayersObject) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        val query = Firebase.firestore.collection("today_prayer_time")
        Log.d(TAG, "query = $query")
        val ashar =  query.whereEqualTo("ashar", true)
            .get()
    }
    fun removeListener()
    fun getPrayer(prayerId: String, onError: (Throwable) -> Unit, onSuccess: (PrayersObject) -> Unit)
}

