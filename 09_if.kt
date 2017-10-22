//Comparando dos numéros con estructura de control if
fun main(args: Array<String>) {
    val x = 3
    val y = 7
    var maximo: Int
    if (x < y){
        maximo = y
    }else{
        maximo = x
    }
    println(maximo)
}