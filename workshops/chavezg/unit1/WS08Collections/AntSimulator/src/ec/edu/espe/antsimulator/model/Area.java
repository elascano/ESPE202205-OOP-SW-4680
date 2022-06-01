/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class Area {
    private int width;
    private int heigth;
    private int initNumberOfFoodPiles;
    private int tickDuration;
    private ArrayList<Cell> cells;
    private ArrayList<Colony> colonies;
    private ArrayList<FoodPile> foodPiles;
    private ArrayList<AntEater> antEaters;

    @Override
    public String toString() {
        return "Area{" + "width=" + width + 
                ", heigth=" + heigth + 
                ", initNumberOfFoodPiles=" + initNumberOfFoodPiles + 
                ", tickDuration=" + tickDuration + 
                ", cells=" + cells + ", colonies=" + colonies + 
                ", foodPiles=" + foodPiles + 
                ", antEaters=" + antEaters + '}';
    }
    

    public Area(){
    width=0;
     heigth=0;
     initNumberOfFoodPiles=0;
     tickDuration=0;
    cells = new ArrayList<>() ;
    colonies = new ArrayList<>();
    foodPiles = new ArrayList<>() ;
    antEaters = new ArrayList<>(); 
    }

    public Area(int width, int heigth, int initNumberOfFoodPiles, int tickDuration, ArrayList<Cell> cells, ArrayList<Colony> colonies, ArrayList<FoodPile> foodPiles, ArrayList<AntEater> antEaters) {
        this.width = width;
        this.heigth = heigth;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tickDuration = tickDuration;
        this.cells = cells;
        this.colonies = colonies;
        this.foodPiles = foodPiles;
        this.antEaters = antEaters;
    }
    
    
    public void setup(){
        
    }
    
    public void add(Colony colony){
      colonies.add(colony);
    } 
    //Polimorphism
     public void add(AntEater anteater){
        antEaters.add(anteater);
    } 
     
     public boolean isAnyFoodRemaining(){
         //TODO code to determine if there is no food
         // if(conditional)
         //for(loop)
         //for/foreach/while/do-while(loop)
         return false;
     }
     
     public Cell getCell(int row, int col){
         ArrayList<PheromoneDrop> pheromoneDrops;
         pheromoneDrops = new ArrayList<>();
         
         Cell cell = new Cell(row,col,pheromoneDrops);
         
      return cell;   
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
     * @return the heigth
     */
    public int getHeigth() {
        return heigth;
    }

    /**
     * @param heigth the heigth to set
     */
    public void setHeigth(int heigth) {
        this.heigth = heigth;
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
