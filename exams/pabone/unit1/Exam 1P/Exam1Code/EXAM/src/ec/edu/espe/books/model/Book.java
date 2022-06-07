<<<<<<< HEAD:workshops/ponced/unit1/New Folder/AntSimulator/src/ec/edu/espe/antsimulator/model/Area.java
package ec.edu.espe.antsimulator.model;
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.books.model;
>>>>>>> f641647f62948d018e33f17ba7e5a97b56251625:exams/pabone/unit1/Exam 1P/Exam1Code/EXAM/src/ec/edu/espe/books/model/Book.java

import java.util.ArrayList;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES Developers
 */
<<<<<<< HEAD:workshops/ponced/unit1/New Folder/AntSimulator/src/ec/edu/espe/antsimulator/model/Area.java
public class Area {

    int width;
    int height;
    int initNumberOfFoodPiles;
    int tickDuration;
    ArrayList<Cell> cells;
    ArrayList<Colony> colonies;
    ArrayList<FoodPile> foodPiles;
    ArrayList<AntEater> antEaters;

    private Colony colonies[];

    public void setup() {
    }

    public void add(Colony colony) {
        colonies.add(colony);
    }

    public void add(AntEater antEater) {
        antEaters.add(antEater);
    }

    public boolean isAnyFoodRemaining() {
        return false;
    }

    public Cell getCell(int row, int col) {
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        Cell cell = new Cell(row, col, pheromoneDrops);
        return cell;
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

    public Area(int width, int height, int initNumberOfFoodPiles, int tickDuration, ArrayList<Cell> cells, ArrayList<Colony> colonies, ArrayList<FoodPile> foodPiles, ArrayList<AntEater> antEaters, Colony[] colonies) {
        this.width = width;
        this.height = height;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tickDuration = tickDuration;
        this.cells = cells;
        this.colonies = colonies;
        this.foodPiles = foodPiles;
        this.antEaters = antEaters;
        this.colonies = colonies;
    }

=======
class book {
    
>>>>>>> f641647f62948d018e33f17ba7e5a97b56251625:exams/pabone/unit1/Exam 1P/Exam1Code/EXAM/src/ec/edu/espe/books/model/Book.java
}
