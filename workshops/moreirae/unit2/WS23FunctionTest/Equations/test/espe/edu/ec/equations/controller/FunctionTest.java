
package espe.edu.ec.equations.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class FunctionTest {
    
    public FunctionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
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
     * Test of getYOfSquareFunction method, of class Function.
     */
    @Test
    public void testGetYOfSquareFunctionNegativeValues() {
        System.out.println("getYOfSquareFunction");
        int coordinateX = -5;
        Function instance = new Function();
        int expResult = 25;
        int result = instance.getYOfSquareFunction(coordinateX);
        assertEquals(expResult, result);
        
    }
    
}
