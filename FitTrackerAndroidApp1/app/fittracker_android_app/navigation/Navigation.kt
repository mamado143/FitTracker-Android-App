package com.example.fittracker_android_app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fittracker_android_app.ui.screens.*

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "sign_in") {
        composable("sign_in") { SignInScreen(navController) }
        composable("profile") { ProfileScreen(navController) }
        composable("workout_routines") { WorkoutRoutineScreen(navController) }
        composable("real_time_tracking") { RealTimeTrackingScreen(navController) }
        composable("progress_visualization") { ProgressVisualizationScreen(navController) }
    }
}

@Preview
@Composable
private fun NavigationPrev() {
    Navigation(navController = rememberNavController())
}