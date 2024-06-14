package com.example.fittracker_android_app.viewmodels

import androidx.lifecycle.ViewModel
import com.example.fittracker_android_app.data.model.User
import com.example.fittracker_android_app.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {

    fun addUser(user: User) {
        userRepository.addUser(user)
    }

    fun getUserById(id: String): User? {
        return userRepository.getUserById(id)
    }

    fun updateUser(user: User) {
        userRepository.updateUser(user)
    }

    fun deleteUser(user: User) {
        userRepository.deleteUser(user)
    }
}
