/**
 * 
 */
package ArrayNumbers;

import java.util.Arrays;

/**
 * @author SyedAlam
 *
 */
public class CheckSpecificValueIsPresent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arrayValue = { 1, 2, 3, 4, 5 };
		checkForSpecificValue(arrayValue, 2);
	}

	public static void checkForSpecificValue(int[] arr, int specificValue) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == specificValue) {
				System.out.println(
						"Value is Present " + "Which is: " + specificValue + " inside " + Arrays.toString(arr));
			}
		}
	}
}
