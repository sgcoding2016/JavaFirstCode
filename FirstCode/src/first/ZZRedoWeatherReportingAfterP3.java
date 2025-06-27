package first;

public class ZZRedoWeatherReportingAfterP3 {

	public static void main(String[] args) {
		double tempDay1=15.5,tempDay2=10.5,tempDay3=16.0,tempDay4=12.5,tempDay5=17.0;
		boolean sunDay1=true,sunDay2=false,sunDay3=true,sunDay4=true,sunDay5=false;
		double avgTempWeek=0;
		double totalTemp=0;
		int numberDaysSun=0;
		
		totalTemp=tempDay1+tempDay2+tempDay3+tempDay4+tempDay5;
		avgTempWeek=totalTemp/5;
		
		if (sunDay1) {
			numberDaysSun+=1;
		}
		if (sunDay2) {
			numberDaysSun+=1;
		}
		if (sunDay3) {
			numberDaysSun+=1;
		}
		if (sunDay4) {
			numberDaysSun+=1;
		}
		if (sunDay5) {
			numberDaysSun+=1;
		}
		
		System.out.println("______________________");
		System.out.println("Day 1");
		System.out.printf("Temp \t: %.1f ",tempDay1);
		System.out.println("\nSun \t: " + sunDay1);
		if (tempDay1>=avgTempWeek) {
			System.out.println("Above average temp");
		}
		System.out.println("______________________");
		
//		System.out.println("______________________");
		System.out.println("Day 2");
		System.out.printf("Temp \t: %.1f ",tempDay2);
		System.out.println("\nSun \t: " + sunDay2);
		if (tempDay1>=avgTempWeek) {
			System.out.println("Above average temp");
		}
		System.out.println("______________________");
		
		System.out.println("Day 3");
		System.out.printf("Temp \t: %.1f ",tempDay3);
		System.out.println("\nSun \t: " + sunDay3);
		if (tempDay1>=avgTempWeek) {
			System.out.println("Above average temp");
		}
		System.out.println("______________________");
		
		System.out.println("Day 4");
		System.out.printf("Temp \t: %.1f ",tempDay4);
		System.out.println("\nSun \t: " + sunDay4);
		if (tempDay1>=avgTempWeek) {
			System.out.println("Above average temp");
		}
		System.out.println("______________________");
		
		System.out.println("Day 5");
		System.out.printf("Temp \t: %.1f ",tempDay5);
		System.out.println("\nSun \t: " + sunDay5);
		if (tempDay1>=avgTempWeek) {
			System.out.println("Above average temp");
		}
		System.out.println("______________________");
		
//		System.out.println("____________________________________");
		System.out.println("\nOverall stats");
		System.out.printf("Average temp \t: %.1f", avgTempWeek);
		System.out.println("\nNumber of days of sun \t: " + numberDaysSun +
		"\n");

	}

}
