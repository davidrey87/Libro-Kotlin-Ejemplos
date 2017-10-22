//Obteniendo resultados de diferentes expresiones con estructura de control when
fun main(args: Array<String>) {
    val x = 3
    val y = 10
    var suma = x + y
    when (suma) {
        in 0..10 -> println("La suma es $suma y esta en el rango del 1 al 10")
        !in 0..20 -> println("La suma es $suma y no esta en el rango del 1 al 10")
        else -> println("La suma esta en un rango desconocido")
    }
}