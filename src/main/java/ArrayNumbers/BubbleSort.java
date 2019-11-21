/**
 * 
 */
package ArrayNumbers;

/**
 * @author SyedAlam
 * 
 *    What is bubble sort? Sorting that compare element with the next
 *         element in a list and then swaps How many rounds? number of values
 *         that are presented in the list - 1.
 * 
 * 
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayList = { 1, 290, 227, 2, 4, 6 };
		bubbleSort(arrayList);
	}

	public static void bubbleSort(int arr[]) {
		int temp;
		// number of rounds
		for (int i = 0; i < arr.length; i++) {
			// two adjacent element
			// -i ? keep the last element and dont compare

			// this variable will not touch the sorted element
			int flag = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// compare two element
				// firs the 1st one bigger then swap position
				if (arr[j] > arr[j + 1]) {
					// swap
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}

			if (flag == 0) {
				break;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
