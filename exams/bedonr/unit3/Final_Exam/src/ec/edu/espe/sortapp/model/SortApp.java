
package ec.edu.espe.sortapp.model;

import java.lang.reflect.Array;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class SortApp {
    private int size;
    private Array algorithm;
    private Array numbers;
    private Array list;

    public SortApp(int size, Array algorithm, Array numbers, Array list) {
        this.size = size;
        this.algorithm = algorithm;
        this.numbers = numbers;
        this.list = list;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Array getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Array algorithm) {
        this.algorithm = algorithm;
    }

    public Array getNumbers() {
        return numbers;
    }

    public void setNumbers(Array numbers) {
        this.numbers = numbers;
    }

    public Array getList() {
        return list;
    }

    public void setList(Array list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "SortApp{" + "size=" + getSize() + ", algorithm=" + getAlgorithm() + ", numbers=" + getNumbers() + ", list=" + getList() + '}';
    }

    public SortApp() {
    }
    
    
}
