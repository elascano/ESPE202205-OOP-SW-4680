/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.equations.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class FunctionTest {
    
    public FunctionTest() {
    }

    /**
     * Test of getOYfLine method, of class Function.
     */
    @Test
    public void testGetOYfLine() {
        System.out.println("getOYfLine");
        int coordinateX = -5;
        Function instance = new Function();
        int expResult = -7;
        int result = instance.getOYfLine(coordinateX);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
