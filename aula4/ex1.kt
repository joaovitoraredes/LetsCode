fun main() {
    val numeros = mutableListOf<Int>()

    println("Entre com 10 números")
    for (i in 1..10) {
        println("Valor $i: ")
        numeros.add(readln().toInt())
    }

    numeros.sort() //Para poder pegar o menor e maior pela ordem crescente na lista
    println("Menor Valor ${numeros.first()}")
    println("Maior Valor ${numeros.last()}")
}