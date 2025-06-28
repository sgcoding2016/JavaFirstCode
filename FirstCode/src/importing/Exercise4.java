/**
 * 
 */
package importing;

import java.util.Scanner;

/**
 * 
 */
public class Exercise4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int wholeNum;
		
		double sqRoot;
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("What whole number do you want?");
		
		wholeNum=keyboard.nextInt();
		
		sqRoot=Math.sqrt(wholeNum);
		
		System.out.println(sqRoot);
		

	}

}
