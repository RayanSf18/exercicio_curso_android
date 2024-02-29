package com.rayan.aula001

class Exercicio05 {
}

fun main() {

    val numeros: Array<Int> = arrayOf(40);

    for (i in 0..numeros.size - 1) {
        var value : Int = i * 2;
        numeros.set(i, value);
    }
}