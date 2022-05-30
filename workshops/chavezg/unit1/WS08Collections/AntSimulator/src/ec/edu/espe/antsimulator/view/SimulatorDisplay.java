/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.*;
import java.util.ArrayList;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("Ant Simulator by Genaro Chavez");
        
        Area area;
        
        
        int xCoordinate;
        int yCoordinate;
        int height;
        int width;
        int totalCells;

         ArrayList<Cell> cells;
           ArrayList<Colony> colonies;
             ArrayList<FoodPile> foodPiles;
                     ArrayList<AntEater> antEaters;
                             width = 200;
        height = 100;
        int numberOfPiles = 2;
        int tickDuration = 20000;
        
        
        totalCells = width * height;
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList();
        cell = new Cell(3,4,pheromoneDrops);
        
       
        cells = new ArrayList<>();
        
        for(int i=0; i < height; i++){
            for( int j = 0; j < width; j++){
                cells.add(new Cell(i,j,null));
            }
        }
        
       
        colonies = new ArrayList<>();
        
     
        foodPiles = new ArrayList<>();
        

        antEaters = new ArrayList<>();
        
        
        
        
        System.out.println("cell----> "+cell);
        System.out.println(cell.toString());
        
        area = new Area(width, height, numberOfPiles, tickDuration, cells, colonies, foodPiles, antEaters);
        System.out.println("Area---->"+area);
    }
    
}
