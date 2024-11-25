package com.example.myapplication

class  Dog {
    init {
        bark()
    }

    fun bark() {
        println("Woof! Woof!")

    }

    fun eat() {
        println("nom nom nom")
    }

}

fun main() {
    val myDog = Dog()
    myDog.bark()
    myDog.eat()
}