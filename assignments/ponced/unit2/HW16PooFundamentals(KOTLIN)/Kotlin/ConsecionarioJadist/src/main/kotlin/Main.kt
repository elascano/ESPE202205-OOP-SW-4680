fun main() {
    //We create the client data and create the client object
    val cliente = Cliente("Jhon Spencer","jhon_spencer@gmail.com")
    println("Datos primarios del cliente:")
    println("Nombre del Cliente: ${cliente.nombre}")
    println("E-mail del Cliente: ${cliente.email}")

    // create an object from Furgoneta class
    val furgoneta = Furgoneta("Rojo","Volkswagen","Van")
    // call comprar() method
    furgoneta.comprar()
}


