/**
 * 
 */
package ArrayNumbers;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SyedAlam
 *
 */
public class FindDuplicateElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 32 };
		findDuplicateElement(arr);
	}

	public static void findDuplicateElement(int[] arr) {
		// Set returns only unique values
		Set<Integer> set = new HashSet<Integer>();
		// Traverse the whole array
		for (Integer integer : arr) {
			if (set.add(integer) == false) {
				System.out.println(integer);
			}
		}
	}

}
