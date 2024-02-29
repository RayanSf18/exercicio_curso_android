package com.rayan.aula001

class Exercicio07 {
}

fun main() {

    val numeros: ArrayList<Int> = ArrayList()

    var result : Int = 0;
    var i : Int = 0;
    val max = 99;
    while (i < max) {
        var value : Int = i + 1;
        numeros.add(i, value);
        result += numeros.get(i);
        i++;
    }

    println(result);
}