package com.rayan.aula001

class Exercicio04 {
}

fun main() {

    var value = 6;

    when {
        value % 2 == 0 -> println("The value $value is par");
        else -> println("The value $value is primor");
    }
}