/**
 * 
 */
package first;

/**
 * 
 */
public class IfStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declaring variables
		int num1, num2, answer;

		// assigning a value
		num1 = 20;
		num2 = 30;

		// using the assignment operator (=) to store the output of the expression
		// (num1+num2). Note using the addition (+) operator here
		answer = num1 + num2;
		// output the contents of the variable answer to screen
		System.out.println(answer);

		// making a decision using an if statement
		if (answer > 20) { // a conditional expression checking if answer is over 30
			// this line will execute only if the condition is true
			System.out.println("Answer is over 30");
		}

	}

}
