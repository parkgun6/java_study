package d2;

public class LeapYearTest {

	public static void main(String[] args) {

		int year = 2020;
		
		boolean leapYear = false;
		
		if (year % 400 == 0) {
			leapYear = true;
		} else if (year % 100 == 0) {
			leapYear = false;
		} else if (year % 4 == 0) {
			leapYear = true;
		}
		
		int lastDate = leapYear? 29 : 28;
		int firstDay = 4; // 토요일

		
		for(int i = 0; i < (lastDate+firstDay);i++) {
			
			if(i<firstDay) {
				System.out.print("00"+"\t");
			}else {
				System.out.print( (i - firstDay+1) +"\t");
			}
			
			if(i % 7 == 6) {
				System.out.println();
			}
		}
		
	}
}
