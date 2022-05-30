package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Area {
    
    int width;
    int height;
    int initNumberOfFoodPiles;
    int tickDuration;
    ArrayList<Cell> cells;
    ArrayList<Colony> colonies;
    ArrayList<FoodPile> foodPiles;
    ArrayList<AntEater> antEaters;
    
    public void setup(){
    
    }
    
    public void add(Colony colony, int n){
        colonies.add(colony);
    }
    
    public void add(AntEater antEater){
        antEaters.add(antEater);
    }
    
    public boolean isAnyFoodRemaining(){
        //Todo code to determine if there is no food
        return false;
    }
    
    public Cell getCell(int row, int col){
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        
        Cell cell= new Cell(row, col, pheromoneDrops);
        return cell;
    }   
    
    public Area() {
        width= 0;
        height= 0;
        initNumberOfFoodPiles= 0;
        tickDuration= 0;
        cells = new ArrayList<>();
        colonies= new ArrayList<>();
        foodPiles= new ArrayList<>();
        antEaters= new ArrayList<>();
    }
 
    public Area(int width, int height, int initNumberOfFoodPiles, int tickDuration, ArrayList<Colony> colonies, ArrayList<FoodPile> foodpiles, ArrayList<AntEater> antEaters){
        this.width = width;
        this.height = width;
        this.initNumberOfFoodPiles = width;
        this.tickDuration = tickDuration;
        this.cells = cells;
        this.colonies
        
}
