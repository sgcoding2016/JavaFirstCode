/**
 * 
 */
package first;

/**
 * 
 */
public class LabExercise17Sept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myName;
		myName = "Saul Greenberg";
		System.out.println(myName);
		System.out.println("The number of characters in the string " + myName.length());
		System.out.println("The first character in the string is " + myName.charAt(0)
				+ " and the second character in the string is " + myName.charAt(1));
		System.out.println(myName.toUpperCase());
		System.out.println(myName.replace('a', '*'));
		System.out.println(myName.indexOf('n'));

		int value;
		value = 5 / 3;
		System.out.println(value);

	}

}
