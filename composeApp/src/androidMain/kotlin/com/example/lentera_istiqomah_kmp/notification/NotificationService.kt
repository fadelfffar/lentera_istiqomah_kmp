package com.example.lentera_istiqomah_kmp.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationManagerCompat
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkRequest
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.lentera_istiqomah_kmp.R
import org.jetbrains.compose.resources.getString
import java.util.concurrent.TimeUnit
import kotlin.jvm.java

class NotificationService(
    appContext: Context,
    workerParams: WorkerParameters,
): Worker(appContext, workerParams) {
    override fun doWork(): Result {

        // Show notifications ...


        // Indicate whether the work finished successfully with the Result
        return Result.success()
    }
}
