/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package ec.edu.espe.square.view;

import junit.framework.TestCase;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.msi
 */
public class SquareTest extends TestCase {
    
    public SquareTest(String testName) {
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
     * Test of main method, of class Square.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Square.main(args);
        
    }
    
}
