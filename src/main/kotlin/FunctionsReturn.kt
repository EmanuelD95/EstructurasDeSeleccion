/**
 * FUNCIONES CON RETORNO
 * */

// val nombreDeVariable: TipoDeVariable = valorDeVariable
val x: Int = 20
val y: Int = 4

fun main() {
    println(mostrarNumeros())

    println(sumar())
    println(restar())
    println(multiplicar())
    println(dividir())
    println(promediar())
}

/** TAREA:
 * 1. Crear función:
 * Sumar: add()
 * Restar: subtract()
 * Multiplicar: multiply()
 * Dividir: divide()
 * Promediar: average()
 * */

// Funciones Básicas
fun suma() {
    println(x+y)
}

// Función con Retorno
fun sumar(): Int {
    return x+y
}
fun restar(): Int {
    return x-y
}
fun multiplicar(): Int {
    return x*y
}
fun dividir(): Int {
    return x/y
}
fun promediar(): Int {
    return (x+y)/2
}
fun mostrarNumeros(): String{
    return "Primer Número: $x \nSegundo Número: $y"
}

