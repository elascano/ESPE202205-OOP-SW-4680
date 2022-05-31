/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.PheromoneDrop;
import java.awt.geom.Area;
import java.util.ArrayList;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("This is the AntSimulator");
         
        Area area;
        
        int XCoordinate;
        int yCoordinate;
        int Height;
        int width;
        
        width = 200;
        height = 100;
        int numberOfPiles = 2;
        int tickDuration = 20000;
        
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3,4,pheromoneDrops);
        
        cell = new ArrayList<>();
        
        colonies = new ArrayList<>();
        
        foodPiles = new ArrayList<>();
        
        antEaters = new ArrayList<>();
        
        System.out.println("cell --> " + cell);
        
        area= new Area()
                
         System.out.println("Area --> " + area);        
        
    }
}
