package ec.edu.espe.animals.model;

/**
 *
 *@author Elkin Pabon, DCCO-ESPE, DEES Developers
 */

public class Salmon extends Fish{

    public Salmon(int id, String description, String cage) {
        super(id, description, cage);
    }

    @Override
    public String toString() {
        return "Salmon{" + '}';
    }

    @Override
    public void feed() {
        System.out.println("Feeding salmon");
    }

    @Override
    public void addToZoo(Zoo zoo) {
         System.out.println("Adding this salmon to the zoo "+zoo);
    }
    
}
