/**
 * FUNCIONES CON PARÁMETROS
 * */

val m: Int = 20
val n: Int = 5

fun main() {
    mostrarNumero3(m, n)
    suma3(m, n)
    resta3(m, n)
    multiplicacion3(m, n)
    dividir3(m,n)
    promedio3(m,n)
}

fun add1() {
    println("...")
}
fun add2(): Int {
    return 0
}

fun suma3(a: Int, b: Int) {
    println("Suma: ${a+b}")
}
fun resta3(a: Int, b: Int) {
    println("Resta: ${a-b}")
}
fun multiplicacion3(m: Int, n: Int) {
    println("Multiplicacion: ${m*n}")
}
fun dividir3(m: Int, n: Int) {
    println("División: ${m/n}")
}
fun promedio3(m: Int, n: Int) {
    println("Promedioo: ${(m+n)/2}")
}
fun mostrarNumero3(m: Int, n: Int) {
    println("Primer Número: $m \nSegundo Número: $n")
}

