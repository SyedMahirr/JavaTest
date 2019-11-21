/**
 * 
 */
package ArrayNumbers;

/**
 * @author SyedAlam
 *
 */
public class FibonachiSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonachiSeries();
	}

	public static void fibonachiSeries() {
		int a = 0;
		int b = 1;
		int c;

		System.out.print(a + " " + b + " ");

		for (int i = 2; i < 10; i++) {
			// use swapping concept
			c = a + b;
			System.out.print(c + " ");
			// shifting positions 
			a = b;
			b = c;
		}
	}
}
