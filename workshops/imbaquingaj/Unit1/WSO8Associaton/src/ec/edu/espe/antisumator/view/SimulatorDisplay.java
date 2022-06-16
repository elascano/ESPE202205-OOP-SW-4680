package ec.edu.espe.antisumator.view;

import ece.edu.espe.antisimulator.model.AntEaters;
import ece.edu.espe.antisimulator.model.Area;
import ece.edu.espe.antisimulator.model.Cell;
import ece.edu.espe.antisimulator.model.Colony;
import ece.edu.espe.antisimulator.model.FoodPile;
import ece.edu.espe.antisimulator.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Imbaquinga Jose, DCC0-ESPE: SyntaxError
 */
public class SimulatorDisplay {

    public static void main(String[] args) {
      System.out.println("This is the AntSimulator");
        
        Area area;
        
        int xCoordinate;
        int yCoordinate;
        int height;
        int width;
        
        width = 20;
        height = 10;
        int numberOfPiles = 2;
        int tickDuration = 20000;
        ArrayList<Cell> cells;
        ArrayList<Colony> colonies;
        ArrayList<FoodPile> foodPiles;
        ArrayList<AntEaters> antEaters; 
        int totalCells;
        
        totalCells = width + height;
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3,4,pheromoneDrops);
        
        
        cells = new ArrayList<>();
        for(int i = 0 ; i < height ; i++){
            for(int j = 0 ; j < width ; j++){
                cells.add(new Cell(i,j,null));  
            }
        }
        
        colonies = new ArrayList<>();
        
        foodPiles = new ArrayList <>();
        
        antEaters = new ArrayList<>();
        
        System.out.println("cell --> " + cell);
        
        area = new Area(width, height, numberOfPiles, tickDuration, cells, colonies, antEaters ,foodPiles);
        
        System.out.println("Area -->" + area);
    }
}