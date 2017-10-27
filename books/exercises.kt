/*
Kotlin es un lenguaje de programación que corre en la Maquina Virtual de Java (JVM) y
 ha sido desarrollado por JetBrains. Kotlin es interoperable con código Java. 
 Kotlin se puede utlizar donde Java lo es hoy en dia.

Para correr ejemplos en Kotlin puedes hacerlo en linea sobre esta pagina https://try.kotl.in/.

El primer objetivo de Kotlin es proveer mas claridad, productividad y una alternativa a 
Java en todos los contextos en los que este se aplica hoy en dia. Kotlin puede ayudar a 
lograr los mismos objetivos de Java pero con menos codigo.

Las areas mas comunes de Kotlin
Construir server-side code (tipicamente, backends de aplicaciones web)
Construir aplicaciones mobiles que pueden correr en dispositivos Android.

Kotlin tambien puede ser compilado a JavaScript, permitiendo correr Kotlin en el navegador.

En kotlin no es necesario definir tipo de variable ya que este se 
determina automaticamente según el contexto. La abilidad para determinar esto por el 
lenguaje se conoce como “type inference”
*/

//Ejercicios de "Kotlin Language Documentation"
fun main(args: Array<String>) {

    // Comentario en linea
    /* Comentario en
    bloque */

    //*************************
    //Sintaxis basica funciones
    //*************************
    val exercise = Exercise()
    //Funcion Noral
    println("Sumando dos numeros: " + exercise.sum(1,3))
    //Funcion tipo de retorno inferido
    println("Sumando dos numeros: " + exercise.sumOpc(1,4))

    //*************************
    //Variables
    //*************************
    //Variables inmutables, despues de asignarse no podran reasignarse "val"
    val a: Int = 1 //Variable asignada inmediatamente
    val b = 2 // Variable con tipo de dato Int inferido
    val c: Int //El tipo de dato es asignado cuando no hay informacion a inferir
    c = 3 //Asignacion diferida
    //Variables mutables que pueden reasignarese
    var d = 2
    d += 3

    //***********************
    //Plantillas de string o cadena
    //***********************
    var e = 1
    // simple
    val s1 = "e es $e"
    println(s1)
    
    e = 2
    // expresion
    val s2 = "${s1.replace("es", "era")}, pero ahora es $e"
    println(s2)

    //************************
    //Expresion condicional
    //************************
    println("Mayor: " + exercise.maxOf(1,3))
    //Funcion tipo de retorno inferido
    println("Mayor: " + exercise.maxOfOpc(1,4))

    //***********************
    //Loop
    //***********************
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
        println("El elemento $index es ${items[index]}")
        index++
    }

    //***********************
    //Rango
    //***********************
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("Esta en el rango")
    }

    //**********************
    //Arreglos
    //**********************
    
    val arr = arrayOf(1, 2, 3);
    for (item in arr) {
        println(item);
    }

    //*********************
    //Strings
    //*********************

    val s = "Hello, world!\n"
    println(s)

    val text = """
    for (c in "foo"){
        print(c)
    }
    """
    println(text)

    val text2 = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
        """.trimMargin()
    println(text2)

}

class Exercise{
    //Funcion normal
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    //Funcion con tipo de retorno inferido
    fun sumOpc(a: Int, b: Int) = a + b

    //Expresiones condicionales
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    //Usando if como una expresion
    fun maxOfOpc(a: Int, b: Int) = if (a > b) a else b

}