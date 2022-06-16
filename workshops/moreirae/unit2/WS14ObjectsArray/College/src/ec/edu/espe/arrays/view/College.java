
package ec.edu.espe.arrays.view;
import ec.edu.espe.arrays.model.People;
/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class College {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       People people[] = new People[8];
       
       people[0] = new People(1, "Erick Moreira", "OOP");
       people[1] = new People(2, "Luis Burbano", "OOP");
       people[2] = new People(3, "Joel Arguello", "OOP");
       people[3] = new People(4, "Roberto Bedon", "OOP");
       people[4] = new People(5, "Steven Pozo", "OOP");
       people[5] = new People(6, "Danilo Caiza", "OOP");
       people[6] = new People(7, "Daniel Chiriboga", "OOP");
       people[7] = new People(8, "Ronny Ibarra", "OOP");
       
       for (int i = 0; i <8; i++){
           System.out.println("Student (" + (i+1)+ ")\t-->"+people[i]);
       }
    }
}
