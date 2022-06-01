/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class SimulatorDisplay {

    public static void main(String[] args) {
        System.out.println("This is the ant simulator");

        Area area;

        int xCoordinate;
        int yCoordinate;
        int height;
        int width;
        int totalCells;
        Cell cell;
        ArrayList<Colony> colonies;
        ArrayList<Cell> cells;
        ArrayList<FoodPile> foodPiles;
        ArrayList<AntEater> antEaters;
        ArrayList<PheromoneDrop> pheromoneDrops;

        width = 200;
        height = 100;
        int numberOfPiles = 2;
        int tickDuration = 20000;

        pheromoneDrops = new ArrayList<>();
        colonies = new ArrayList<>();
        cell = new Cell(3, 4, pheromoneDrops);
        foodPiles = new ArrayList<>();
        antEaters = new ArrayList<>();

        cells = new ArrayList<>();

        totalCells = width * height;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                cells.add(new Cell(i, j, null));
            }
        }

        area = new Area(width, height, numberOfPiles, tickDuration, cells, colonies, antEaters, foodPiles);
        System.out.println("Area--> " + area);

    }
    
    
    
    
    
    
}
