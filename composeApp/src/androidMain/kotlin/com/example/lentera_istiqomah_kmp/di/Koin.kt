package com.example.lentera_istiqomah_kmp.di

import com.example.lentera_istiqomah_kmp.data.InMemoryPrayersStorage
import com.example.lentera_istiqomah_kmp.data.KtorPrayersApi
import com.example.lentera_istiqomah_kmp.data.PrayersApi
import com.example.lentera_istiqomah_kmp.data.PrayersRepository
import com.example.lentera_istiqomah_kmp.data.PrayersStorage
import com.example.lentera_istiqomah_kmp.screens.home.HomeViewModel
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val dataModule = module {
    single {
        val json = Json { ignoreUnknownKeys = true }
        HttpClient {
            install(ContentNegotiation) {
                // TODO Fix API so it serves application/json
                json(json, contentType = ContentType.Any)
            }
        }
    }

    single<PrayersApi> { KtorPrayersApi(get()) }
    single<PrayersStorage> { InMemoryPrayersStorage() }
    single {
        PrayersRepository(get(), get()).apply {
            initialize()
        }
    }
}

val screenModelsModule = module {
    factoryOf(::HomeViewModel)
}

fun initKoin() {
    startKoin {
        modules(
            dataModule,
            screenModelsModule,
        )
    }
}