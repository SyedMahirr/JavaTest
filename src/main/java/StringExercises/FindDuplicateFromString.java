package StringExercises;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromString {

	public static void main(String[] args) {
		String[] words = { "Java", "Java", "Mahir" };
		Set<String> set = new HashSet<String>();
		// traverse and store all the word
		for (String holdWords : words) {
			// compare values by storing
			if (set.add(holdWords) == false) {
				System.out.println(holdWords);
			}

		}
	}

}
