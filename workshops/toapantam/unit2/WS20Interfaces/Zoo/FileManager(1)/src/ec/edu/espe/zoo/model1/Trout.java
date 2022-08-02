
package ec.edu.espe.zoo.model1;

/**
 *
* @author Martín Toapanta, ESPE - DCCO, MyWayCode 
 */
public class Trout extends Fish{

    public Trout(int id, String description, String cage) {
        super(id, description, cage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trout{");
        sb.append('}');
        return sb.toString();
    }

    
    @Override
    public void feed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addToZoo(Zoo zoo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
