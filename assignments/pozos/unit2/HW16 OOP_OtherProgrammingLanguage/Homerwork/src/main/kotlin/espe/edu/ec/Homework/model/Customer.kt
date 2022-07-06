package espe.edu.ec.Homework.model

import java.util.Scanner
import java.util.StringJoiner

class Customer{
    var name:String;
    var id:String;
    var phoneNumber:String;
    var email:String

    init {
        this.name ="";
        this.id="";
        this.phoneNumber="";
        this.email="";
    }
    constructor(name:String,id:String,phoneNumber:String,email:String){

    }

    override fun toString(): String {
        return "Customer(name='$name', id='$id', phoneNumber='$phoneNumber', email='$email')"

    }

    fun addCustomer(){
        val scanner = Scanner(System.`in`)
        var newCustomer=Customer(name,id,phoneNumber,email);

        println("Register new Customer");
        println("Type name");
        name=scanner.nextLine();
        println("Type ID");
        id=scanner.nextLine();
        println("Type phone number");
        phoneNumber=scanner.nextLine();
        println("Type email");
        email=scanner.nextLine();
      //  newCustomer.toString()
        println("Customer add!!!-->")
    }

}