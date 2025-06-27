/**
 * 
 */
package first;

/**
 * 
 */
public class MakingDecisions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number1, number2;
		number1 = 44;
		number2 = 100;
		if (number1 > number2) {
			System.out.println(number1 + " is the biggest");
			System.out.println();
		}
		if (number2 > number1) {
			System.out.printf(number2 + " is the biggest");
			System.out.println();
		}
		 if (number1>number2) { // condition expression - two possible outcomes
		 //TRUE or FALSE
		 //if TRUE - only in here if number1 is bigger than number 2
		 System.out.println("Biggest number "+number1);
		 }
		 if (number1<number2) {
		 //only in here if number1 is bigger than number 2
		 System.out.println("Biggest number "+number2);
		 }
		 if (number1==number2) {
		 //only in here if number1 is same as number 2
		 System.out.println("Numbers are the same ");
		 }
	}

}
