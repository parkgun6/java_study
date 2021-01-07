package shape;

public class Main {
	
	public static void main(String[] args) {
		
		Areable[] arr = new Areable[4];
		
		arr[0] = new Circle(10);
		arr[1] = new Rectangle(100, 40);
		arr[2] = new Triangle(40, 30);
		arr[3] = new Ladder(10, 20, 30);
		
		for (int i = 0; i < arr.length; i++) {
			Areable areable = arr[i];
		}
		
		for (Areable areable : arr) {
			System.out.println(areable.getArea());
		}
		
	}
}