
package university;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class University {


    public static void main(String[] args) {
        int oddStudents[];

        oddStudents = new int[13];

        for (int i = 0; i < 13; i++) {
            oddStudents[i] = i + 1;
        }

        for (int i = 0; i < 13; i++) {
            System.out.println(oddStudents[i]);
        }
    }
    
}
