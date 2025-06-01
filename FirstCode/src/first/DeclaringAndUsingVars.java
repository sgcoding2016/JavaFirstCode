/**
 * 
 */
package first;

/**
 * 
 */
public class DeclaringAndUsingVars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int side, area;
		side = 6;
		area = side * side;

		System.out.println(area);

		double radius, pi, area2;
		pi = 3.142;
		radius = 9;
		area2 = pi * (radius * radius);
		System.out.println("Radius of circle \t:" + radius + " cm");
		System.out.printf("Area of Circle \t:%.3f cm2", area2);
	}

}
