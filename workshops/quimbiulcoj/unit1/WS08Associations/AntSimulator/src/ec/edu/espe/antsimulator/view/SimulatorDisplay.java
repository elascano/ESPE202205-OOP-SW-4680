package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.Area;
import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.Colony;
import ec.edu.espe.antsimulator.model.PheromoneDrop;
import java.util.ArrayList;



/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("This is the ant simulator");
        
        int xCoordinate;
        int yCoordinate;
        int height;
        int width;
        
        width = 200;
        height = 100;
        int numberOfPiles = 2;
        int tickDuration = 20000;
        
        
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3,4,pheromoneDrops);
        
        ArrayList<Cell> cells;
        cells = new ArrayList<>();
        
        ArrayList<Colony> colonies;
        colonies = new ArrayList<>();
        
        
        
        System.out.println("Cell ---->"+ cell);
        
        area = new Area()
        
    }
}
