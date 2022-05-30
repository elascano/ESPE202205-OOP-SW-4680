
package ec.edu.espe.antsimulatior.view;

import ec.edu.espe.antsimulatior.model.Cell;
import ec.edu.espe.antsimulatior.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("This in Ant Simulator");
        
     int xCoordinate;
     Cell cell;
     ArrayList<PheromoneDrop>pheromoneDrops;
     pheromoneDrops=new ArrayList<>();
     cell = new Cell(3,4,pheromoneDrops);
        System.out.println("cell = "+cell);
    }
  
}
