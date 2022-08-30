package ec.edu.espe.SortApp.controller;

import ec.edu.espe.SortApp.model.NumbersBase;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class SortingContext {

    public void sort() {

    }

    public String setSortStrategy(int[] myListNumbers,NumbersBase listNumbers) {

        NumbersController listNumbersController;
        listNumbersController = new NumbersController();
        //section when the system know what method choose
        if (myListNumbers.length < 4 && myListNumbers.length>=0) {
            BubbleSort bubbleSort;
            bubbleSort = new BubbleSort();
            bubbleSort.sort(listNumbers);
            listNumbers.setNumbersDisordered(Arrays.copyOf(myListNumbers, myListNumbers.length));
            Document doc = listNumbersController.createDocument(listNumbers);
            listNumbersController.updateToDatabase(doc);
            

        }else if (myListNumbers.length >= 4 && myListNumbers.length<=7) {
            InsertionSort insertionSort;
            insertionSort = new InsertionSort();
            insertionSort.sort(listNumbers);
            listNumbers.setNumbersDisordered(myListNumbers);
            Document doc = listNumbersController.createDocument(listNumbers);
            listNumbersController.updateToDatabase(doc);
            

        }else if (myListNumbers.length >7) {
            int size;
            size= myListNumbers.length;
            QuickSort.sort(myListNumbers,0,size-1,listNumbers);
            listNumbers.setNumbersDisordered(Arrays.copyOf(myListNumbers, myListNumbers.length));
            Document doc = listNumbersController.createDocument(listNumbers);
            listNumbersController.updateToDatabase(doc);
            
        }
        return Arrays.toString(myListNumbers);
    }
}
