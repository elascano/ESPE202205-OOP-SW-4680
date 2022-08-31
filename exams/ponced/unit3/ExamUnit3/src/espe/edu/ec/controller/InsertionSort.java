package espe.edu.ec.controller;

/**
 *
 * @author Diego Ponce
 */
public class InsertionSort implements SortingStrategy{

    @Override
    public int[] sort(int[] number) {
        System.out.println("Insertion is runnig");
        return InsertionMehtod(number);
    }
    
    public int[] InsertionMehtod(int[] number) {

        int aux;
        int cont1;
        int cont2;
        for (cont1 = 1; cont1 < number.length; cont1++) {
            aux = number[cont1];
            for (cont2 = cont1 - 1; cont2 >= 0 && number[cont2] > aux; cont2--) {
                number[cont2 + 1] = number[cont2];
                number[cont2] = aux;
            }
        }
        return number;
    }

    
    
    
    
}