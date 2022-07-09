
package ec.edu.espe.areaRectangle.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class AreaRectangleTest {
    
    public AreaRectangleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculateAreaRectangle method, of class AreaRectangle.
     */
    @Test
    public void testCalculateAreaRectangle() {
        System.out.println("calculateAreaRectangle");
        double base = 8;
        double height = 5;
        AreaRectangle instance = new AreaRectangle();
        double expResult = 40;
        double result = instance.calculateAreaRectangle(base, height);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
