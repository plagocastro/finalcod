import ej1 as ej1

fun main() {
    println("1")
    var contador = 0
    for (cuenta in ej1(11).tabla7){
        println("7 x $contador = $cuenta")
        contador++
    }
    println("2")
    contador = 1
    val aleatorios = ej2(10){
        Random.nextInt(50,250)
    }
    aleaorios.numeros2.forEach {
        println("$contador = $it")
        contador++
    }

}