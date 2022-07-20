package ec.edu.espe.diamond.controller;

import junit.framework.TestCase;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class FormulaTest extends TestCase {
    
    public FormulaTest(String testName) {
        super(testName);
    }

    /**
     * Test of calculateAreaD method, of class Formula.
     */
    public void testCalculateAreaD() {
        System.out.println("calculateAreaD");
        double majorDiagonal = 6.6;
        double miniorDiagonal = 4.4;
        Formula instance = new Formula();
        double expResult = 14.52;
        double result = instance.calculateAreaD(majorDiagonal, miniorDiagonal);
        assertEquals(expResult, result, 0.0);

    }
    
}
