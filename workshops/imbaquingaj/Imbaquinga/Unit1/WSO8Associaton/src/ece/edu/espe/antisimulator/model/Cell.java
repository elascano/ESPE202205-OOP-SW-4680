/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.edu.espe.antisimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class Cell {
        private int row;
         private int col;
    
    private ArrayList <PheromoneDrop> pheromoneDrops;
    
    public void receivePheromone(PheromoneDrop pheromoneDrop){
    
    }
    
    public ArrayList<Ant> getAnts(){
        
        ArrayList<Ant> ants = new ArrayList<>();
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
    public ArrayList <PheromoneDrop> getPheromoneDrops() {
        return pheromoneDrops;
    }

    /**
     * @param pheromoneDrops the pheromoneDrops to set
     */
    public void setPheromoneDrops(ArrayList <PheromoneDrop> pheromoneDrops) {
        this.pheromoneDrops = pheromoneDrops;
    }

    public Cell(int row, int col, ArrayList<PheromoneDrop> pheromoneDrops) {
        this.row = row;
        this.col = col;
        this.pheromoneDrops = pheromoneDrops;
    }

    @Override
    public String toString() {
        return "Cell{" + "row=" + row + ", col=" + col + ", pheromoneDrops=" + pheromoneDrops + '}';
    }
    
}
