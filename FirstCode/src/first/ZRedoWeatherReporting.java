/**
 * 
 */
package first;

/**
 * 
 */
public class ZRedoWeatherReporting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double tempDay1=15.5,tempDay2=10.5,tempDay3=16,tempDay4=12.5,tempDay5=17, avgTemp=0;//could be an array of numbers
																							//and a for loop in printBlocks method
		double[] tempDay=new double[] {15.5,10.5};//only used a couple of data points																					//that selects day index and then temp
																							//and then boolean for sun
																							//and then finally the message method
		boolean sunDay1=false,sunDay2=false,sunDay3=false,sunDay4=false,sunDay5=false;
		boolean[] sunDay=new boolean[] {true, false};
		int totalSunDays=0;
		
		
		avgTemp=(tempDay1+tempDay2+tempDay3+tempDay4+tempDay5)/5;
		
//		System.out.println(message(tempDay1,avgTemp));
		
		printBlocks(tempDay,avgTemp,sunDay);

	}
	/**
	 * 
	 * @param temp
	 * @param average
	 * @return
	 */

	public static String message(double temp,double average) {
		String avgTempMessage="Above average Temp", msg="";
		if (temp>average) {
			msg=avgTempMessage;
		}
		return msg;
		
		
		
		
	}
	/**
	 * 
	 * @param temps
	 * @param av
	 * @param weather
	 */
	
	public static void printBlocks(double[] temps, double av, boolean[] weather) {
		System.out.println("_____________________________");
		for (int i=0;i<temps.length;i++) {
			System.out.println("Day "+(i+1));
			System.out.println("Temp "+temps[i]);
			if (weather[i]==true) {
				System.out.println("Sun: "+true);
			}
			System.out.println(message(temps[i], av));
			System.out.println("_____________________________");
			
		}
		
		
	}

}
