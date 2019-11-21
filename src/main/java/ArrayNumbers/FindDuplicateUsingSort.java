/**
 * 
 */
package ArrayNumbers;

import java.util.Arrays;

/**
 * @author SyedAlam Logic: compare with eachother to find the duplicate
 */
public class FindDuplicateUsingSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3, 1, 1, 3, 5, 6 };
		findDuplicateArray(numbers);
	}

	public static void findDuplicateArray(int[] arr) {
		// this will sort the array
		Arrays.sort(arr);

		// for loop will traverse the array
		for (int i = 0; i < arr.length-1; i++) {
			// check and compare the array element with next ones
			if (arr[i] == arr[i + 1]) {
				// you have found the duplicate
				System.out.println("Found the Duplicate Values: " + arr[i]);
			}
		}
	}

}
