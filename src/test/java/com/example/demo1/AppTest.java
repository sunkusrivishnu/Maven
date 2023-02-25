package com.example.demo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest 
{
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() 
    {
        App obj = new App();
        assertEquals(120, obj.factorial(5));
        assertEquals(24, obj.factorial(4));
        
    }
}
