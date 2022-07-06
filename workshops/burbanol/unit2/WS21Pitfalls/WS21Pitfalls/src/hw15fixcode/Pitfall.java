package hw15fixcode;

import jdk.jshell.spi.ExecutionControl;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Pitfall {

    public static String intToEnglishValue(int i) {

        if (i == 1) {
            return "One";
        }
        if (i == 2) {
            return "two";
        }
        if (i == 3) {
            return "Three";
        }
        if (i == 4) {
            return "Four";
        }
        if (i == 5) {
            return "FIve";
        }
        if (i == 6) {
            return "Six";
        }
        if (1 > 6) {
            return "ERROR";
        }
        return null;
    }
}
