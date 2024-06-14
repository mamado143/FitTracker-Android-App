package com.example.fittracker_android_app.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fittracker_android_app.data.model.User
import com.example.fittracker_android_app.data.repository.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AuthViewModel(private val userRepository: UserRepository) : ViewModel() {

    private val _user = MutableStateFlow<User?>(null)
    val user: StateFlow<User?> get() = _user

    fun signIn(email: String, password: String) {
        viewModelScope.launch {
            val user = userRepository.getUserById(email)
            if (user != null && user.password == password) {
                _user.value = user
            }
        }
    }

    fun signUp(user: User) {
        viewModelScope.launch {
            userRepository.addUser(user)
            _user.value = user
        }
    }
}