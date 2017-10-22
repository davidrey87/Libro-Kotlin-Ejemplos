//Creando una clase con sus propiedades
fun main(args: Array<String>) { 
    //Creando un nuevo objeto de la clase persona 
    val persona = Persona("David", 'M', 18) 
    //Accediendo a las propiedades de la clase persona 
    println(persona.nombre)
    println(persona.sexo)
    println(persona.edad)
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
}