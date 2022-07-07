/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.aquation.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class FuntionTest {
    
    public FuntionTest() {
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
     * Test of getYOfLine method, of class Funtion.
     */
    @Test
    public void testGetYOfLine() {
        System.out.println("getYOfLine");
        int coordenateX = -5;
        Funtion instance = new Funtion();
        int expResult = -7;
        int result = instance.getYOfLine(coordenateX);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getYOSquareFuntion method, of class Funtion.
     */
    @Test
    public void testGetYOSquareFuntion() {
        System.out.println("getYOSquareFuntion");
        int coordenateX = 6;
        Funtion instance = new Funtion();
        int expResult = 30;
        int result = instance.getYOSquareFuntion(coordenateX);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
