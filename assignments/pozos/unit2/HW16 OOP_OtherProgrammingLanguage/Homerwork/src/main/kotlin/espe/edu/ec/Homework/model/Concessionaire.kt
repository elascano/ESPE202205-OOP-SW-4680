package espe.edu.ec.Homework.model
import java.util.Scanner
class Concessionaire {
    var user:String;
    var password:String;

    //otra manera de inicializar la variable las variables
    init {
        user=""
        password=""
    }

    //otra manera de tener un constructor

  // constructor(user:String,password:String){
  //      var user=user;
  //      var password=password;
  //  }

    override fun toString(): String {
        return "Concessionaire(user='$user', password='$password')"
    }

    //FUNCIONES
    fun logIn (){
        val scanner = Scanner(System.`in`)
        var userName:String;
        var password:String;
        var user:String="Admin2022";
        var password1:String="AdminPassword2022";
        do {
            println("------Welcome------");
            println("Type your username");
            userName = scanner.nextLine();
            println("Type your password");
            password = scanner.nextLine();
            if (!(user==userName&&password1==password)){
                println("INVALID USERNAME OR PASSWORD");
            }
        }while (!(user==userName&&password1==password));

    }
    fun showCatalogue():ArrayList<Vehicle>{
        var showCar1= Vehicle(treademark = "Ford", model = "Ecosport", color = "Black", price =24.990F)
        var showCar2= Vehicle(treademark = "Chevrolet", model = "Joy Sedán", color = "Red and White", price =18.499F)
        var showCar3= Vehicle(treademark = "Nissan", model = "X-Trail", color = "Red", price =35.500F)
        var showCar4= Vehicle(treademark = "Audi", model = "e-tron", color = "Blue", price =73.200F)
        var showCar5= Vehicle(treademark = "Volkswagen", model = "Beetle", color = "White", price =29.990F)
        var catalogue = ArrayList<Vehicle>();
        catalogue.add(showCar1);
        catalogue.add(showCar2);
        catalogue.add(showCar3);
        catalogue.add(showCar4);
        catalogue.add(showCar5);
        println(catalogue);

        return catalogue;

    }
}