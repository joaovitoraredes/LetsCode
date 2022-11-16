fun main() {

    println("A tabuada de qual valor você deseja: ")
    val n = readln().toInt()

    println("Tabuada do $n:")
    for (i in 0..10) {
        val multiplicacao = n.times(i)
        println("$i x $n = $multiplicacao")
    }
}