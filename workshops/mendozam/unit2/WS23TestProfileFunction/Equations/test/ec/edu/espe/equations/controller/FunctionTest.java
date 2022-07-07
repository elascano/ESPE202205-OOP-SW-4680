package ec.edu.espe.equations.controller;

import junit.framework.TestCase;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class FunctionTest extends TestCase {
    
    public FunctionTest(String testName) {
        super(testName);
    }

    /**
     * Test of getYOfLine method, of class Function.
     */
    public void testGetYOfLine() {
        System.out.println("getYOfLine");
        int coordinateX = -5;
        Function instance = new Function();
        int expResult = -7;
        int result = instance.getYOfLine(coordinateX);
        assertEquals(expResult, result);

    }

    /**
     * Test of getYOfSquareFunction method, of class Function.
     */
    public void testGetYOfSquareFunction() {
        System.out.println("getYOfSquareFunction");
        int coordinateX = -5;
        Function instance = new Function();
        int expResult = 25;
        int result = instance.getYOfSquareFunction(coordinateX);
        assertEquals(expResult, result);

    }
    
}
