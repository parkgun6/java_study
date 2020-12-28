package d1;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		
		// 키와 몸무게 입력
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("키(cm)를 입력하세요.");
		double h = scanner.nextDouble();

		System.out.println("체중(kg)을 입력하세요.");
		double w = scanner.nextDouble();
		
		// bmi지수 계산식 bmi = ( w * 10000 ) / ( h * h )

		double bmi2 = (w * 10000) / (h * h);
		double bmi = Double.parseDouble(String.format("%.1f", bmi2));
		String bmiStr = "";

		System.out.println("당신의 BMI지수는 " + bmi + "이므로.");

		if (bmi < 18.5) {
			bmiStr = "a";
		} else if (bmi <= 23) {
			bmiStr = "b";
		} else if (bmi <= 25) {
			bmiStr = "c";
		} else if (bmi <= 30) {
			bmiStr = "d";
		} else if (30 < bmi) {
			bmiStr = "e";
		}
		System.out.println("당신은"+bmiStr);
		System.out.println( scanner.nextLine());
		continue;}
		
		/*
		 * 저체중: 18.5 미만 
		 * 정상체중: 18.5 이상 ~ 23 미만 (가장 이상적인 BMI는 21이다) 
		 * 과체중: 23 이상 ~ 25 미만
		 * 경도비만: 25 이상 ~ 30 미만 
		 * 고도비만: 30 이상
		 */

	}
}

