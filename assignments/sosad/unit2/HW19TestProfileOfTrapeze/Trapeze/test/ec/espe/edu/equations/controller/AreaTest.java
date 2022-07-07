package ec.espe.edu.equations.controller;

import junit.framework.TestCase;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class AreaTest extends TestCase {

    public AreaTest(String testName) {
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
     * Test of computeArea method, of class Area.
     */
    public void testComputeAreacase1() {
        System.out.println("computeArea");
        double longBase = 6.99;
        double shortBase = 2.54;
        double altitude = 9.8;
        Area instance = new Area();
        double expResult = 47.0;
        double result = instance.computeArea(longBase, shortBase, altitude);
        assertEquals(expResult, result, 0.0);
    }

    public void testComputeAreacase2() {
        System.out.println("computeArea");
        double longBase = 10.45;
        double shortBase = 4.36;
        double altitude = 45;
        Area instance = new Area();
        double expResult = 333;
        double result = instance.computeArea(longBase, shortBase, altitude);
        assertEquals(expResult, result, 0.0);
    }

    public void testComputeAreacase3() {
        System.out.println("computeArea");
        double longBase = 64.5;
        double shortBase = 47.6;
        double altitude = 1.25;
        Area instance = new Area();
        double expResult = 70;
        double result = instance.computeArea(longBase, shortBase, altitude);
        assertEquals(expResult, result, 0.0);
    }

    public void testComputeAreacase4() {
        System.out.println("computeArea");
        double longBase = 145.15;
        double shortBase = 98.6;
        double altitude = 65;
        Area instance = new Area();
        double expResult = 7922;
        double result = instance.computeArea(longBase, shortBase, altitude);
        assertEquals(expResult, result, 0.0);
    }

    public void testComputeAreacase5() {
        System.out.println("computeArea");
        double longBase = 78.9;
        double shortBase = 25.6;
        double altitude = 78.2;
        Area instance = new Area();
        double expResult = 4086;
        double result = instance.computeArea(longBase, shortBase, altitude);
        assertEquals(expResult, result, 0.0);
    }
}
