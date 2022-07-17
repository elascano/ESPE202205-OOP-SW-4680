package ec.edu.espe.FruitApp.view;


import ec.edu.espe.fruitApp.model.Worker;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class FruitAppNew {
    
    public static void main(String[] args) {
        
        Worker worker;
        
        ArrayList<Worker> workers;
        
        workers = new ArrayList<>();
        worker= new Worker("Ronny","1753339173", 23, "0992970432", "ronnyibarra4.gmail.com" );
        workers.add(worker);
        
        
    }
}
