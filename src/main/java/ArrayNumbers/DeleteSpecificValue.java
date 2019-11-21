/**
 * 
 */
package ArrayNumbers;

/**
 * @author SyedAlam
 *
 */
public class DeleteSpecificValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrays = {1,2,3,4,5,12};
		deleteSpecificValue(arrays, 12);
	}

	public static void deleteSpecificValue(int[] array, int deleteValue) {
		// Traverse the Array
		for (int i = 0; i < array.length; i++) {
			// check if the value is found
			if (deleteValue == array[i]) {
				// print value is found
				System.out.println("Value is found in the array ");

				// when the value is found again traverse from the particular array to shift
				// position
				for(int j = i; j<array.length-1; j++) {
					// shift possition
					array[j] = array[j+1];
				}
				// break the loop 
				break; 
			}
		}
		
		// print the array 
		
		for (int i = 0; i<array.length-1; i++) {
			System.out.println(array[i]);
		}

	}
}
