/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.espe.ec.area.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class FunctionTest {
    
    public FunctionTest() {
    }

    /**
     * Test of calculateParallelogram method, of class Function.
     */
    @Test
    public void testCalculateParallelogram() {
        System.out.println("Calculate Parallelogram");
        double base = 15.5;
        double height = 20.5;
        Function instance = new Function();
        double expResult = 317.75;
        double result = instance.calculateParallelogram(base, height);
        assertEquals(expResult, result, 0.0);

    }
    
}
