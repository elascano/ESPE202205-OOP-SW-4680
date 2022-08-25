
package template;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class BeverageTest {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println( "\nMaking tea ..." );
        tea.prepareRecipe();

        System.out.println( "\nMaking coffee ..." );
        coffee.prepareRecipe();
    }

}
