
package edu.espe.ec.testareacube.controller;

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
     * Test of getAreaOfCube method, of class Function.
     */
    @Test
    public void testGetAreaOfCube() {
        System.out.println("getAreaOfCube");
        double aSide = 3.0;
        Function instance = new Function();
        double expResult = 54.0;
        double result = instance.getAreaOfCube(aSide);
        assertEquals(expResult, result, 0.0);

    }
    
}
