package race;

public class HorseRace {

	
	public static void main(String[] args) {
		
		Horse[] arr = new Horse[4];
		arr[0] = new Horse("1번마");
		arr[1] = new Horse("2번마");
		arr[2] = new Horse("3번마");
		arr[3] = new Horse("4번마");
		
		for (Horse horse : arr) {
			horse.start();
		}
		
	}
}
