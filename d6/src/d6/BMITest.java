package d6;

import java.util.Scanner;

public class BMITest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("insert your name");
		String name = scanner.nextLine();
		System.out.println("insert your height");
		// nextLine만 쓰기
		double height = Double.parseDouble(scanner.nextLine());
		System.out.println("insert your weight");
		// nextLine만 쓰기
		double weight = Double.parseDouble(scanner.nextLine());
		PersonData p1 = new PersonData(name,height,weight);
		
		double bmi = p1.calc();
		System.out.println(bmi);
		System.out.println(p1.toString());
	}
}
