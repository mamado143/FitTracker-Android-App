package com.example.fittracker_android_app.di



import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.fittracker_android_app.data.repository.UserRepository
import com.example.fittracker_android_app.viewmodels.AuthViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Koin module for the application
 */
val appModule = module {
    single { UserRepository() }
    viewModel { AuthViewModel(get()) }
}