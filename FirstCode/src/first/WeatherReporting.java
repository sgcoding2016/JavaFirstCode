/**
 * 
 */
package first;

/**
 * 
 */
public class WeatherReporting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double tempDay1, tempDay2, tempDay3, tempDay4, tempDay5, averageTemp; // double is for float numbers
		int daysOfSun; // this var will be calculated through conditional statements based on boolean
						// below
		boolean sunDay1, sunDay2, sunDay3, sunDay4, sunDay5;

		tempDay1 = 15.5;
		tempDay2 = 10.5;
		tempDay3 = 16.0;
		tempDay4 = 12.5;
		tempDay5 = 17.0;

		// next is to identify which days have sun by boolean selection

		sunDay1 = true;
		sunDay2 = false;
		sunDay3 = true;
		sunDay4 = true;
		sunDay5 = false;

		averageTemp = (tempDay1 + tempDay2 + tempDay3 + tempDay4 + tempDay5) / 5; // calculate temp's divided by number
																					// of days
		daysOfSun = 0; // initialisation of this var
		if (sunDay1 == true) {
			daysOfSun++; // Java method for aggregating the sunny days
		}
		if (sunDay2 == true) {
			daysOfSun++;
		}
		if (sunDay3 == true) {
			daysOfSun++;
		}
		if (sunDay4 == true) {
			daysOfSun++;
		}
		if (sunDay5 == true) {
			daysOfSun++;
		}

		System.out.println("Weather analysis \n_______________________________\nDay1"); // making sure to implement line
																						// spaces and underscores
		System.out.printf("Temp\t:  %.1f\n", tempDay1); // using tab and line spaces
		System.out.println("Sun \t:  " + sunDay1);
		if (tempDay1 > averageTemp) {
			System.out.println("Above average Temp"); // condition to test is day temp is greater than average temp
		}
		System.out.println("_______________________________\nDay2");
		System.out.println("\n");
		System.out.println("_______________________________\n");

		System.out.println("Overall stats"); // start of Overall stats
		System.out.printf("Average temp\t\t:  %.1f\n", averageTemp);
		System.out.printf("Number of days of sun\t:  %d\n", daysOfSun); // use %d for a single digit number, i.e., no
																		// float

//		System.out.println(daysOfSun);
//		System.out.printf("this is it %.2f",averageTemp);

	}

}
