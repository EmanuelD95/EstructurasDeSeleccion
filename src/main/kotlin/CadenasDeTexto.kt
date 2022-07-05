import com.sun.tools.javac.Main

fun main (){
    //Concatenar =unir
    val name1: String = "Ema"
    val name2: String = "nuel"
    println("Ema"+"nuel")
    println(name1 + name2)
    println(name1.plus(name2))

    var numeroDeGatos = 5
    var numeroDePerros = 3
    println("Tengo $numeroDeGatos gatos y $numeroDePerros perros")
    println("Tengo ${numeroDeGatos + numeroDePerros} animales")

    /** Tarea:
     * Crear pequeña descripción con datos personales
     * nombre (name), edad (age), talla (size), peso (weight), curso (course), comida favorita (favoriteFood)
     * deporte (sport), numero de hermanos (brothersNumber)
     * "Mi nombre es Emanuel, tengo 20 años, mido 1,70 y peso 48,5 kg y estudio Kotlin.
     * Mi plato favorito es el Ceviche y me encanta jugar Fútbol con mis 3 hermanos."
     * */

    var name : String = "Emanuel"
    var age : Int = 20
    var size : Double = 1.70
    var weight : Float = 48.5f
    var course : String = "Kotlin"
    var favoriteFood : String = "Ceviche"
    var sport : String = "Futbol"
    var brothersNumber : Int = 3

    println("Mi nombre es $name, tengo $age anos, mido $size y peso ${weight}kg y estudio $course mi plato favorito es el $favoriteFood" +
            " y me encanta jugar $sport con mis $brothersNumber hermanos.")

}