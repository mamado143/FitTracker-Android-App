package com.example.fittracker_android_app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun RealTimeTrackingScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Real-Time Tracking", style = MaterialTheme.typography.bodyMedium,    onTextLayout = {})
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("progress_visualization") }) {
            Text(text = "Go to Progress Visualization",    onTextLayout = {})
        }
    }
}
