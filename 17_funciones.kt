//Creando una clase con sus propiedades
fun main(args: Array<String>) { 
    //Creando un nuevo objeto de la clase persona 
    val persona = Persona("David", 'M', 10) 
    //Accediendo a las propiedades de la clase persona 
    println(persona.adulto())
}
//Creando la clase persona
class Persona{ 
    //Definiendo las propiedades de la clase persona 
    val nombre: String 
    val sexo: Char 
    var edad: Int 
    //Colocando un constructor a la clase persona 
    constructor(nombre: String , sexo: Char, edad: Int){ 
        this.nombre = nombre 
        this.sexo = sexo 
        this.edad = edad 
    }
    //Colocando una funcion a nuestra clase para saber si es mayor de edad
    fun adulto(): Boolean {
        return if (this.edad > 17) true else false
    }
}