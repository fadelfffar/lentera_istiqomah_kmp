import org.gradle.kotlin.dsl.implementation
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    kotlin("plugin.serialization") version "2.0.0"
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    val ktorVersion = "2.3.7"
    val koin_version= "4.1.0-Beta5"
    val voyagerVersion = "1.1.0-beta02"

    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    
    sourceSets {

        //noinspection WrongGradleMethod
        androidMain.dependencies {
            implementation(compose.preview)
            implementation(libs.androidx.activity.compose)
            implementation("io.ktor:ktor-client-android:$ktorVersion")
            implementation("androidx.compose.material:material:1.7.8")
            implementation("com.google.firebase:perf-plugin:1.4.2")
            implementation("com.google.gms:google-services:4.3.8")
            // Kotlin + coroutines
            implementation("androidx.work:work-runtime-ktx:2.7.1")
        }
        commonMain.dependencies {
            implementation(project.dependencies.platform("io.insert-koin:koin-bom:$koin_version"))
            implementation(libs.koin.core)
            implementation(libs.kotlinx.coroutines.core)
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtime.compose)
            implementation(project.dependencies.platform("androidx.compose:compose-bom:2025.02.00"))
            implementation(libs.kotlinx.serialization.json)
            implementation("io.ktor:ktor-client-core:$ktorVersion")
            implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
            implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
            // Screen Model
            implementation("cafe.adriel.voyager:voyager-screenmodel:$voyagerVersion")
            // Koin integration
            implementation("cafe.adriel.voyager:voyager-koin:$voyagerVersion")
            // Material 3 Compose
            implementation(compose.material3)
            implementation("androidx.navigation:navigation-compose:2.8.8")
            // Import the BoM for the Firebase platform
            implementation(project.dependencies.platform("com.google.firebase:firebase-bom:31.0.0"))

            // Declare the dependency for the Firestore library
            implementation(libs.firebase.firestore.ktx)
            implementation("com.google.gms:google-services:4.3.8")

        }
    }
}

android {
    namespace = "com.example.lentera_istiqomah_kmp"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.example.lentera_istiqomah_kmp"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.navigation.compose)
    debugImplementation(compose.uiTooling)
    implementation("com.google.gms:google-services:4.4.2")
    implementation(libs.androidx.core.ktx)
}

