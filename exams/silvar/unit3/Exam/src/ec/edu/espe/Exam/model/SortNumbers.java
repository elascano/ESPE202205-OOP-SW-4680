package ec.edu.espe.Exam.model;

import java.lang.reflect.Array;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class SortNumbers {
    private Array algorithm;



    public SortNumbers(Array algorithm, Array unsorted, int size, Array ordenated, String numbers) {
        this.algorithm = algorithm;
        this.unsorted = unsorted;
        this.size = size;
        this.ordenated = ordenated;
        this.numbers = numbers;
    }

    public SortNumbers() {
    }


    private Array unsorted;
    private int size;
    private Array ordenated;
    private String numbers;
    /**
     * @return the algorithm
     */
    public Array getAlgorithm() {
        return algorithm;
    }

    /**
     * @param algorithm the algorithm to set
     */
    public void setAlgorithm(Array algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * @return the unsorted
     */
    public Array getUnsorted() {
        return unsorted;
    }

    /**
     * @param unsorted the unsorted to set
     */
    public void setUnsorted(Array unsorted) {
        this.unsorted = unsorted;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the ordenated
     */
    public Array getOrdenated() {
        return ordenated;
    }

    /**
     * @param ordenated the ordenated to set
     */
    public void setOrdenated(Array ordenated) {
        this.ordenated = ordenated;
    }

    /**
     * @return the numbers
     */
    public String getNumbers() {
        return numbers;
    }

    /**
     * @param numbers the numbers to set
     */
    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }
}
