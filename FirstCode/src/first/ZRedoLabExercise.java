/**
 * 
 */
package first;

/**
 * 
 */
public class ZRedoLabExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World! I am alive");
		
		System.out.println("Hello World! I am alive\nI can write on two lines!");
		
		System.out.println("Hello World! I am alive\n\nI can write on two lines!");
		
		System.out.printf("%7s\n%8s\n%9s\n%10s\n","*","***","*****","*******","*********");
		System.out.println("Happy Christmas");
		System.out.println();
		
		
		String newName="Saul";
		
		System.out.println(newName);
		
		System.out.println(newName.charAt(0)+" "+newName.charAt(newName.length()-1));
		
		System.out.println(newName.toUpperCase());
		
		System.out.println(newName.replace("a","*"));
		
		System.out.println(newName.indexOf("u", 0));
		System.out.println();
		
		int lengthSideOfSquare=6;
		double area=Math.pow(lengthSideOfSquare,2);
		System.out.println((int)area);
		System.out.println();
		
		double radius=9;
		double PI=3.142;
		double area2=PI*(Math.pow(radius, 2));
		System.out.printf("area: %.3f", area);
		System.out.println();
		System.out.println();
		
		int number1=44, number2=100;
		
		if (number1>number2) {
			System.out.println(number1);
		}else if (number1==number2){
			System.out.println("Numbers are the same");
		}else {
			System.out.println(number2);
		}
		
		
		
		
		
		
		

	}

}
