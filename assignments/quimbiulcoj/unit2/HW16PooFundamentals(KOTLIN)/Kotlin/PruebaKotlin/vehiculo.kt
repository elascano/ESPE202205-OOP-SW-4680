class vehiculo ( //Para declarar una clase en Kotlin se utiliza la palabra class, seguida del nombre de la clase.

    private val color = ""       //Las propiedades de la clase se declaran con "var" o con "val",
    private val marca = ""       //y siguen las mismas reglas que cualquier variable */
    private val modelo = 0
    private val precio = 0

) {
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

    fun printiar() {
        println(sedan01.$color)
        println(sedan01.$marca)
        println(sedan01.$modelo)
        println(sedan01.$precio)
    }

}

