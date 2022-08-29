package ec.edu.espe.OrderAlgorithms.model;

import java.lang.reflect.Array;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class SortApp {

    int unarrangedNumbers[];
    int size;
    String sort;
    int orderlyNumbers[];

    @Override
    public String toString() {
        return "SortApp{" + "unarrangedNumbers=" + unarrangedNumbers + ", size=" + size + ", sort=" + sort + ", orderlyNumbers=" + orderlyNumbers + '}';
    }

    public int[] getUnarrangedNumbers() {
        return unarrangedNumbers;
    }

    public void setUnarrangedNumbers(int[] unarrangedNumbers) {
        this.unarrangedNumbers = unarrangedNumbers;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int[] getOrderlyNumbers() {
        return orderlyNumbers;
    }

    public void setOrderlyNumbers(int[] orderlyNumbers) {
        this.orderlyNumbers = orderlyNumbers;
    }

    
}
