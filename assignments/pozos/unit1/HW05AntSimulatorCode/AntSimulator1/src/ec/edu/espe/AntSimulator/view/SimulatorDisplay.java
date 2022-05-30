/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AntSimulator.view;

import ec.edu.espe.AntSimulator1.model.Cell;
import ec.edu.espe.AntSimulator1.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("This is the AntSimulator");
        
        
        
        int xCoordinate;
        
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3,4,pheromoneDrops);
        System.out.println("cell --> " + cell);
        
    }
}