//Primer ejercicio de Kotlin In Action
//Encontrando a la persona mas vieja de una coleccion de personas

data class Person(val name: String,val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice", age = 12),Person("David", age = 30),Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }

    println("The oldest is: $oldest")
}