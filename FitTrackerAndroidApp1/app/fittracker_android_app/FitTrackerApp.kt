package com.example.fittracker_android_app


import android.app.Application
import com.example.fittracker_android_app.di.appModule
import org.koin.core.context.startKoin

class FitTrackerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule)
        }
    }
}