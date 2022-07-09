/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package ec.edu.espe.drawLine.controller;

import junit.framework.TestCase;

/**
 *
 * @author H301
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
        int coordinateX = 0;
        Function instance = new Function();
        int expResult = 0;
        int result = instance.getYOfSqareFunction(coordinateX);
        assertEquals(expResult, result);
        
    }
    
}
