/**
 * 
 */
package importing;

import java.util.Scanner;

/**
 * 
 */
public class Exercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double squareLength, squareLngth, perimeter, area;
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("What is the length of one side of a square?");

		squareLngth=keyboard.nextDouble();
		
		squareLength = 2;

		perimeter = 4 * squareLngth;
		area = Math.pow(squareLngth, 2);

		System.out.printf("The perimeter is %.2f and the area is %.2f", perimeter, area);

	}

}
