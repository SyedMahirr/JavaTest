package StringExercises;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromString("mahir");
		palindromString("madam");
	}

	
	// Check for Palindrome
	public static void palindromString(String word) {
		
		String holdChar = "";
		
		// loop will start from end of the string 
		for(int i = word.length()-1; i>=0; i--) {
			holdChar = holdChar + word.charAt(i);
		}
		System.out.println(holdChar);
		
		if(word.contains(holdChar)) {
			System.out.println("its Palindrome");
		}
		else {
			System.out.println("not palindorme");
		}
	}
}
