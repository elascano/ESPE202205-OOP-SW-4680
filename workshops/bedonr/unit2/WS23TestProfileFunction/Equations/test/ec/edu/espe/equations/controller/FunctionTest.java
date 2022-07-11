
package ec.edu.espe.equations.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class FunctionTest {
    
    public FunctionTest() {
    }

    /**
     * Test of getYOfLine method, of class Function.
     */
    @Test
    public void testGetYOfLineNegativeValues() {
        System.out.println("getYOfLine");
        int coordinateX = -5;
        Function instance = new Function();
        int expResult = -7;
        int result = instance.getYOfLine(coordinateX);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getYOfSqareFuntion method, of class Function.
     */
    @Test
    public void testGetYOfSqareFuntionNegativeValues() {
        System.out.println("getYOfSqareFuntion");
        int coordinateX = -5;
        Function instance = new Function();
        int expResult = 25;
        int result = instance.getYOfSqareFuntion(coordinateX);
        assertEquals(expResult, result);
        
    }
    
}
