/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import plymouth.isad.*;


/**
 *
 * @author dhirst1
 */
public class SDTPhelperTest {
    
    public SDTPhelperTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
    public void testAdd(){
        int result;
        int actualResult;
        int num1 = 2;
        int num2 = 4;
        result =SDTPHelperMethods.add(num1, num2);
        actualResult = num1 + num2;
        assertEquals("Testing 2 + 4", actualResult, result);
        
        num1 = -3;
        num2 = -4;
        result = SDTPHelperMethods.add(num1, num2);
        actualResult = num1 + num2;
        assertEquals("Testing -3 + -4", actualResult, result);   
    }
    @Test
    public void testValidate(){
        String emailAddr = "daniel.hirst@students.plymouth.ac.uk";
        boolean result = SDTPHelperMethods.validate(emailAddr);
        assertTrue("Test 1: correct email address format",result);
        
        emailAddr = "daniel.hirst@plymouth.ac.uk";
        result = SDTPHelperMethods.validate(emailAddr);
        assertTrue("Test 2: correct email address format",result);
        
        emailAddr = "daniel.hirstplymouth.ac.uk";
        result = SDTPHelperMethods.validate(emailAddr);
        assertFalse("Test 3: incorrect email address format",result);
        
        emailAddr = "daniel.hirst@plymouth.com";
        result = SDTPHelperMethods.validate(emailAddr);
        assertFalse("Test 4: incorrect email address format",result);
        
        
        
    }
    @Test
    public void testRoll(){
        int result = SDTPHelperMethods.roll();
        if(result > 0 && result <7){
            assertTrue("If dice roll is between 1 and 6",true);
        }
        else{
            assertFalse("dice roll is not between 1-6", true);
        }
    }
    @Test
    public void testcounter(){
        Counter counter = new Counter();
        
        for(int i=0; i < 1000000000; i++){
            assertEquals("Test counter hit at " + i, i,counter.countHits() );
            counter.recordHit();
            
        }

        
        
    }
        
}
