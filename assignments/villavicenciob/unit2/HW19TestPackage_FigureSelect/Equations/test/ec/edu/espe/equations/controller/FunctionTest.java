/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.equations.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
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
    @Test
    public void testGetYOfSqareFunction() {
        System.out.println("getYOfSqareFunction");
        int coordinateX = -5;
        Function instance = new Function();
        int expResult = 25;
        int result = instance.getYOfSqareFunction(coordinateX);
        assertEquals(expResult, result);

    }
    
}
