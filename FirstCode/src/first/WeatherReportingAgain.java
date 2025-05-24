/**
 * 
 */
package first;

/**
 * 
 */
public class WeatherReportingAgain {
	/**
	 * This method performs a weather analysis for a week (5 days) and outputs
	 * statistics for each day and overall.
	 *
	 * The method calculates the average temperature for the week, the number of
	 * sunny days, and determines if each day's temperature is above the average
	 * temperature or not. It then prints the weather analysis for each day along
	 * with overall statistics including the average temperature and the number of
	 * days with sunshine.
	 *
	 * @param args The command-line arguments passed to the program (not used in
	 *             this method).
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables to store daily temperature readings, sunshine
		// status, and
		// statistical results
		double tempDay1, tempDay2, tempDay3, tempDay4, tempDay5, averageTemp; // need to keep decimal point numbers so
		// using doubles
		boolean sunDay1, sunDay2, sunDay3, sunDay4, sunDay5; // boolean is
		// either true or false
		int numberOfDaysSun; // total number will be a whole number therefore
		// an int
		// initialise variables with specific temperature and sunshine values
		// for each
		// day
		tempDay1 = 15.5;
		tempDay2 = 10.5;
		tempDay3 = 16.0;
		tempDay4 = 12.5;
		tempDay5 = 17.0;
		sunDay1 = true;
		sunDay2 = false;
		sunDay3 = true;
		sunDay4 = true;
		sunDay5 = false;
		numberOfDaysSun = 0;
		averageTemp = 0;
		// average temp for the week - note use of brackets here - Java uses
		// similar BODMAS bracket groupings to order operations
		averageTemp = (tempDay1 + tempDay2 + tempDay3 + tempDay4 + tempDay5) / 5;
		// Determine the number of days with sunshine by checking the boolean
		// variables
		if (sunDay1 == true) { // this can be shorted to if (sunDay1) {
			numberOfDaysSun = numberOfDaysSun + 1; // this can also be
			// shortened to numberOfDaysSun++; (that's the
			// increment operator)
		}
		if (sunDay2) { // note shortened version
			numberOfDaysSun++; // note use of increment operator version
		}
		if (sunDay3) {
			numberOfDaysSun++;
		}
		if (sunDay4) {
			numberOfDaysSun++;
		}
		if (sunDay5) {
			numberOfDaysSun++;
		}
		// Output the header for the weather analysis
		System.out.println("Weather analysis");
		// Output information for Day 1
		System.out.println("____________________________________");
		System.out.println("Day 1 ");
		// Print the temperature for Day 1 with one decimal place. This line of
		// code
		// uses System.out.printf() to print the temperature value for Day 1.
		// The format
		// specifier %.1f ensures that the 'tempDay1' value will be displayed
		// with one
		// decimal place. The "\t" adds a tab character for proper alignment,
		// making the
		// output look organised and readable.
		System.out.printf("Temp \t: %.1f ", tempDay1);
		System.out.println("\nSun \t: " + sunDay1);
		// Check if the temperature on Day 1 is greater than or equal to the
		// average
		// temperature.
		if (tempDay1 >= averageTemp) {
			// If the temperature on Day 1 is higher or equal to the average,
			// print "Above
			// average Temp".
			System.out.println("Above average Temp");
		}
		// Output information for Day 2
		System.out.println("____________________________________");
		System.out.println("Day 2 ");
		System.out.printf("Temp \t: %.1f ", tempDay2);
		System.out.println("\nSun \t: " + sunDay2);
		if (tempDay2 >= averageTemp) {
			System.out.println("Above average Temp");
		}
		// Output information for Day 3
		System.out.println("____________________________________");
		System.out.println("Day 3 ");
		System.out.printf("Temp \t: %.1f ", tempDay3);
		System.out.println("\nSun \t: " + sunDay3);
		if (tempDay3 >= averageTemp) {
			System.out.println("Above average Temp");
		}
		// Output information for Day 4
		System.out.println("____________________________________");
		System.out.println("Day 4 ");
		System.out.printf("Temp \t: %.1f ", tempDay4);
		System.out.println("\nSun \t: " + sunDay4);
		if (tempDay4 >= averageTemp) {
			System.out.println("Above average Temp");
		}
		// Output information for Day 5
		System.out.println("____________________________________");
		System.out.println("Day 5 ");
		System.out.printf("Temp \t: %.1f ", tempDay5);
		System.out.println("\nSun \t: " + sunDay5);
		if (tempDay5 >= averageTemp) {
			System.out.println("Above average Temp");
		}
		// Output the overall statistics
		System.out.println("____________________________________");
		System.out.println("\nOverall stats");
		System.out.printf("Average temp \t: %.1f", averageTemp);
		System.out.println("\nNumber of days of sun \t: " + numberOfDaysSun + "\n");

	}

}
