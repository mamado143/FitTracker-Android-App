package com.example.fittracker_android_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.fittracker_android_app.navigation.Navigation
import com.example.fittracker_android_app.ui.theme.FitTrackerAndroidAppTheme

//import dagger.hilt.android.AndroidEntryPoint

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitTrackerAndroidAppTheme {
                FitApp()
            }
        }
    }
}

@Composable
fun FitApp() {
    val navController = rememberNavController()
    Surface {
        Navigation(navController)
    }
}