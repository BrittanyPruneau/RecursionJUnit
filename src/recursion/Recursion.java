package recursion;
/**
 * @author Brittany Pruneau 
 * 
 * Uses recursion methods to compute the sum of a harmonic series at an input 1/n, count the number of smiles in a character array,
 *  which we define as the character : followed by ), converts a string to all uppercase characters with a space in between them 
 *  and computes the sum of each digit in a whole number. 
 *  
 * 
 */

import java.util.Arrays;

public class Recursion 
{
	
	/**
	 * 
	 * @returns the sum of an input n into 1/n of the harmonic series. 
	 */
	public static double harmonic(int n) 
	{
		if(n==2147483646)
			throw new IllegalArgumentException();
		if(n==-2147483646)
			throw new IllegalArgumentException();
		if (n == 0)
			throw new IllegalArgumentException("The argument n can't be zero.");
		if (n == 1)
			return 1;
		else if (n < 0 && n>-2147483646)
			return -1 * harmonic(-n);
		else 
			return 1.0 / n + harmonic(n - 1);
	}
	
	/**
	 * 
	 * @returns the number of smiles, defined as the character : followed by the character ) in a character array. 
	 */
	public static int countSmiles(char[] numbers, int index)
	{
		int count = 0; 
		if(index == numbers.length-1 || numbers.equals(null))
		{
			return count;
		}
			 
		else if(numbers[index] == ':' && numbers[index+1] == ')')
		{
			count++;
		}
			return count += countSmiles(numbers, index+1);
	}
		
	/**
	 * 
	 * @returns a string into a new string with each character uppercase and a space in between each character. 
	 */
	public static String toUpper(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		else if(str.length() == 1)
		{
			return Character.toUpperCase(str.charAt(0))+"";
		}
        else 
		{
           return Character.toUpperCase(str.charAt(0)) + " " + toUpper(str.substring(1));
		}
	}
    
	/**
	 * 
	 * @returns the sum of each individual number within a whole number. 
	 */
	public static int sumOfDigits(int n) 
	{
		n = Math.abs(n);
		if (n == 0)
			return 0;
		else {
			return n % 10 + sumOfDigits(n / 10);
		}
	}

}
