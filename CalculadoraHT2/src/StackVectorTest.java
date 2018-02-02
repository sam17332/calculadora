/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class StackVectorTest {
    
    public StackVectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of push method, of class Vector.
     */
    @Test
    public void testPush() {
        System.out.println("push");
       
    }

    /**
     * Test of pop method, of class Vector.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Stack<String> instance = new StackVector<String>();
        instance.push("5");
        instance.push("4");
        assertEquals("4", instance.pop());
        assertEquals("5", instance.pop());
    }

    /**
     * Test of peek method, of class Vector.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackVector instance = new StackVector();
        instance.push("5");
        instance.push("4");
        assertEquals("4", instance.peek());
      
    }

    /**
     * Test of empty method, of class Vector.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackVector instance = new StackVector();
        assertEquals(true, instance.empty());
       
    }

    /**
     * Test of size method, of class Vector.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackVector instance = new StackVector();
        assertEquals(0, instance.size());
       
    }
    
}
