package com.rayan.aula001

class Exercicio05 {
}

fun main() {

    var nomes = listOf("Joao", "Pedro", "Fernanda", "Maria");

    var nomesComMensagem = nomes.map { n -> "Ola $n" };

    nomesComMensagem.forEach {
        println(it);
    }
}