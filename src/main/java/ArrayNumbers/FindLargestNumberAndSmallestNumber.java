/**
 * 
 */
package ArrayNumbers;

import java.util.Arrays;

/**
 * @author SyedAlam Logic: Assume that in index 0 is the largest and Smallest
 *         Then compare the values
 */
public class FindLargestNumberAndSmallestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arrayNumbers = { 1, 4, 5, 6, 2, 90, 76 };
		// Assume in element 0 is the largest
		int largest = arrayNumbers[0];

		// Assume in element 0 is the smallest
		int smallest = arrayNumbers[0];

		// traverse the array for comparing
		for (int i = 1; i < arrayNumbers.length; i++) {
			if (arrayNumbers[i] > largest) {
				largest = arrayNumbers[i];
			} else if (arrayNumbers[i] < smallest) {
				smallest = arrayNumbers[i];
			}

		}

		// print out the orginal array
		System.out.println(Arrays.toString(arrayNumbers));

		// print out the max number
		System.out.println(largest);

		// print out the smallest number
		System.out.println(smallest);
	}

}
