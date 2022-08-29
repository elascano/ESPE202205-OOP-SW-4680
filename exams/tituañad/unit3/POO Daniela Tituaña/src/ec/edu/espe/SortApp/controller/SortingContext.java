package ec.edu.espe.SortApp.controller;

import ec.edu.espe.SortApp.model.Numbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;

    public void sort() {

    }

    public String setSortStrategy(int listOfNumbers[],Numbers listNumbers) {

        NumbersController listNumbersController;
        listNumbersController = new NumbersController();
 
        if (listOfNumbers.length < 4 && listOfNumbers.length>=0) {
            BubbleSort bubbleSort;
            bubbleSort = new BubbleSort();
            bubbleSort.sort(listNumbers);
            listNumbers.setNumbersDisordered(Arrays.copyOf(listOfNumbers, listOfNumbers.length));
            Document doc = listNumbersController.createDocument(listNumbers);
            listNumbersController.updateToDatabase(doc);
            

        }else if (listOfNumbers.length >= 4 && listOfNumbers.length<=7) {
            InsertionSort insertionSort;
            insertionSort = new InsertionSort();
            insertionSort.sort(listNumbers);
            listNumbers.setNumbersDisordered(listOfNumbers);
            Document doc = listNumbersController.createDocument(listNumbers);
            listNumbersController.updateToDatabase(doc);
            

        }else if (listOfNumbers.length >7) {
            int size;
            size= listOfNumbers.length;
            QuickShort.sort(listOfNumbers,0,size-1,listNumbers);
            listNumbers.setNumbersDisordered(Arrays.copyOf(listOfNumbers, listOfNumbers.length));
            Document doc = listNumbersController.createDocument(listNumbers);
            listNumbersController.updateToDatabase(doc);
            
        }
        return Arrays.toString(listOfNumbers);
    }
}
