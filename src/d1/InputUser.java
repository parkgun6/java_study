package d1;

import java.util.Scanner;

public class InputUser {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("your name: ");
		String name = scanner.nextLine();
		System.out.println(name);
		System.out.println("------------------------");
		String name2 = scanner.nextLine();
		System.out.println(name2);
		
		float f = scanner.nextFloat();
		
		int i = scanner.nextInt();

	}

}
