package com.example.myapplication

fun main() {
 var computerChoice = " "
    var playerChoice = " "

    println("Rock, Paper, or Scissors? Enter your choice")
    playerChoice = readln()

    val randomNumbers = (1..3).random()

    when (randomNumbers) {

        1 -> {
            computerChoice = "Rock"
        }
        2 -> {

           computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)
    val winner = when {
        playerChoice == computerChoice -> "It's a tie!"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player win!"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player win!"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player win!"
        else -> "Computer win!"

    }
    if ( winner == "It's a tie!") {
        println("It's a tie!")
    } else if (winner == "Player win!") {
        println("Player win!")
    } else {
        println("Computer win!")

    }
    println("Player chose $playerChoice and computer chose $computerChoice")
    println(winner)




}