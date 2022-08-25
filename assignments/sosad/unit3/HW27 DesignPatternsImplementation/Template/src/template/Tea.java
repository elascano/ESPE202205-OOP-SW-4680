
package template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Tea extends CaffeineBeverage {

    public void brew() {
        System.out.println( "Steep the tea" ); }
        public void addCondiments() {
        System.out.println( "Adding lemon" ); }

    public boolean wantsCondiments() { // a hook operation
        String answer = getUserInput();
    if (answer.toLowerCase().startsWith("y")){   
        { return true;}
    }  else {return false;}
}

    private String getUserInput() {
        String answer = null;
        System.out.println( "Would you like lemon with your tea(y / n) ? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // try-catch block
        return answer;
    }
}
