
import ec.edu.espe.antsimulator.model.Area;
import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.Colony;
import ec.edu.espe.antsimulator.model.PheromoneDrop;
import ec.edu.espe.antsimulator.view.Arraylist;
import java.util.ArrayList;

/**
 *
 * @author Martín Toapanta, DCCO-ESPE
 */
public class simulatorDisplay {
    public static void main(String[] args) {
        System.out.println("This is the Ant simulator");
        
        int xCoordinate:
        int yCoordinate;
        int height;
        int width;
        
        width = 200;
        height = 100;
        int numberOfPiles = 2;
        int tickDuration = 20000;
        
        
        Cell cell; 
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new Arraylist<>();
        cell = new Cell(3,4,pheromoneDrops);
        
        ArrayList<Cell> cells; 
        cells = new ArrayList<>();
        
        ArrayList<antEater> antEaters;
        antEaters = new ArrayList<>();
        ArrayList<Colony> colonies;
        colonies = new ArrayList<>();
        System.out.printIn("cell -->" + cell);
        
        area = new Area(width, height, numberOfPiles, height);
    }
    totalCells = width * heigth
}
