/**
 * 
 */
package StringExercises;

/**
 * @author SyedAlam Count the repeated characted in a String Logic : Take the
 *         original one and substract with replaceAll
 */
public class CountTheRepeated {

	/**
	 * @param Pass the String 
	 */
	public static void main(String[] args) {

		getTheCountOfRepeatedCharacter("I am replacing a inside a String");
	}

	public static void getTheCountOfRepeatedCharacter(String word) {
		int result = word.length() - word.replaceAll("a", "").length();
		System.out.println(result);
	}
}
