package ec.edu.espe.OrderAlgorithms.controller;

import ec.edu.espe.OrderAlgorithms.controller.InsertionSort;
import ec.edu.espe.OrderAlgorithms.controller.QuickSort;
import ec.edu.espe.OrderAlgorithms.controller.BubbleSort;
import ec.edu.espe.OrderAlgorithms.model.SortApp;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;

    public void sort() {

    }

    public SortingStrategy setSortStrategy(int sortApp[]) {

        if (sortApp.length < 4 && sortApp.length >= 0) {

            sortingStrategy = new BubbleSort();

        } else if (sortApp.length >= 4 && sortApp.length <= 7) {

            sortingStrategy = new InsertionSort();

        } else if (sortApp.length > 7) {

            sortingStrategy = new QuickSort();

        }
        return sortingStrategy;
    }
}    
    
    
    