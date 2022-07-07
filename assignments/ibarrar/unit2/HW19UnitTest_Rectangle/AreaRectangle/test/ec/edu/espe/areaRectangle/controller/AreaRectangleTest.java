
package ec.edu.espe.areaRectangle.controller;

import junit.framework.TestCase;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class AreaRectangleTest extends TestCase {
    
    public AreaRectangleTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
//       IMPUT                EXPECT     REAL
//  BASE=4; HEIGHT=5            20        20
    
    public void testCalculateAreaRectangle() {
        System.out.println("calculateAreaRectangle");
        double base = 4;    
        double height = 5;  
        AreaRectangle instance = new AreaRectangle();
        double expResult = 20;      
        double result = instance.calculateAreaRectangle(base, height);
        assertEquals(expResult, result, 0.0);
    }
    
}
