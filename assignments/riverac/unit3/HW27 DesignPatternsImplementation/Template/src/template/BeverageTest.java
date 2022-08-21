
package template;

import ec.edu.espe.Template.model.Coffee;
import ec.edu.espe.Template.model.Tea;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class BeverageTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println( "\nMaking tea ..." );
        tea.prepareRecipe();

        System.out.println( "\nMaking coffee ..." );
        coffee.prepareRecipe();
    }
    
}
