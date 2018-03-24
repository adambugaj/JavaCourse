
public class WheatherData {
	
	static final String[] DAYSWEEK = {
		"Monday", "Thusday", "Wensday", "Thursday", "Friday", "Samstag", "Sunday"
	};
	
	private static void showWheather(String[] days, double[][] wheatherData) {
		for (int i = 0; i < days.length; i++) {
				System.out.println(days[i] + " - "+ wheatherData[1][i] +" - "+ wheatherData[0][i]);
			}
	}	
	
	public static String dayOfWeek( int numberDay ) {
		return DAYSWEEK[numberDay];
	}
	
	
	
	public static void main(String[] args) {
		String[] days = {"Monday", "Thusday", "Wensday", "Thursday", "Friday", "Samstag", "Sunday"};
		double[][] wheatherData = {{-6, -1, 0, 2, 2, 4, 6},{5.2, 0.2, 0, 0.2, 0, 0, 0}};
		showWheather(days, wheatherData);
		
		
		for (int i = 0; i < 7; i++) {
			System.out.println(dayOfWeek(i));
			System.out.format("2zad. Temp: %.1fC\n", wheatherData[0][i]);
			System.out.format("2zad. Opady: %.1f mm", wheatherData[1][i]);
		}
	}
}
