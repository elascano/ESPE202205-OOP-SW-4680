// create a Furgoneta class that inherits Vehiculo class
class Furgoneta(val color:String, marca:String, tipo:String): Vehiculo(marca,tipo){
    // create a specific implementation for comprar() method
    // in Furgoneta class
    override fun comprar() {
        super.comprar()
        println("Comprar vehiculo con las siguientes caracteristicas:")
        println("Color del vehiculo: $color")
        println("Marca del vehiculo: $marca")
        println("Tipo del Vehiculo: $tipo")
    }
}

