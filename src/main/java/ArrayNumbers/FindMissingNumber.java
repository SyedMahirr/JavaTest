/**
 * 
 */
package ArrayNumbers;

/**
 * @author SyedAlam logic = get the sum of two arrays and subtract from there.
 */
public class FindMissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x[] = { 12, 34, 56, 12 };
		int y[] = { 12, 56, 12 }; // missing 34

		int sum1 = 0;

		int sum2 = 0;
		int expected = 0;
		for (int i = 0; i < x.length; i++) {
			sum1 = sum1 + x[i];
		}

		System.out.println(sum1);

		for (int i = 0; i < y.length; i++) {
			sum2 = sum2 + y[i];
		}

		System.out.println(sum1 - sum2);

	}
}
