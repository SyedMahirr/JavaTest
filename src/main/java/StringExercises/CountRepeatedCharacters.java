package StringExercises;

import java.util.HashMap;
import java.util.Map;

/*
 * HOW MANY TIMES THE CHARACTER REPEATS IN A STRING
 * LOGIC: Use HashMap to store in key value pair - key is unique, value is repeated character 
 * 		  Remove the blank spaces 
 * 		  traverse the each character in the string 
 * 	      use toChar() -  converts string to char
 *        if the character is present then increment by one 
 *        else not then simple print out 
 * 
 */
public class CountRepeatedCharacters {

	public static void main(String[] args) {
		countRepeaterCharacterInTheString("programming");
	}

	public static void countRepeaterCharacterInTheString(String string) {
		// Removes blank space
		string = string.replace(" ", "");
		// use map interface
		Map freqCount = new HashMap<Character, Integer>();
		// Convert the String to Character
		for (char character : string.toCharArray()) {
			// if the character is present
			if (freqCount.containsKey(character)) {
				// take the character and increment by one
				freqCount.put(character, (Integer) freqCount.get(character) + 1);
			} else {
				// print the character
				freqCount.put(character, 1);
			}
		}
		System.out.println(freqCount);
	}

}
