package com.example.fittracker_android_app.data.model

data class Workout(
    val id: String,
    val name: String,
    val exercises: List<Exercise>
)