package com.rayan.aula001

class Exercicio04 {
}

fun main() {

    var numeros = ArrayList<Int>();

    for (i in 0..100 - 1) {
        numeros.add(i, i + 1);
    }

    var listaSoDePares = numeros.filter { n -> n % 2 == 0 };

    println(listaSoDePares);
}