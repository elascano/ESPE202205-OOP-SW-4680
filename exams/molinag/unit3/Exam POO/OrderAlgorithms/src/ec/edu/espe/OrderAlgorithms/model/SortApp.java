package ec.edu.espe.OrderAlgorithms.model;

import java.lang.reflect.Array;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class SortApp {

    private String algorithm;
    private String unsorted;
    private String sort;
    private String size;

    public SortApp() {
    }

    @Override
    public String toString() {
        return "SortApp{" + "algorithm=" + algorithm + ", unsorted=" + unsorted + ", sort=" + sort + ", size=" + size + '}';
    }

    public SortApp(String algorithm, String unsorted, String sort, String size) {
        this.algorithm = algorithm;
        this.unsorted = unsorted;
        this.sort = sort;
        this.size = size;
    }

    /**
     * @return the algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * @param algorithm the algorithm to set
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * @return the unsorted
     */
    public String getUnsorted() {
        return unsorted;
    }

    /**
     * @param unsorted the unsorted to set
     */
    public void setUnsorted(String unsorted) {
        this.unsorted = unsorted;
    }

    /**
     * @return the sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * @param sort the sort to set
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

}
