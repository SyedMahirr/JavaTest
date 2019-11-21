/**
 * 
 */
package StringExercises;

import java.util.Arrays;

/**
 * @author SyedAlam
 * Aragram - re-arranging letters 
 * Logic: Convert the String to Character 
 * 		  Sort the arrays 
 * 		  check if the both arrays are equals to each other 
 */
public class CheckStringIsAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word1 = "army";
		String word2 = "mary";
		
		// Convert the String to Char 
		char[] convertWord1 = word1.toLowerCase().toCharArray();
		char[] convertWord2 = word2.toLowerCase().toCharArray();
		
		// sort the arrays;
		Arrays.sort(convertWord1);
		Arrays.sort(convertWord2);
		
		// compare: 
		if(Arrays.equals(convertWord1, convertWord2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}

	}
	


}
