import java.text.DecimalFormat

fun main() {
    val df = DecimalFormat("#.##")

    println("Haverá quantos eleitores? ")
    val eleitores = readln().toInt()

    var votosCandidatoA = 0
    var votosCandidatoB = 0
    var votosCandidatoC = 0

    for (i in 0 until eleitores){

        println("Em qual canditado você irá votar? (A/B/C)")
        val voto = readln()

        when (voto) {
            "A" -> votosCandidatoA += 1
            "B" -> votosCandidatoB += 1
            "C" -> votosCandidatoC += 1
        }
    }

    val porcentagemA: Double = ((votosCandidatoA*100)/eleitores.toDouble())
    val porcentagemB: Double = ((votosCandidatoB*100)/eleitores.toDouble())
    val porcentagemC: Double = ((votosCandidatoC*100)/eleitores.toDouble())

    println("Votos candidato A- $votosCandidatoA (${df.format(porcentagemA)}%)")
    println("Votos candidato B- $votosCandidatoB (${df.format(porcentagemB)}%)")
    println("Votos candidato C- $votosCandidatoC (${df.format(porcentagemC)}%)")
}



















//  for (i in 0..eleitores){
//
//        println("Em qual canditado você irá votar? (A/B/C)")
//
//        when (readln()) {
//            "A" -> votosCandidatoA =+ 1
//            "B" -> votosCandidatoB =+ 1
//            "C" -> votosCandidatoC =+ 1
//        }
//
//    }