package com.rayan.aula001

class Exercicio03 {
}

fun main() {

    var result = calc(10, 10);
    print("The result is: $result");
}

fun calc(n1: Int, n2: Int,  operation: (Int,Int) -> Int) {
    operation(n1, n2);
}