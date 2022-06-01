package ec.edu.espe.antsimulator.view;
import ec.edu.espe.antsimulator.model.AntEater;
import ec.edu.espe.antsimulator.model.Area;
import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.Colony;
import ec.edu.espe.antsimulator.model.FoodPile;
import ec.edu.espe.antsimulator.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("This is the Ant Simulator");
        
        Area area;
        
        int xCoordinate;
        int yCoordinate;
        int height;
        int width;
        
        ArrayList<Colony> colonies;
        ArrayList<FoodPile> foodPiles;
        ArrayList<AntEater> antEaters;
        int totalCells;
        width = 20;
        height = 10;
        int numberOfPiles = 2;
        int tickDuration = 20000;
        
        totalCells = width * height;
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3,4,pheromoneDrops);
        
        ArrayList<Cell> cells = new ArrayList<>();
        for (int i = 0; i < height; i++){
                for(int j = 0; j< width; j++){
                    cells.add(new Cell(i,j,null));
                }
        }
        
        colonies = new ArrayList<>();
        
        foodPiles = new ArrayList<>();
        
        antEaters = new ArrayList<>();
        
        System.out.println("cell-->" + cell);
        
        area = new Area(width, height, numberOfPiles, tickDuration, cells, colonies, foodPiles, antEaters);
        
        System.out.println("Area-->" + area);
        
        short numberOfVechicles;
        short numberOfTires;
        numberOfVechicles = 20000;
        numberOfTires = 20000;
        short total = (short) (numberOfVechicles + numberOfTires);
        
        System.out.println("Total -->" + total);
    }
}
