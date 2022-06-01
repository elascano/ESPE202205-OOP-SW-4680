/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.AntEater;
import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.Colony;
import ec.edu.espe.antsimulator.model.FoodPile;
import ec.edu.espe.antsimulator.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class SimulatorDisplay {

    public static void main(String[] args) {
        System.out.println("This is the AntSimulator");

        int xCoordinate;
        int yCoordinate;
        int height;
        int width;

        width = 200;
        height = 100;
        int numberOfPiles = 2;
        int tickDuration = 20000;
        ArrayList<Colony> colonies;
        ArrayList<Cell> cells;
        ArrayList<FoodPile> foodPiles;
        ArrayList<AntEater> antEaters;

        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3, 4, pheromoneDrops);

        cells = new ArrayList<>();

        colonies = new ArrayList<>();

        foodPiles = new ArrayList<>();

        antEaters = new ArrayList<>();

        System.out.println("cell --> " + cell);

    }
}
