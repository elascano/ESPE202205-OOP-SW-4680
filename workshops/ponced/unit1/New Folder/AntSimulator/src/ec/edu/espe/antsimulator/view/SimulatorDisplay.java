
package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, Dev's Developers
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("This is the Ant Simulator");
        
        int xCoordinate;
        
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3,4,pheromoneDrops);
        
        System.out.print("cell-->" + cell);
        
    }
    
}
