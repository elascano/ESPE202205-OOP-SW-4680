
package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.Area;
import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("This isthe Ant Simulator");
        
        Area area;
        
        int xCoordinate;
        
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3,4,pheromoneDrops);
        
        System.out.println("cell -->" +cell);
        area = new Area(xCoordinate)
    }
}
