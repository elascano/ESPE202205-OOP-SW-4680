package ec.edu.espe.antsimulatior.view;

import ec.edu.espe.antsimulatior.model.AntEater;
import ec.edu.espe.antsimulatior.model.Area;
import ec.edu.espe.antsimulatior.model.Cell;
import ec.edu.espe.antsimulatior.model.Colony;
import ec.edu.espe.antsimulatior.model.FoodPile;
import ec.edu.espe.antsimulatior.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class SimulatorDisplay {

    public static void main(String[] args) {
        System.out.println("This in Ant Simulator");
        
        Area area;

        int xCoordinate;
        int yCoordinate;
        int height;
        int width;
        
        ArrayList<Cell>cells;
        ArrayList<Colony>colonies;
        ArrayList<FoodPile>foodPiles;
        ArrayList<AntEater>antEaters;
        int totalCells;
        width=20;
        height=10; 
        int numberOfPiles=2;
        int tickDuration=20000;
        
        totalCells=width*height;
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3, 4, pheromoneDrops);
        
        cells = new ArrayList<>();
        
        for (int i=0;i<height;i++){
            for(int j=0;j<width;j++){
              cells.add(new Cell(i,j,null));  
            }
        }
        
        colonies =new ArrayList<>();
        foodPiles =new ArrayList<>();
        antEaters =new ArrayList<>();
        
        System.out.println("cell --> " + cell);
        
        area= new Area(width, height, numberOfPiles, tickDuration, cells, colonies, foodPiles, antEaters);
        System.out.println("Area--> "+area);
    }

}
