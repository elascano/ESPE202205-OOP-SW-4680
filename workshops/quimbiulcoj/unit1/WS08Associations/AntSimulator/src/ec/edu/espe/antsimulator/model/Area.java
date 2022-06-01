package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE CODEX++
 */
public class Area {

    private int width;
    private int heigth;
    private int inItNumberOfFoodPies;
    private int tickDuration;
    private ArrayList<Cell> cells;
    private ArrayList<Colony> colonies;
    private ArrayList<FoodPile> foodPiles;
    private ArrayList<AntEater> antEaters;

    public void setup() {

    }

    //POLYMORPHISMO - Polimorfismo
    //OVERLOADING - Sobre carga de funciones
    
    public void add(Colony colony) {
        colonies.add(colony);
    }

    public void add(AntEater antEater) {
        antEaters.add(antEater);
    }
    
    public boolean isAnyFoodRemaining(){
        //Todo code to determine if here is no food
        //if (conditional)
        //for/foreach/while/do-while (loop)
        return false;
    }
    
    public Cell getcell(int row, int col){
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        Cell cell = new Cell(row, col, pheromoneDrops);
        return cell;
    }

    @Override
    public String toString() {
        return "Area{" + "width=" + width + 
                ", heigth=" + heigth + ", inItNumberOfFoodPies=" + inItNumberOfFoodPies + 
                ", tickDuration=" + tickDuration + ", cells=" + cells + 
                ", colonies=" + colonies + ", foodPiles=" + foodPiles + 
                ", antEaters=" + antEaters + '}';
    }
  
   
    public Area() {
        width = 0;
        heigth = 0;
        inItNumberOfFoodPies = 0;
        tickDuration = 0;
        cells = new ArrayList<>();
        colonies = new ArrayList<>();
        foodPiles = new ArrayList<>();
        antEaters = new ArrayList<>();
    }

    public Area(int width, int heigth, int inItNumberOfFoodPies, int tickDuration, ArrayList<Cell> cells, ArrayList<Colony> colonies, ArrayList<FoodPile> foodPiles, ArrayList<AntEater> antEaters) {
        this.width = width;
        this.heigth = heigth;
        this.inItNumberOfFoodPies = inItNumberOfFoodPies;
        this.tickDuration = tickDuration;
        this.cells = cells;
        this.colonies = colonies;
        this.foodPiles = foodPiles;
        this.antEaters = antEaters;
    }

    /**
     * @return the width
     */
    private int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    private void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the heigth
     */
    private int getHeigth() {
        return heigth;
    }

    /**
     * @param heigth the heigth to set
     */
    private void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    /**
     * @return the inItNumberOfFoodPies
     */
    private int getInItNumberOfFoodPies() {
        return inItNumberOfFoodPies;
    }

    /**
     * @param inItNumberOfFoodPies the inItNumberOfFoodPies to set
     */
    private void setInItNumberOfFoodPies(int inItNumberOfFoodPies) {
        this.inItNumberOfFoodPies = inItNumberOfFoodPies;
    }

    /**
     * @return the tickDuration
     */
    private int getTickDuration() {
        return tickDuration;
    }

    /**
     * @param tickDuration the tickDuration to set
     */
    private void setTickDuration(int tickDuration) {
        this.tickDuration = tickDuration;
    }

    /**
     * @return the cells
     */
    private ArrayList<Cell> getCells() {
        return cells;
    }

    /**
     * @param cells the cells to set
     */
    private void setCells(ArrayList<Cell> cells) {
        this.cells = cells;
    }

    /**
     * @return the colonies
     */
    private ArrayList<Colony> getColonies() {
        return colonies;
    }

    /**
     * @param colonies the colonies to set
     */
    private void setColonies(ArrayList<Colony> colonies) {
        this.colonies = colonies;
    }

    /**
     * @return the foodPiles
     */
    private ArrayList<FoodPile> getFoodPiles() {
        return foodPiles;
    }

    /**
     * @param foodPiles the foodPiles to set
     */
    private void setFoodPiles(ArrayList<FoodPile> foodPiles) {
        this.foodPiles = foodPiles;
    }

    /**
     * @return the antEaters
     */
    private ArrayList<AntEater> getAntEaters() {
        return antEaters;
    }

    /**
     * @param antEaters the antEaters to set
     */
    private void setAntEaters(ArrayList<AntEater> antEaters) {
        this.antEaters = antEaters;
    }

}
