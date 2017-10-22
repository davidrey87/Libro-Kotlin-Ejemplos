import java.util.*
import java.lang.*

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
