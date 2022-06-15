/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AntSimulator1.model;

import java.util.ArrayList;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Cell {
    private int row;
    private int col;
    private ArrayList<PheromoneDrop> pheromoneDrops;

    @Override
    public String toString() {
        return "Cell{" + "row=" + row + ", col=" + col + ", pheromoneDrops=" + pheromoneDrops + '}';
    }
    
    

    public Cell(int row, int col, ArrayList<PheromoneDrop> pheromoneDrops) {
        this.row = row;
        this.col = col;
        this.pheromoneDrops = pheromoneDrops;
    }
    
    
    
    public void receivePheromone(PheromoneDrop pheromoneDrop){
        
    }
    public ArrayList<Ant> getAnts(){
        ArrayList<Ant> ants= new ArrayList<>();
        return ants;
        
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * @return the pheromoneDrops
     */
    public ArrayList<PheromoneDrop> getPheromoneDrops() {
        return pheromoneDrops;
    }

    /**
     * @param pheromoneDrops the pheromoneDrops to set
     */
    public void setPheromoneDrops(ArrayList<PheromoneDrop> pheromoneDrops) {
        this.pheromoneDrops = pheromoneDrops;
    }
    
}

