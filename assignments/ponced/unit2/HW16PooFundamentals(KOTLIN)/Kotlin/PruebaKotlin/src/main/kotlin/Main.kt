fun main() {
   // var ferrary: Vehiculo = Vehiculo()

   // ferrary.arrancar()
    val course = Course("C001", "Kotlin Basics")
    println("Course data: $course")

}

class Vehiculo {
    var color = ""       //Las propiedades de la clase se declaran con "var" o con "val",
    var marca = ""       //y siguen las mismas reglas que cualquier variable */
    var modelo = 0
    var precio = 0


    fun arrancar() {
        println("Enciende el vehiculo")      //los metodos de las clases son creadas con la palabra reservada "fun"
    }

    fun detenerse() {
        println("Detiene el vehiculo")
    }

    fun acelerar() {
        println("Aumenta la velocidad del vehiculo")

    }

    fun frenar() {
        println("reduce la velocidad del vehiculo")
    }
}