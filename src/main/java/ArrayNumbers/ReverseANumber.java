/**
 * 
 */
package ArrayNumbers;

/**
 * @author SyedAlam
 * How to get the last Number? -- > Number % 10 will get you the last number 
 * How to remove the last numbr? --> Number / 10 will remove the last number 
 * 
 * 
 */
public class ReverseANumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rverseNumber(321);
	}

	
	public static int rverseNumber (int number) {
		int result = 0;
		
		// while loop bcz we dont want to get the number as 0 at the end 
		while(number>0) {
			// This will take the last number 
			result = result * 10 + number % 10;
			// this will remove the last number
			number= number / 10;
			
		}
		System.out.println(result);
		return result;
	}
	
	
}
