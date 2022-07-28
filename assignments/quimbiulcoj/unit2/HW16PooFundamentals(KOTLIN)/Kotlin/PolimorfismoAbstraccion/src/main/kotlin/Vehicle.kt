// create a sealed class called Vehicle
sealed class Vehicle
// create two data classes that inherit Vehicle class
data class Motorcycle(val manufacturer: String, val type: String): Vehicle()
data class Car(val manufacturer: String, val type: String): Vehicle()

// create a run()  method that can be called
// from a class that inherits Vehicle class
fun Vehicle.run() {
    // define the run() implementation
    // based on specific class
    when(this) {
        is Motorcycle -> println("Running with two wheels")
        is Car -> println("Running with four wheels")
    }
}

