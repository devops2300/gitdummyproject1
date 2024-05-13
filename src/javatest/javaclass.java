package javatest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import sa2024package.sa2024class;

public class javaclass {

    @Test
    public void testAdd() {
        assertEquals(5.0, sa2024class.add(2.0, 3.0));
        assertEquals(-1.0, sa2024class.add(2.0, -3.0));
        
    }

    @Test
    public void testSubtract() {
        assertEquals(-1.0, sa2024class.subtract(2.0, 3.0));
        assertEquals(5.0, sa2024class.subtract(2.0, -3.0));
        
    }

    private void assertEquals(double d, double subtract) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testMultiply() {
        assertEquals(6.0, sa2024class.multiply(2.0, 3.0));
        assertEquals(-6.0, sa2024class.multiply(2.0, -3.0));
        
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, sa2024class.divide(6.0, 3.0));
        assertEquals(-2.0, sa2024class.divide(6.0, -3.0));
        
    }

   

	@SuppressWarnings("unused")
	private void assertThrows1(Class<IllegalArgumentException> class1, Object object) {
		// TODO Auto-generated method stub
		
	}
}