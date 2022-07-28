
package ec.espe.edu.equations.controller;

import ec.espe.edu.equations.controller.Function;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
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
     * Test of getXOfLine method, of class Function.
     */
    @Test
    public void testGetXOfLine() {
        System.out.println("getXOfLine");
        int coordinateX = 1;
        Function instance = new Function();
        int expResult = 5;
        int result = instance.getXOfLine(coordinateX);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of getXOfSquareFunction method, of class Function.
     */
    @Test
    public void testGetXOfSquareFunction() {
        System.out.println("getXOfSquareFunction");
        int coordinateX = 2;
        Function instance = new Function();
        int expResult = 4;
        int result = instance.getXOfSquareFunction(coordinateX);
        assertEquals(expResult, result);
    
    }
    
}
