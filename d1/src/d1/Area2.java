package d1;

import java.util.Scanner;

public class Area2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//재료 반지름 10, 5 
		// r1 = 10, r2 = 5
		System.out.println("첫번째 원의 반지름...");
		double r1 = scanner.nextDouble();
		
		System.out.println("두번째 원의 반지름");
		double r2 = scanner.nextDouble();
		
		//10인 경우 넓이 
		// area1 =   r1 * r1 * 3.14
		
		double area1 = r1 * r1 * Math.PI;
		
		//5
		// area2 = r2 * r2 * 3.14
		double area2 = r2 * r2 * Math.PI;
		
		//result = area1 - area2
		double result = area1 - area2;
		
		//음수처리  -  abs, 음수가 나올때만.. , 삼항 연산자 
		// 판단식 ? 참일때 결과식 : 거짓일때 결과식 
		
		result = result < 0 ? Math.abs(result) : result;
		
		System.out.println(result);
		
		
	}
}

