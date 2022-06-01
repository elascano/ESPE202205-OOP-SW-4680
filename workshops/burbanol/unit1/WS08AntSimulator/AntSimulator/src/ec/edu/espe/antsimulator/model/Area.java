/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Area {

    private int width;
    private int height;
    private int limitNumberOfFoodPiles;
    private int tickDuration;
    private ArrayList<Cell> cells;
    private ArrayList<Colony> colonies;
    private ArrayList<FoodPile> foodPiles;
    private ArrayList<AntEater> antEaters;
    private ArrayList<PheromoneDrop> pheromoneDrops;

    @Override
    public String toString() {
        return "Area{" + "width=" + width + ", height=" + height + ", limitNumberOfFoodPiles=" + limitNumberOfFoodPiles + ", tickDuration=" + tickDuration + '}';
    }

    public Area() {
        width = 0;
        height = 0;
        limitNumberOfFoodPiles = 0;
        tickDuration = 0;
        cells = new ArrayList<>();
        colonies = new ArrayList<>();
        foodPiles = new ArrayList<>();
        antEaters = new ArrayList<>();
    }

    public Area(int width, int height, int limitNumberOfFoodPiles, int tickDuration) {
        this.width = width;
        this.height = height;
        this.limitNumberOfFoodPiles = limitNumberOfFoodPiles;
        this.tickDuration = tickDuration;
    }

    public void setup() {

    }

    public void addColony(Colony colony) {
        colonies.add(colony);
    }

    public void addAntEater(AntEater antEater) {
        antEaters.add(antEater);
    }

    public boolean isAnyFoodRemaining() {
        return false;
    }

    public Cell getCell(int row, int col) {
        //ArrayList<PheromoneDrop> pheromoneDrops;

        pheromoneDrops = new ArrayList<>();
        Cell cell = new Cell(row, col, pheromoneDrops);

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
     * @return the limitNumberOfFoodPiles
     */
    public int getLimitNumberOfFoodPiles() {
        return limitNumberOfFoodPiles;
    }

    /**
     * @param limitNumberOfFoodPiles the limitNumberOfFoodPiles to set
     */
    public void setLimitNumberOfFoodPiles(int limitNumberOfFoodPiles) {
        this.limitNumberOfFoodPiles = limitNumberOfFoodPiles;
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
