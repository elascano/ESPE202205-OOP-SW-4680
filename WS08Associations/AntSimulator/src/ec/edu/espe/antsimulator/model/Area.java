/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Area {

    private int width;
    private int height;
    private int initNumberOfFoodPiles;
    private int tickDuration;
    private ArrayList<Cell> cells;
    private ArrayList<Colony> colonies;
    private ArrayList<AntEater> antEaters;
    private ArrayList<FoodPile> foodPiles;
    
    private Colony[] colonies2;
    
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
        pheromoneDrops= new ArrayList<>();
        Cell cell= new Cell(row,col,pheromoneDrops);
        return cell;
    }

    @Override
    public String toString() {
        return "Area{" + "width=" + width + ", height=" 
                + height + ", initNumberOfFoodPiles=" 
                + initNumberOfFoodPiles + ", tickDuration=" 
                + tickDuration + ", cells=" 
                + cells + ", colonies=" 
                + colonies + ", antEaters=" 
                + antEaters + ", foodPiles=" 
                + foodPiles + ", colonies2=" 
                + colonies2 + '}';
    }
    
    
    

//Los constructores vacios se usan para inicializar las variables
    public Area() {
        width=0;
        height = 0;
        initNumberOfFoodPiles = 0;
        tickDuration = 0;
        cells = new ArrayList<>();
        colonies = new ArrayList<>();
        antEaters = new ArrayList<>();
        foodPiles = new ArrayList<>();

    }

    public Area(int width, int height, int initNumberOfFoodPiles, int tickDuration, ArrayList<Cell> cells, ArrayList<Colony> colonies, ArrayList<AntEater> antEaters, ArrayList<FoodPile> foodPiles) {
        this.width = width;
        this.height = height;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tickDuration = tickDuration;
        this.cells = cells;
        this.colonies = colonies;
        this.antEaters = antEaters;
        this.foodPiles = foodPiles;
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
    
    
    
    
    
}
