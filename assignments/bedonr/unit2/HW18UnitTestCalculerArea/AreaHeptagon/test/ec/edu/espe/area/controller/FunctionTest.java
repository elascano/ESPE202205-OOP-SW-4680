/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.area.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class FunctionTest {
    
    public FunctionTest() {
    }

    /**
     * Test of getOfCalculator method, of class Function.
     */
    @Test
    public void testGetOfCalculator() {
        System.out.println("getOfCalculator");
        double apothem = 2;
        int side = 2;
        Function instance = new Function();
        double expResult = 14;
        double result = instance.getOfCalculator(apothem, side);
        assertEquals(expResult, result, 2);
        
    }
    
}
