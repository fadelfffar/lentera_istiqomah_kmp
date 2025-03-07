package com.example.lentera_istiqomah_kmp.data

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class PrayersObject (
    @SerialName("request")
    val request : List<RequestJson>,
    @SerialName("data")
    val data : List<PrayersData>
    )

@Serializable
data class RequestJson (
    @SerialName("path")
    val path : String,
    @SerialName("year")
    val year : String,
    @SerialName("month")
    val month : String,
    @SerialName("date")
    val date : String,
)

@Serializable
data class PrayersData (
    @SerialName("id")
    val id : Int,
    @SerialName("lokasi")
    val lokasi : String,
    @SerialName("daerah")
    val daerah : String,
    @SerialName("jadwal")
    val jadwal : List<PrayersSchedule>,
)

@Serializable
data class PrayersSchedule (
    @SerialName("tanggal")
    val tanggal : String,
    @SerialName("imsak")
    val imsak : String,
    @SerialName("subuh")
    val subuh : String,
    @SerialName("terbit")
    val terbit : String,
    @SerialName("dhuha")
    val dhuha : String,
    @SerialName("dzuhur")
    val dzuhur : String,
    @SerialName("ashar")
    val ashar : String,
    @SerialName("maghrib")
    val maghrib : String,
    @SerialName("isya")
    val isya : String,
    @SerialName("date")
    val prayersDate : String,
)