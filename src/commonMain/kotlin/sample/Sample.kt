import ej1 as ej1

fun main() {
    var contador = 0
    for (cuenta in ej1(11).tabla7){
        println("7 x $contador = $cuenta")
        contador++
    }
}