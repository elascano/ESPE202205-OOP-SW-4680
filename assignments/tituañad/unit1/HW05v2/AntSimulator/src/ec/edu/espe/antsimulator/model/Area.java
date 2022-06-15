package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
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

    
    
    public void setup(){
        
    }
    
    public void add(Colony colony){
        colonies.add(colony);
    //cuanto tenemos dos public con el mismo nombre lo llamamos POLIMORFISMO    
    }
    
    //POLYMPORPHISM-POLIMORFISMO
    //OVERLOADING-SOBRECARGA DE FUNCIONES
    public void add(AntEater antEater){
        antEaters.add(antEater);
     //POLOMORFISMO   
    }
    
    public boolean isAnyFoodRemaining(){
        //TODO code to determine if there is no food
        //if (conditional)
        //for(se donde empieza y se donde termina)/foreach/while(cuando no se donde va a terminar) estos son loob
        
        return false;  
    }
    
    public Cell getCell(int row, int col){
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        
        Cell cell = new Cell (row, col, pheromoneDrops);
        return cell;
    }

    @Override
    public String toString() {
        return + '}' + 
                "Area{" + "width=" + width +
                ", height=" + height +
                ", initNumberOfFoodPiles=" + initNumberOfFoodPiles +
                ", tickDuration=" + tickDuration + ", cells=" + cells +
                ", colonies=" + colonies +
                ", foodPiles=" + foodPiles + ", antEaters=" + antEaters;
    }
    
    
    public Area() {
        width=0;
        height = 0;
        initNumberOfFoodPiles = 0;
        tickDuration = 0;
        cells = new ArrayList<>();
        colonies = new ArrayList<>();
        //new es una palabra recervada 
        foodPiles = new ArrayList<>();
        antEaters = new ArrayList<>();

    }
//los contructores con parametros siempre reciben el numero de atributos
    public Area(int width, int height, int initNumberOfFoodPiles, int tickDuration, ArrayList<Cell> cells, ArrayList<Colony> colonies, ArrayList<FoodPile> foodPiles, ArrayList<AntEater> antEaters) {
        this.width = width;
        //this hace referencia a los atributos 
        this.height = height;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tickDuration = tickDuration;
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
