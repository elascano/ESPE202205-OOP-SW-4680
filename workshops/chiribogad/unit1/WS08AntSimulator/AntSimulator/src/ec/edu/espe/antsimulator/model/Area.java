package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Area {
    private int width;
    private int height;
    private int initNumberOfFoodPiles;
    private int tickDuration;
    private ArrayList<Cell> cells;
    private ArrayList<Colony> colonies;
    private ArrayList<FoodPile> foodPiles;
    private ArrayList<AntEater> antEaters;
    
    private Colony colonies2[];
    
    public void setup(){
        
    }
    
    public void add(Colony colony){
        colonies.add(colony);
        
        colonies2[0]=colony;
    }
    
    public void add(AntEater antEater){
        antEaters.add(antEater);
    }
    
    public boolean isAnyFoodRemaining(){
        
        return false;
    }
    
    public Cell getCell(int row, int col){
        ArrayList<PheromoneDrop> pheromones;
        pheromoneDrops = new Arraylist<>();
        
        Cell cell = new Cell(row, cell, pheromoneDrops);
        return cell;
    }

    @Override
    public String toString() {
        return "Area{" + "width=" + width + 
                ", height=" + height + 
                ", initNumberOfFoodPiles=" + initNumberOfFoodPiles + 
                ", tickDuration=" + tickDuration + 
                ", cells=" + cells + ", colonies=" + 
                colonies + ", foodPiles=" + 
                foodPiles + ", antEaters=" + antEaters + ", colonies2=" + colonies2 + '}';
    }
    
    
    
    public Area() {
        width = 0;
        height = 0;
        initNumberOfFoodPiles = 0;
        tickDuration = 0;
        cells = new ArrayList<>();
        colonies = new ArrayList<>();
        foodPiles = new ArrayList<>();
        antEaters = new ArrayList<>();
    }
    
    public Area(int width, int height, int initNumberOffoodPiles, int tickDuratioon, ArrayList<Cell> cells, ArrayList<Colony> colonies, ArrayList<FoodPile> foodPiles, ArrayList<AntEater> antEaters) {
        this.width = width;
        this.height = height;
        this.initNumberOfFoodPiles = initNumberOffoodPiles;
        this.tickDuration = tickDuratioon;
        this.cells = cells;
        this.colonies = colonies;
        this.foodPiles = foodPiles;
        this.antEaters = antEaters;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the initNumberOfFoodPiles
     */
    public int getInitNumberOfFoodPiles() {
        return initNumberOfFoodPiles;
    }

    /**
     * @param initNumberOfFoodPiles the initNumberOfFoodPiles to set
     */
    public void setInitNumberOfFoodPiles(int initNumberOfFoodPiles) {
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
    }

    /**
     * @return the tickDuration
     */
    public int getTickDuration() {
        return tickDuration;
    }

    /**
     * @param tickDuration the tickDuration to set
     */
    public void setTickDuration(int tickDuration) {
        this.tickDuration = tickDuration;
    }

    /**
     * @return the cells
     */
    public ArrayList<Cell> getCells() {
        return cells;
    }

    /**
     * @param cells the cells to set
     */
    public void setCells(ArrayList<Cell> cells) {
        this.cells = cells;
    }

    /**
     * @return the colonies
     */
    public ArrayList<Colony> getColonies() {
        return colonies;
    }

    /**
     * @param colonies the colonies to set
     */
    public void setColonies(ArrayList<Colony> colonies) {
        this.colonies = colonies;
    }

    /**
     * @return the foodPiles
     */
    public ArrayList<FoodPile> getFoodPiles() {
        return foodPiles;
    }

    /**
     * @param foodPiles the foodPiles to set
     */
    public void setFoodPiles(ArrayList<FoodPile> foodPiles) {
        this.foodPiles = foodPiles;
    }

    /**
     * @return the antEaters
     */
    public ArrayList<AntEater> getAntEaters() {
        return antEaters;
    }

    /**
     * @param antEaters the antEaters to set
     */
    public void setAntEaters(ArrayList<AntEater> antEaters) {
        this.antEaters = antEaters;
    }
    
}
