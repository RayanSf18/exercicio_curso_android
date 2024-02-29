package com.rayan.aula001

class Exercicio06 {
}

fun main() {

    val numeros: ArrayList<Int> = ArrayList()

    for (i in 0..100) {
        var value : Int = i * 2;
        numeros.add(i, value);
    }
}