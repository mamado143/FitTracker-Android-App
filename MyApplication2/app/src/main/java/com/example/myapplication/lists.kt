package com.example.myapplication

fun main() {
    val midiList = mutableListOf("mido", "dahir", "ahmed")

    midiList.add("ahmed")
    midiList.removeFirst()
    midiList.removeLast()
    midiList.remove("mido")
    println(midiList)
}