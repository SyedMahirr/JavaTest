/**
 * 
 */
package StringExercises;

/**
 * @author SyedAlam
 *
 */
public class ReverseASentence {

	public static void main(String[] args) {
		reversesentence("I am Mahir");
	}

	public static void reversesentence(String sentence) {
		
		// \\s removes all the whitespace
		String[] sentence1 = sentence.split("\\s");

		String result = " ";
		for (int i = sentence1.length - 1; i >= 0; i--) {
			result = result + sentence1[i] + " ";
		}
		
		System.out.println(result);
	}
}
