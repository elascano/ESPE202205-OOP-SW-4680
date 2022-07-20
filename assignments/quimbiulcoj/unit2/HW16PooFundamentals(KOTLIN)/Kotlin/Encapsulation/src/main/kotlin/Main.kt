class Vehicle{

    //Create private var
    private var tipo:String = ""
    private var marca:String = ""

    //setters and getters
    public fun getTipo():String
    {
        return this.tipo
    }
    public fun setTipo(tipo:String)
    {
        this.tipo = tipo
    }

    public fun getMarca():String
    {
        return this.marca
    }
    public fun setMarca(marca:String)
    {
        this.marca = marca
    }
}

//create main method and create vehicle object
fun main(args: Array<String>){
    var vehicle = Vehicle()
    vehicle.setTipo("Sedan")
    vehicle.setMarca("Nissan")

    println("The type of the vehicle is: ${vehicle.getTipo()}" )
    println("The manufacturer of the vehicle is: ${vehicle.getMarca()}" )

}



