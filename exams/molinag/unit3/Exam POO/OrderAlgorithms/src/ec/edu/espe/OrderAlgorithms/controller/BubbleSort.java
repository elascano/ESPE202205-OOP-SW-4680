package ec.edu.espe.OrderAlgorithms.controller;

import ec.edu.espe.OrderAlgorithms.model.SortApp;
import java.util.Arrays;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class BubbleSort extends SortingStrategy {

    @Override
    public void sort(SortApp sortApp) {

        int listOfNumbersAux[];

        listOfNumbersAux = Arrays.copyOf(sortApp.getUnarrangedNumbers(), sortApp.getUnarrangedNumbers().length);

        for (int i = 0; i < sortApp.getUnarrangedNumbers().length - 1; ++i) {

            for (int j = 0; j < sortApp.getUnarrangedNumbers().length - i - 1; ++j) {

                if (listOfNumbersAux[j + 1] < listOfNumbersAux[j]) {

                    int swap = listOfNumbersAux[j];
                    listOfNumbersAux[j] = listOfNumbersAux[j + 1];
                    listOfNumbersAux[j + 1] = swap;

                }
            }
        }

        sortApp.setOrderlyNumbers(listOfNumbersAux);
        sortApp.setSort("BubbleSort");
        sortApp.setSize(sortApp.getUnarrangedNumbers().length);
    }
}
