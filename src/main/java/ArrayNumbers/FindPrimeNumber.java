/**
 * 
 */
package ArrayNumbers;

/**
 * @author SyedAlam What is Prime Number? --> Prime Number is divided by itself
 *         and have a remainder of 1; 2 is the lowest number, hence 1 is not and
 *         0 is not
 */
public class FindPrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println(isSpecificNumberIsPrimer(13));
		getSeriesOfPrimeNumbers(13);
	}

	// Find Sprice PrimeNumber
	public static boolean isSpecificNumberIsPrimer(int number) {

		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < number; i++) {

			// check if a number has remainder of 0 if it does then not a prime number
			/*
			 * 10 / 2 = 5 rem = 0 not prime 13 / 2 = 6.5 rem = .5
			 */
			if (number % i == 0) {
				return false; // not prime
			}

		}
		return true;
	}

	public static void getSeriesOfPrimeNumbers(int number) {
		for (int i = 2; i <= number; i++) {
			if (isSpecificNumberIsPrimer(i))
				System.out.print(i + " ");
		}
	}

}
