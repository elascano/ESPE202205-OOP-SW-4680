/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.areaParallelogram.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class ParallelogramTest {
    
    public ParallelogramTest() {
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
     * Test of toString method, of class Parallelogram.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Parallelogram instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBase method, of class Parallelogram.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Parallelogram instance = null;
        double expResult = 0.0;
        double result = instance.getBase();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setBase method, of class Parallelogram.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        double base = 0.0;
        Parallelogram instance = null;
        instance.setBase(base);

    }

    /**
     * Test of getHeight method, of class Parallelogram.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Parallelogram instance = null;
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setHeight method, of class Parallelogram.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 0.0;
        Parallelogram instance = null;
        instance.setHeight(height);

    }

    /**
     * Test of calculateAreaOfParallelogram method, of class Parallelogram.
     */
    @Test
    public void testCalculateAreaOfParallelogram() {
        System.out.println("calculateAreaOfParallelogram");
        Parallelogram instance = null;
        double expResult = 0.0;
        double result = instance.calculateAreaOfParallelogram();
        assertEquals(expResult, result, 0.0);

    }
    
}
