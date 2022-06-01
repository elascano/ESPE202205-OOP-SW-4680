package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.Ant;
import ec.edu.espe.antsimulator.model.AntEater;
import ec.edu.espe.antsimulator.model.Area;
import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.Colony;
import ec.edu.espe.antsimulator.model.FoodPile;
import ec.edu.espe.antsimulator.model.Leaf;
import ec.edu.espe.antsimulator.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("This is the Ant Simulator");
        
        Area area;
        
        int xCoordinate;
        int yCoordinate;
        int height;
        int width;
        
        ArrayList<Cell> cells;
        ArrayList<Colony>colonies;
        ArrayList<FoodPile> foodPiles;
        ArrayList<AntEater> antEaters;
        int totalCells;
        
        width = 20;
        height = 10;
        int numberOfPilesOfFood = 2;
        int tickDuration = 2000;
       
        
        totalCells = width = height;
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3,4,pheromoneDrops);
   
        cells = new ArrayList<>();
        for (int i = 0; 1 < height; i++) {
            for (int j = 0; j < width; j++) {
               cells.add(new Cell(i, j, null)); 
            }
        }
        
        colonies = new ArrayList<>();
        
        foodPiles = new ArrayList<>();
        
        antEaters = new ArrayList<>();
        
        System.out.println("cell -->" + cell);
        
        area = new Area(width, height, numberOfPilesOfFood, tickDuration, cells, colonies, foodPiles, antEaters);
    
        System.out.println("Area ->" + area);
    
        Ant ant;
        ant = new Ant(cell, height);
        
        ant.run();
        
        short numberOfVehicles;
        short numberOfTires;
        numberOfVehicles = 2000;
        numberOfTires = 2000;
        short total = (short) (numberOfVehicles + numberOfTires);
    
        int value;
        value = numberOfVehicles;
        numberOfVehicles = (short) value;
        System.out.println("total -->" + total);
    
        Leaf leaf;
        leaf = new Leaf();
        
        
        
        System.out.println("leaf ->" + leaf);
        
    }
}
