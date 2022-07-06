
package ec.edu.espe.areaRectangle.controller;

import junit.framework.TestCase;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
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
//  BASE=9.5; HEIGHT=10.5     99.75      99.75
    
    public void testCalculateAreaRectangle() {
        System.out.println("calculateAreaRectangle");
        double base = 9.5;    
        double height = 10.5;  
        AreaRectangle instance = new AreaRectangle();
        double expResult = 99.75;      
        double result = instance.calculateAreaRectangle(base, height);
        assertEquals(expResult, result, 0.0d);
    }
    
}
