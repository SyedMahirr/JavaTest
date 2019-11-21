/**
 * 
 */
package StringExercises;

/**
 * @author SyedAlam
 *
 */
public class ReverseAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reverseString("Mahir");

	}

	
	public static void reverseString (String nameOfString) {
		// Empty String will hold each character
		String holdsCharacter = "";
		// for loop will traverse from the last character index 
		for(int i = nameOfString.length()-1; i>=0; i--) {
			holdsCharacter = holdsCharacter + nameOfString.charAt(i);
		}
		System.out.println(holdsCharacter);
	}
}
