/**
 * 
 */
package importing;

import java.util.Scanner;

/**
 * 
 */
public class Exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//try also with a ternary operator
		//if (age>=18 ? "You can vote" : "You cannot vote"); note the use of brackets
		//check against conditional operator and ternary in the lecture notes
		
		Scanner keyboard = new Scanner(System.in);
		double userAge;

		System.out.println("What is your age?");
		userAge = keyboard.nextDouble();

		if (userAge >= 18) {
			System.out.println("You can vote.");
		} else {
			System.out.println("You cannot vote.");
		}

		keyboard.close();
	}

}
