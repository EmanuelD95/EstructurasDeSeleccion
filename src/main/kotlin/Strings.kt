 fun main() {
     // Funciones de Strings (cadenas de Texto)

      val name: String = "emanuel munoz "
      val nickname: String = "emm"

      println(nickname.length) // Longitud de texto

      println(name.plus(nickname)) // Unir textos

      println(name.get(4)) // Obtener letra de posición indicada (Siempre inicia en CERO)

      println(name.equals(nickname)) // Comparar igualdad de valores

      println(nickname.capitalize()) // Colocar en mayúscula la primera letra

      println(name.decapitalize()) // Colocar en minúscula la primera letra

      println(name.replace("emanuel", "emm")) // Reemplazar una valor por otro
      println(name.replace("n", "g"))
      println(name.replace("e", "o"))

      println(name.substring(3)) //Mantener caracteres apartir de la posicion indicada

      println(name.substringAfter(" "))   //Mantener caracteres despues del caracter

      println(name.substringBefore(" ")) //Mantener caracteres antes del caracter

      println(nickname.reversed()) // Invierte posicion de caracteres

      println(("subliminal").reversed())

      println(("reconocer").reversed())
 }