/**
 * 
 */
package ArrayNumbers;

import java.util.HashSet;

/**
 * @author SyedAlam
 *
 */
public class CommonElementsInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,51};
		int[] b = {1,5,2,4,90};
		commonElement(a,b);
	}

	
	public static void commonElement(int[] a, int[] b) {
		
		
		
		// for loop will traverse the 1st array 
		for(int i =0; i<a.length; i++) {
			
			HashSet<Integer> hs = new HashSet<>();
			// for loop will traverse 2nd array 
			for(int j = 0; j<b.length; j++) {
				
				// compare 
				if(a[i] == b[j]) {
					// check if it is present in a[i]
					hs.add(a[i]);
				}
			}
			
			
			for (Integer element : hs) {
				System.out.println("present: " + "" + element);
				
			}
		}
		
		
		
	} 
}
