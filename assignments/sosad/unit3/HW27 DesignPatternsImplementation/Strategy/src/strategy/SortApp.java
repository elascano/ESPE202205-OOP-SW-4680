
package strategy;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class SortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[] = {3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
    }

}
