/**
 * 
 */
package importing;

import java.util.Scanner;

/**
 * 
 */
public class Exercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int nameLength;

		System.out.println("What is your full name?");
		name = scanner.nextLine();
		System.out.println("How many characters in a name do you regard as long?");
		nameLength = scanner.nextInt();

		if (name.length() >= nameLength) {
			System.out.println("So you think you have a long name");
		} else {
			System.out.println("You have a short name.");
		}
		scanner.close();
	}
}
