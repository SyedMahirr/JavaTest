/**
 * 
 */
package StringExercises;

/**
 * @author SyedAlam
 * How to count number of words in a String 
 *  Logic:  you need to take out the white spaces by using split()
 *  then store the string in an array and use the count the lenght of the array
 *  
 */
public class CountNumberOfWords {

	public static void main(String[] args) {
		countNumberOfWords("I am Syed");
	}
	
	public static void countNumberOfWords(String words) {
		String wordsSplit[] = words.split(" ");
		System.out.println(wordsSplit.length);
	}
}



