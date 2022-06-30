
/** variables */
fun main(args:Array<String>) {

    //Variables Inmutables: su valor no puede ser cambiado
    val anoNacimiento: Int = 2002
    //anoNacimiento = 2003 no puedo reasignar otro valor
    //println(anoNacimiento)

    //Variables Mutables: su valor si puede ser cambiado
    var edad: Int = 20
    edad = 21
    edad = 23
    //println(edad)

    /** tarea
     * Crear e imprimir variables Mutables de tipo:
     *
     * Int(horasDePractica)
     * string(lenguaje)
     * Boolean(seProgramar)
     * Float(miPeso)
     * Double(miTalla)
     * Char(inicialNombre)
     **/


    var horasDePractica : Int = 6
    var lenguaje: String = "kotlin"
    var seProgramar: Boolean = true
    var miPeso : Float = 60f
    var miTalla : Double = 1.62
    var inicialNombre : Char = 'E'

    println("Horas de practica: $horasDePractica")
    println("Lenguaje: $lenguaje")
    println("Se programar: $seProgramar")
    println("Mi peso: $miPeso")
    println("Talla: $miTalla")
    println("Inicial nombre: $inicialNombre")
}