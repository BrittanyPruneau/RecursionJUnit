package recursion;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * 
 * @author Brittany Pruneau 
 * 
 * Tests to see if the correct value will be returned when n the input to the method called harmonic 
 * returns the sum of the values in the harmonic series from 1/1 to 1/n.
 * However, as the value of n increases, the harmonic series diverges to infinity. 
 * We know the java compiler will overflow if values become larger than our expected range for a double 
 * and so we will account for those errors and make exceptions to our code. 
 * We also know that 1/0 is undefined, so we must catch this error as well. 
 * 
 */

class HarmonicTest 
{
	private static final double DELTA = .000000001;	
	
	@Test
	void testHarmonic_NisZero() 
	{
		assertThrows(IllegalArgumentException.class, () -> {
			   Recursion.harmonic(0);
			});
	}
	
	@Test
	void testHarmonic_NCausesReturnToBeGreaterThanTypeDoublePos() 
	{
		assertThrows(IllegalArgumentException.class, () -> {
			   Recursion.harmonic(2147483646);
			});
	}
	
	@Test
	void testHarmonic_NCausesReturnToBeGreaterThanTypeDoubleNeg() 
	{
		assertThrows(IllegalArgumentException.class, () -> {
			   Recursion.harmonic(-2147483646);
			});
	}
	
	@Test
	void testHarmonic_NisPosititve() 
	{
		double expected = 2.9289682539682538;
		double actual = Recursion.harmonic(10);
		assertEquals(expected, actual, DELTA);
	}
	
	@Test
	void testHarmonic_NisNegative() 
	{
		double expected = -2.9289682539682538;
		double actual = Recursion.harmonic(-10);
		assertEquals(expected, actual, DELTA);
	}
	
}
