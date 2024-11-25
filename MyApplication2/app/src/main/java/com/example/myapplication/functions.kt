package com.example.myapplication

fun main(){

    // Call Function

    makeCoffee(sugarCount = 1)

    makeCoffee(sugarCount = 2)

    makeCoffee(sugarCount = 30)

}



// Define Function

fun makeCoffee(sugarCount : Int){

    println("Coffee with $sugarCount spoons of sugar")

    if  (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar")
    } else {
        println("Coffee with $sugarCount spoons of sugar")

    }

}