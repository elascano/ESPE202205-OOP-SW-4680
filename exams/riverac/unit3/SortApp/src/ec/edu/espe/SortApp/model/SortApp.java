/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SortApp.model;

import java.lang.reflect.Array;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class SortApp {
    
    private String algorithm;
    private String unsorted;
    private String  sortList;
    private String   size;

    @Override
    public String toString() {
        return "SortApp{" + "algorithm=" + algorithm + ", unsorted=" + unsorted + ", sortList=" + sortList + ", size=" + size + '}';
    }

    public SortApp() {
    }

    public SortApp(String algorithm, String unsorted, String sortList, String size) {
        this.algorithm = algorithm;
        this.unsorted = unsorted;
        this.sortList = sortList;
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
     * @return the sortList
     */
    public String getSortList() {
        return sortList;
    }

    /**
     * @param sortList the sortList to set
     */
    public void setSortList(String sortList) {
        this.sortList = sortList;
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