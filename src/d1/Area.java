package d1;

import java.util.Scanner;

public class Area{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//반지름 10 , 5 이 도형의 넓이를 구하라
		System.out.println("r1의 반지름을 입력하시오.");
		double r1 = scanner.nextDouble();


		System.out.println("r2의 반지름을 입력하시오.");
		double r2 = scanner.nextDouble();


		double area1 = r1 * r1 * Math.PI;
		double area2 = r2 * r2 * Math.PI;

		System.out.println("r1의 넓이 : " + area1);
		System.out.println("r2의 넓이 : " + area2);
		
		double result = area1 - area2;
		System.out.println("-------결과-------");
		System.out.println(result);

		// r1 = 10, r2 = 5
		// r1의 넓이 r1 * r1 * 3.14
		// r2의 넓이 r2 * r2 * 3.14
		
		//음수처리 - abs, 음수가 나올때만 상항 연산자
		// 조건이 참? 참일때 결과식 : 거짓일때
		
		result = result < 0 ? Math.abs(result) : result;
		
		
	}

}
