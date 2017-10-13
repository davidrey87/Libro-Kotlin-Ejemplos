//Usando val-inmutables y var-mutables
fun main(args: Array<String>) {
    val x: Int = 1
    val y: Int = 2
    var total: Int = 0
    println("El total incial es $total")
    total = x + y
    println("La suma es $total")
}