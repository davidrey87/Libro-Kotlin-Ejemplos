fun main(args: Array<String>) {
    //Cadena escapada
    val text1 = "Hola Mundo 1!\nHola Mundo 2!\nHola Mundo 3!\n"
    println(text1)

    //Cadena delimitada por triple camilla que puede contener saltos de linea y cualquier otro carácter
    val text2 = """
    fun main(args: Array<String>) {
        println("Hola Mundo")
    }
    """
    println(text2)
}