
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class Cell {
    private int row;
    private int col;
    //PheromoneDrop [] pheromoneDrop;
    private ArrayList<PheromoneDrop> pheromoneDrop;

    Cell() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Cell{" + "row=" + row + ", col=" + col + ", pheromoneDrop=" + pheromoneDrop + "}\n";
    }
    
    
    
    public void receivePheromone(PheromoneDrop pheromoneDrop){
        
    }
    public ArrayList<Ant> getAnts(){
        ArrayList<Ant> ants = new ArrayList<>();
        return ants;
        
    }

    public Cell(int row, int col, ArrayList<PheromoneDrop> pheromoneDrop) {
        this.row = row;
        this.col = col;
        this.pheromoneDrop = pheromoneDrop;
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
     * @return the pheromoneDrop
     */
    public ArrayList<PheromoneDrop> getPheromoneDrop() {
        return pheromoneDrop;
    }

    /**
     * @param pheromoneDrop the pheromoneDrop to set
     */
    public void setPheromoneDrop(ArrayList<PheromoneDrop> pheromoneDrop) {
        this.pheromoneDrop = pheromoneDrop;
    }
    
            
    
}
