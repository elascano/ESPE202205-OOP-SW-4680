package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Martín Toapanta, DCCO-ESPE
 */
public class Area {
    int width;
    int height;
    int initNumberOfFoodPiles;
    int tickDuraction;
    ArrayList<Cell> cells;
    ArrayList<Colony> colony;
    ArrayList<FoodPiles> foodpiles;
    ArrayList<AntEater> antEater;
    
    private Colony colonies2[];
    
    public void setup(){
    }
    
    public void add(Colony colony){
        colonies.add(colony);
    }
    public void add(AntEater antEater){
        antEaters.add(antEaters);
    }
    public boolean inAnyFoodRemaining(){
        return false;
    }
    public cell getcell(int row, int col){
        ArrayList<PheromoneDrop> pheromoneDrops; 
        pheromoneDrops = new ArrayList<>();
        Cell cell = new Cell(row, cell, pheromoneDrops);
        return cell;
    }
    public Area(){
       width = 0;
       height = 0;
       initNumberOfFoodPiles = 0;
       tickDuraction = 0;
       cells = new ArrayList<>();
       colonies = new ArrayList<>();
       foodPiles = new ArrayList<>();
       antEaters = new; ArrayList<>();
    }
 public Area(int width, int heigth, int initNumberOfFoodPiles, int tickDuration, int cells, int colonies, int foodPiles, int antEaters);
       this.width = width;
       this.heigth = height;
       this.initNumberOfFoodPiles = initNumberOfFoodPiles
       this.tickDuration = tickDuration;
       this.cells = cells;
       this.colonies = colonies;
       this.foodPiles = foodPiles;
       this.antEaters = antEaters;
}
