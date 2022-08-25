
package ec.edu.espe.exam.view;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Num {
    private String unsorted;
    private String size;
    private String sort;
    private String sorted; 

    public Num() {
    }

    public Num(String unsorted, String size, String sort, String sorted) {
        this.unsorted = unsorted;
        this.size = size;
        this.sort = sort;
        this.sorted = sorted;
    }

    public String getUnsorted() {
        return unsorted;
    }

    public void setUnsorted(String unsorted) {
        this.unsorted = unsorted;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSorted() {
        return sorted;
    }

    public void setSorted(String sorted) {
        this.sorted = sorted;
    }
  
}
