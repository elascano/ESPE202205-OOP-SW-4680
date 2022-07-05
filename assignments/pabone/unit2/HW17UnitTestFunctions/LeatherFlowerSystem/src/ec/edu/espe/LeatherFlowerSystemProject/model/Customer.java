
package ec.edu.espe.LeatherFlowerSystemProject.model;
import java.util.Scanner;
/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Customer {
    private String names;
    private String surnames;
    private String cellphone;
    private String ID;
    private String email;

    public Customer(String names, String surnames, String cellphone, String ID, String email) {
        this.names = names;
        this.surnames = surnames;
        this.cellphone = cellphone;
        this.ID = ID;
        this.email = email;
    }

    public Customer() {
    }
    

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "names=" + names + ", surnames=" + surnames + ", cellphone=" + cellphone + ", ID=" + ID + ", email=" + email + '}';
    }
    
    
    //FUNTIONS
    
    public void scheduleAppointment(){
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        Service service = new Service();
        
        System.out.println("Type Names: ");
        String name= scanner.nextLine();
        System.out.println("Type Surnames: ");
        String surname= scanner.nextLine();
        System.out.println("Type Cellphone: ");
        String cellphone= scanner.nextLine();
        System.out.println("Type ID: ");
        String ID= scanner.nextLine();
        System.out.println("Type Email: ");
        String email= scanner.nextLine();
        //customer.toString();
        System.out.println(customer.toString());
        System.out.println("choose service");
        service.otro();
    }
    public void deferAppointment(){
        
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        Service service = new Service();
        
      
        System.out.println("A P L A Z A R   C I T A ");
        System.out.println("- Escriba su nombre: ");
            String name= scanner.nextLine();
        System.out.println("- Escriba su apellido: ");
            String surname= scanner.nextLine();
        System.out.println("- Escriba su cedula: ");
            String ID= scanner.nextLine();
        System.out.println("- Escriba su numero de Telefono: ");
            String cellphone= scanner.nextLine();
        System.out.println("\nEstimado Cliente: "+ name +" "+ surname ); 
        System.out.println("con C.I "+ ID );
        System.out.println("Escriba la fecha a la cual quiere que se aplaze su cita."); 
        System.out.println("- DIA: ");
            String day= scanner.nextLine();
        System.out.println("- MES: ");
            String month= scanner.nextLine();    
        System.out.println(" Estimado cliente, su cita se aplazo para la fecha: dd/mm [" + day +" / "+ month + "]\n\n" );
            
       
   
        
        
        
    }
    public void calcelAppointment(){
        
    }
    }
