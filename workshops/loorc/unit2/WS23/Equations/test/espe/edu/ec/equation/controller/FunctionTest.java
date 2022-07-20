
package espe.edu.ec.equation.controller;

import junit.framework.TestCase;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class FunctionTest extends TestCase {
    
    public FunctionTest(String testName) {
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
     * Test of getYOfSqareFunction method, of class Function.
     */
    public void testGetYOfSqareFunction() {
        System.out.println("getYOfSqareFunction");
        int coordinateX = 5 ;
        Function instance = new Function();
        int expResult = 25;
        int result = instance.getYOfSqareFunction(coordinateX);
        assertEquals(expResult, result);
       
    }
    
        
    }

