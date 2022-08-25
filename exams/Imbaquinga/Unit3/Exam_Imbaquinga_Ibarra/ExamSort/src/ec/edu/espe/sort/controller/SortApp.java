package ec.edu.espe.sort.controller;

import ec.edu.espe.sort.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class SortApp {
    public static void main(String[] args) {
        int data[] = {12,5,4,7,8,9,7,4,1,4,54,5,12,11,25,35,2,2};
        System.out.println("Data  " + Arrays.toString(data));
       
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        
        System.out.println("Sort Data " + Arrays.toString(sortedList));
    }
}
