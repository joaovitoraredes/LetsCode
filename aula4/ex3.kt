fun main() {
    val numeros = mutableListOf<Int>()

    println("Entre com 15 números: ")
    for (i in 0..14){
        println("Valor ${i+1}: ")
        numeros.add(i, readln().toInt())
    }
    println(numeros.reversed())
}