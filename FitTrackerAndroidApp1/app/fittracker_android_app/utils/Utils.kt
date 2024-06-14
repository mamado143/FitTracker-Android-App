package com.example.fittracker_android_app.utils

import java.util.UUID

fun generateId(): String {
    return UUID.randomUUID().toString()
}