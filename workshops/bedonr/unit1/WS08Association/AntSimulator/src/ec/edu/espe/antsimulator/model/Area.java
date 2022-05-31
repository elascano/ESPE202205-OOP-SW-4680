package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE,BettaCoders
 */
public class Area {

    private int width;
    private int height;
    private int unitNumberOfFoodPiles;
    private int tickDuration;
    private ArrayList<Cell> cells;
    private ArrayList<Colony> colonies;
    private ArrayList<FoodPile> foodFiles;
    private ArrayList<AntEater> antEaters;
    
    public void setup(){
        
    }
    public void add(Colony colony){
        colonies.add(colony);
    }
    public void add(AntEater antEater){
        antEaters.add(antEater);
    }
    
    public boolean isAnyFoodRemaining(){
        return false;
    }
    
    public Cell getCell(int row, int col){
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        
        Cell cell = new Cell(row, col, pheromoneDrops);
        return cell;
    }

    @Override
    public String toString() {
        return "Area{" + "width=" + width + 
                ", height=" + height + ", unitNumberOfFoodPiles=" + 
                unitNumberOfFoodPiles + ", tickDuration=" + 
                tickDuration + ", cells=" + cells + ", colonies=" + 
                colonies + ", foodFiles=" + foodFiles + 
                ", antEaters=" + antEaters + '}';
    }
    
    

    public Area() {
        width = 0;
        height = 0;
        unitNumberOfFoodPiles = 0;
        tickDuration = 0;
        cells = new ArrayList<>();
        colonies = new ArrayList<>(); 
        foodFiles = new ArrayList<>();
        antEaters = new ArrayList<>(); 

   
   
    }
    
    public Area(int width, int height, int unitNumberOfFoodPiles, int tickDuration, ArrayList<Cell> cells, ArrayList<Colony> colonies, ArrayList<FoodPile> foodFiles, ArrayList<AntEater> antEaters) {
        this.width = width;
        this.height = height;
        this.unitNumberOfFoodPiles = unitNumberOfFoodPiles;
        this.tickDuration = tickDuration;
        this.cells = cells;
        this.colonies = colonies;
        this.foodFiles = foodFiles;
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
     * @return the unitNumberOfFoodPiles
     */
    public int getUnitNumberOfFoodPiles() {
        return unitNumberOfFoodPiles;
    }

    /**
     * @param unitNumberOfFoodPiles the unitNumberOfFoodPiles to set
     */
    public void setUnitNumberOfFoodPiles(int unitNumberOfFoodPiles) {
        this.unitNumberOfFoodPiles = unitNumberOfFoodPiles;
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
     * @return the foodFiles
     */
    public ArrayList<FoodPile> getFoodFiles() {
        return foodFiles;
    }

    /**
     * @param foodFiles the foodFiles to set
     */
    public void setFoodFiles(ArrayList<FoodPile> foodFiles) {
        this.foodFiles = foodFiles;
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
            


    


   
