/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulatior.model;

import java.util.ArrayList;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Area {

    private int width;
    private int height;
    private int initNumberOfFoodPiles;
    private int tickDuration;
    private ArrayList<Cell> cells;
    private ArrayList<Colony> colonies;
    private ArrayList<FoodPile> fooFiles;
    private ArrayList<AntEater> antEaters;
    
    //ArrayList <-- Collection
    //private Colony colonies2[]; Array
    
    public void setup(){
    }
    
    public void add(Colony colony){
        colonies.add(colony);
        //Array
        //looop to find the empty element
        //i = emptyElement;
        //colonies2[0]=colony; sin elementos
    }
    
    //POLYMORPHISM - Polimorfismo
    //OVERLOADING - Sobre carga de funciones(La misma funcion con el mismo nombre pero cambia el tipo o numero de parametros)
    
    public void add(AntEater antEater){ 
        antEaters.add(antEater);
    }
    
    public boolean isAnyFoodRemaining(){
        //Todo Code to determine If there is not food
        //if (condicional)
        //for/foreach/while/do-while(loop)
        return false;
    }
    
    public Cell getCell(int row, int col){
        ArrayList <PheromoneDrop> pheromonesDrops;
        pheromonesDrops=new ArrayList<>();
        Cell cell = new Cell(row,col,pheromonesDrops);
        return cell;
    }

    @Override
    public String toString() {
        return "Area{" + "width=" + width + ", height="
                + "" + height + ", initNumberOfFoodPiles="
                + initNumberOfFoodPiles + ", tickDuration=" 
                + tickDuration + ", cells=" + cells 
                + ", colonies=" + colonies + ", fooFiles=" 
                + fooFiles + ", antEaters=" + antEaters + '}';
    }
    
    
   
    public Area() {

        width=0;
        height = 0;
        initNumberOfFoodPiles = 0;
        tickDuration = 0;
        cells = new ArrayList<>();
        colonies = new ArrayList<>();
        fooFiles = new ArrayList<>();
        antEaters = new ArrayList<>();
    }
    
    //Constructor
    public Area(int width, int height, int initNumberOfFoodPiles, int tickDuration, ArrayList<Cell> cells, ArrayList<Colony> colonies, ArrayList<FoodPile> fooFiles, ArrayList<AntEater> antEaters) {
        this.width = width;
        this.height = height;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tickDuration = tickDuration;
        this.cells = cells;
        this.colonies = colonies;
        this.fooFiles = fooFiles;
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
     * @return the fooFiles
     */
    public ArrayList<FoodPile> getFooFiles() {
        return fooFiles;
    }

    /**
     * @param fooFiles the fooFiles to set
     */
    public void setFooFiles(ArrayList<FoodPile> fooFiles) {
        this.fooFiles = fooFiles;
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
