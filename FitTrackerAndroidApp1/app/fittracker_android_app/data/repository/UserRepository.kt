package com.example.fittracker_android_app.data.repository

import com.example.fittracker_android_app.data.model.User

class UserRepository {

    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        users.add(user)
    }

    fun getUserById(id: String): User? {
        return users.find { it.id == id }
    }

    fun updateUser(user: User) {
        val index = users.indexOfFirst { it.id == user.id }
        if (index != -1) {
            users[index] = user
        }
    }

    fun deleteUser(user: User) {
        users.remove(user)
    }
}
