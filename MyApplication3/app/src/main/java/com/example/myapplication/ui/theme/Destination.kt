package com.example.myapplication.ui.theme

interface Destination {
    val route: String

}
object Dashboard : Destination {
    override val route = "Home"
}
object Details : Destination {
    override val route = "Details"
}