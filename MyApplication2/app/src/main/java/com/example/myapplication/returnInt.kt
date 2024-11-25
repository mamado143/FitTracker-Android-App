package com.example.myapplication

fun main() {
   var myResult =  add(5, 10)
    println("The sum of 5 and 10 is $myResult")
}
fun add (num1 : Int, num2: Int) : Int {
    val result = num1 + num2
    // println("The sum of $num1 and $num2 is $result")
    return result

}