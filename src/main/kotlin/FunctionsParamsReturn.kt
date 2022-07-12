/**
 * FUNCIONES CON PARÁMETROS Y CON RETORNO
 * */


val p: Int = 15
val q: Int = 3

fun main() {
    //sum1()
    //println(sum2())
    //sum3(p, q)

    println(mostrarNumero4(p, q))
    println("Suma:${sumar4(p, q)}")
    println("Resta:${restar4(p, q)}")
    println("Producto:${multiplicar4(p, q)}")
    println("Cociente:${dividir4(p, q)}")
    println("Promedio:${promediar4(p, q)}")
}

fun sum1() {
    println(p+q)
}
fun sum2(): Int {
    return p+q
}
fun sum3(a: Int, b: Int) {
    println(a+b)
}
/** TAREA:
 * 1. Crear función:
 * Sumar: sumar4()
 * Restar: restar4()
 * Multiplicar: multiplicar4()
 * Dividir: dividir4()
 * Promediar: promediar4()
 * */
fun mostrarNumero4(a: Int, b: Int): String{
    return "Primer numero: $a \nSegundo numero: $b \n"
}
fun sumar4(a: Int, b: Int): Int{
    return a+b
}
fun restar4(a: Int, b: Int): Int {
    return a - b
}
fun multiplicar4(a: Int, b: Int): Int {
    return a * b
}
fun dividir4(a: Int, b: Int): Int {
    return a / b
}
fun promediar4(a: Int, b: Int): Int {
    return (a + b)/2
}
