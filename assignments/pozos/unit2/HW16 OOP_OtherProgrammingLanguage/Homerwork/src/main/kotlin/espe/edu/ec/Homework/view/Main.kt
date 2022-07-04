import espe.edu.ec.Homework.model.Concessionaire
import espe.edu.ec.Homework.model.Customer
import espe.edu.ec.Homework.model.Vehicle

fun main(args: Array<String>) {

   val admin=Concessionaire();
   val customer = Customer(name="",id="", phoneNumber = "", email = "");
   val car=Vehicle(treademark="", model = "", color = "", price =0F);

   admin.logIn();
   customer.addCustomer();
   println(customer.toString());
   println("Car's catalogue");
   admin.showCatalogue();

}