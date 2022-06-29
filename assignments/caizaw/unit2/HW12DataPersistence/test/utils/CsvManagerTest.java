/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package utils;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class CsvManagerTest {
    
    public CsvManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
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
        assertEquals(expResult, result);
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
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.read(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CsvManager.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String fileName = "";
        String criterion = "";
        CsvManager instance = new CsvManager();
        boolean expResult = false;
        boolean result = instance.delete(fileName, criterion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class CsvManager.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String fileName = "";
        String criterion = "";
        CsvManager instance = new CsvManager();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.find(fileName, criterion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class CsvManager.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String fileName = "";
        String criterion = "";
        String newData = "";
        CsvManager instance = new CsvManager();
        boolean expResult = false;
        boolean result = instance.update(fileName, criterion, newData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
