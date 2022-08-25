/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.finalexam.controller;

import ec.edu.espe.finalexam.model.ListNumbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;

    public void sort() {

    }

    public String setSortStrategy(int listOfNumbers[],ListNumbers listNumbers) {

        ListNumbersController listNumbersController;
        listNumbersController = new ListNumbersController();
 
        if (listOfNumbers.length < 4 && listOfNumbers.length>=0) {
            BubbleSort bubbleSort;
            bubbleSort = new BubbleSort();
            bubbleSort.sort(listNumbers);
            listNumbers.setListOfNumbersDisordered(Arrays.copyOf(listOfNumbers, listOfNumbers.length));
            Document doc = listNumbersController.createDocument(listNumbers);
            listNumbersController.updateToDatabase(doc);
            

        }else if (listOfNumbers.length >= 4 && listOfNumbers.length<=7) {
            InsertionSort insertionSort;
            insertionSort = new InsertionSort();
            insertionSort.sort(listNumbers);
            listNumbers.setListOfNumbersDisordered(listOfNumbers);
            Document doc = listNumbersController.createDocument(listNumbers);
            listNumbersController.updateToDatabase(doc);
            

        }else if (listOfNumbers.length >7) {
            int size;
            size= listOfNumbers.length;
            QuickShort.sort(listOfNumbers,0,size-1,listNumbers);
            listNumbers.setListOfNumbersDisordered(Arrays.copyOf(listOfNumbers, listOfNumbers.length));
            Document doc = listNumbersController.createDocument(listNumbers);
            listNumbersController.updateToDatabase(doc);
            
        }
        return Arrays.toString(listOfNumbers);
    }
}
