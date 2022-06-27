/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package utils;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class CsvManagerNGTest {
    
    public CsvManagerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class CsvManager.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        CsvManager instance = new CsvManager();
        instance.insert();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class CsvManager.
     */
    @Test
    public void testWrite() {
        System.out.println("write");
        String fileName = "";
        String data = "";
        CsvManager instance = new CsvManager();
        boolean expResult = false;
        boolean result = instance.write(fileName, data);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class CsvManager.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String fileName = "";
        CsvManager instance = new CsvManager();
        ArrayList expResult = null;
        ArrayList result = instance.read(fileName);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
