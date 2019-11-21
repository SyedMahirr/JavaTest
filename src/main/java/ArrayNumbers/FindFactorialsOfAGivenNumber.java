/**
 * 
 */
package ArrayNumbers;

/**
 * @author SyedAlam
 * FaCTORIAL MEANING : 
 *  GIVEN 5 = 5*4*3*2*1 = 120 
 */
public class FindFactorialsOfAGivenNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorialNumber(5);
	}

	
	public static void factorialNumber(int number) {
		
		int fact = 1;
		for (int i = 1; i<=number; i++) {
			fact = fact * i; 
			/*
			 *  1 * 1 = 1
			 *  1 * 2 = 2 
			 *  1 * 3 = 3
			 *  1 * 4 = 4 
			 *  1 * 5 = 5 
			 *  --> 1 * 2 * 3 * 4 * 5 = 120 
			 */
		
		}
		
		System.out.println("The factorial of: " + number + " is " + fact);
		
	}
}
