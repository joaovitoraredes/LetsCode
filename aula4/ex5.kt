fun main() {
    val primos = mutableListOf<Int>()
    println("Entre com um valor")
    val n = readln().toInt()

    for (i in 2 until n) {
        for (j in 2..i) {
            when {
                i % j == 0 -> if (i == j) primos.add(i)
                else break
            }
        }
    }
    println(primos)
}