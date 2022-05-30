
package ec.edu.espe.antisumator.view;

import ece.edu.espe.antisimulator.model.Cell;
import ece.edu.espe.antisimulator.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class SimulatorDisplay {

    private static ArrayList<Object> phermoneDrops;
    public static void main(String arg){
        System.out.println("This is the Ant simulator");
        int xCoordinate;
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        phermoneDrops=new ArrayList<>();
        cell=new Cell(3,4);
        System.out.println("cell--->"+cell);
        
    }
}
