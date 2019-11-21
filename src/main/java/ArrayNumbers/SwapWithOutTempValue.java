/**
 * 
 */
package ArrayNumbers;

/**
 * @author SyedAlam Logic = use the concept of addition and substraction
 */
public class SwapWithOutTempValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		swapValues(10, 20);
	}

	public static void swapValues(int a, int b) {
		// get the total value of the both number
		a = a + b;
		// substract from the total
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

}
