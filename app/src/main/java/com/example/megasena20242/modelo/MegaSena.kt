package com.example.megasena20242.modelo

class MegaSena {

    val numeros: MutableSet<Int> = mutableSetOf()

    init {
        setNumeros()
    }

    // Gera números de 1 a 60 até que a lista tenha 6 elementos (lembrando que a lista não terá números repetidos, devido à propriedade da MutableSet
    private fun setNumeros() {
        while (numeros.size < 6) {
            numeros.add((1..60).random())
        }
    }

    // Imprime os números gerados
    override fun toString(): String {
        return this.numeros.toString()
    }
}