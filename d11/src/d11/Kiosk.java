package d11;

public class Kiosk {

	private static int num;
		
	public int PressButton() {
		
		
		
		return ++num;
	}
	
	public static void main(String[] args) {
		
		Kiosk m1 = new Kiosk();
		
		Kiosk m2 = new Kiosk();
		
		System.out.println(m1.PressButton());
		System.out.println(m2.PressButton());
		
		
	}
}
