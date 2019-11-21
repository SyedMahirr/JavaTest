/**
 * 
 */
package StringExercises;

/**
 * @author SyedAlam Using recursion: a function calling inside the same fucntion
 *         Logic - Fetch 1st character from the BB and compare the last
 *         character
 * 
 */
public class CheckForPallindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word = "MadaM";
		boolean result = isPallindrome(word);
		System.out.println("\n" + word + " " + result);

	}

	public static boolean isPallindrome(String stringPallindrome) {
		// checking empty string
		if (stringPallindrome == null) {
			return false; // not palindrome
		}

		// checking single character string
		if (stringPallindrome.length() <= 1) {
			return true; // is palindrom
		}

		// Storing First character of the String
		String firstCharacter = stringPallindrome.substring(0, 1);
		// Storing Last Character of the String
		String lastCharacter = stringPallindrome.substring(stringPallindrome.length() - 1, stringPallindrome.length());
		if (!firstCharacter.equals(lastCharacter)) {
			return false; // not palindrom
		} else {
			//
			return isPallindrome(stringPallindrome.substring(1, stringPallindrome.length() - 1));
		}

	}
}
