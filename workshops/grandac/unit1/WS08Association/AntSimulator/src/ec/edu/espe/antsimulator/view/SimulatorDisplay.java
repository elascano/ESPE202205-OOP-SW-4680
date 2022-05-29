package ec.edu.espe.antsimulator.view;
import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("This is the Ant Simulator");
        
        int xCoodinate;
        
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3,4,pheromoneDrops);
        System.out.println("cell-->" + cell);
        
    }
}
