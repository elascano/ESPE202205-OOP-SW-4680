package ec.edu.espe.leatherFlowerSystem.model;

import java.util.Scanner;



/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Service {
   private String type;
   private String date;
   private String hourOfAttention;
   private float cost;

    public Service(String type, String date, String hourOfAttention, float cost) {
        this.type = type;
        this.date = date;
        this.hourOfAttention = hourOfAttention;
        this.cost = cost;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the hourOfAttention
     */
    public String getHourOfAttention() {
        return hourOfAttention;
    }

    /**
     * @param hourOfAttention the hourOfAttention to set
     */
    public void setHourOfAttention(String hourOfAttention) {
        this.hourOfAttention = hourOfAttention;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return type+","+date+","+ hourOfAttention+","+ cost;
    }
   public void addAppointment(){
       
   }
   public void billService(){
       
   } 
   public static int giveDiscount(int numberOfServices){
       float price;
       float finalPrice=0;
       int discount;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Hola querido cliente, antes de agendar veremos si usted es merecedor de un descuento en nuestra tienda");
       System.out.println("Cuantos servicios desea agendar hoy?");
       numberOfServices = scanner.nextInt();
       if(numberOfServices <= 0){
           System.out.println("Dato incorrecto, por favor escriba una respuesta acorde");
           discount = 0;
           return discount;
       }
       
       if(numberOfServices == 1){
           System.out.println("Por el momento no aplicaremos ningun descuento para usted");
           discount = 0;
           return discount;
       }
       if (numberOfServices == 2){
           System.out.println("Muy bien! usted recibira un pequenio descuento:");
           System.out.print("Cual es el costo de su servicio?: ");
           price = scanner.nextFloat();
           finalPrice = price * 0.05F;
           System.out.println("Su descuento es de: " + finalPrice + "$");
           discount = 5;
           return discount;
       }
       if(numberOfServices >= 3){
           System.out.println("Muy bien! usted recibira un descuento un poco mejor");
           System.out.print("Cual es el costo de su servicio?: ");
           price = scanner.nextFloat();
           finalPrice = price * 0.10F;
           System.out.println("Su descuento es de: " + finalPrice + "$");
           discount = 10;
           return discount;
       }
    return 0;  
   }
   public static boolean chooseService(int serviceOption){
       boolean boolean1;
       Scanner scanner = new Scanner(System.in);
       //int serviceOption;
       System.out.println("----------SERVICIOS-------------");
       System.out.println("1. Depilacion Laser");
       System.out.println("2. Tratamientos Faciales");
       System.out.println("3. Tratamientos de acne");
       System.out.println("4. Difumacion de manchas");
       System.out.println("5. Hidrataciones Profundas");
       System.out.println("6. Peeling Quimico");
       System.out.println("7. Plasma Rico en plaquetas");
       System.out.println("8. Tonificacion Corporal");
       System.out.println("9. Difumacion de Estrias");
       //System.out.println("10. Aumento de gluteos");
       //System.out.println("11. Desintoxicacion lonica");
       //System.out.println("12. Microblanding");
       System.out.println("Listo, antes de agendar escoja el servicio que va a necesitar por favor: ");
       serviceOption = scanner.nextInt();
       if(serviceOption == 1){
           System.out.println("Ha escogido Depilacion Laser");
           boolean1 = true;
           return boolean1;
           
       }
       if(serviceOption == 2){
           System.out.println("Ha escogido Tratamientos Faciales");
           boolean1 = true;
           return boolean1;
       }
        if(serviceOption == 3){
           System.out.println("Ha escogido Tratamientos de acne");
           boolean1 = true;
           return boolean1;
       }
        if(serviceOption == 4){
           System.out.println("Ha escogido Difumacion de manchas");
           boolean1 = true;
           return boolean1;
       }
         if(serviceOption == 5){
           System.out.println("Ha escogido Hidrataciones Profundas");
           boolean1 = true;
           return boolean1;
       }
          if(serviceOption == 6){
           System.out.println("Ha escogido Peeling Quimico");
           boolean1 = true;
           return boolean1;
       }
           if(serviceOption == 7){
           System.out.println("Ha escogido Plasma Rico en plaquetas");
           boolean1 = true;
           return boolean1;
       }
            if(serviceOption == 8){
           System.out.println("Ha escogido Tonificacion Corporal");
           boolean1 = true;
           return boolean1;
       }
             if(serviceOption == 9){
           System.out.println("Ha escogido Difumacion de Estrias");
           boolean1 = true;
           return boolean1;
       }
              /*if(serviceOption == 10){
           System.out.println("Ha escogido Aumento de gluteos");
           boolean1 = true;
           return boolean1;
       }*/
              
              if(serviceOption <= 0 || serviceOption >9){
                  System.out.println("Ingrese una opcion valida");
                  boolean1 = false;
                  return boolean1;
              }
       return false;  
   }
   
   
}
