/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package ec.edu.espe.equations.controller;

import junit.framework.TestCase;

/**
 *
 * @author Quimbiulco Juan
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
    public void testGetYOfSquareFunctionNegativeValues() {
        System.out.println("getYOfSquareFunction");
        int coordinateX = -5;
        Function instance = new Function();
        int expResult = 25;
        int result = instance.getYOfSquareFunction(coordinateX);
        assertEquals(expResult, result);

    }
    
}
