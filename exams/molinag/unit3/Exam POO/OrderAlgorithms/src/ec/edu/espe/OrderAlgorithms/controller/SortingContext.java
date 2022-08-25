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

    public String setSortStrategy(int unarrangedNumbers[],SortApp sortApp) {

        SortAppController sortAppController;
        sortAppController = new SortAppController();
 
        if (unarrangedNumbers.length < 4 && unarrangedNumbers.length>=0) {
            BubbleSort bubbleSort;
            bubbleSort = new BubbleSort();
            bubbleSort.sort(sortApp);
            sortApp.setUnarrangedNumbers(Arrays.copyOf(unarrangedNumbers, unarrangedNumbers.length));
            Document doc = sortAppController.createDocument(sortApp);
            sortAppController.updateToDatabase(doc);
            

        }else if (unarrangedNumbers.length >= 4 && unarrangedNumbers.length<=7) {
            InsertionSort insertionSort;
            insertionSort = new InsertionSort();
            insertionSort.sort(sortApp);
            sortApp.setUnarrangedNumbers(unarrangedNumbers);
            Document doc = sortAppController.createDocument(sortApp);
            sortAppController.updateToDatabase(doc);
            

        }else if (unarrangedNumbers.length >7) {
            int size;
            size= unarrangedNumbers.length;
            QuickSort.sort(unarrangedNumbers,0,size-1,sortApp);
            sortApp.setUnarrangedNumbers(Arrays.copyOf(unarrangedNumbers, unarrangedNumbers.length));
            Document doc = sortAppController.createDocument(sortApp);
            sortAppController.updateToDatabase(doc);
            
        }
        return Arrays.toString(unarrangedNumbers);
    }
}    
    
    
    