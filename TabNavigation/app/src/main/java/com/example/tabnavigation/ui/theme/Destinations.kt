package com.example.tabnavigation.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations {
    val route: String
    val icon: ImageVector
    val title: String
}

object Home : Destinations {
    override val route = "Home"
    override val icon = Icons.Filled.Home
    override val title = "Home"
}
object Settings: Destinations {
    override val route = "Setting"
    override val icon = Icons.Filled.Settings
    override val title = "Setting"
}