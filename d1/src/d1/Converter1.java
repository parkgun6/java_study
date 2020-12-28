package d1;

import java.util.Scanner;

public class Converter1 {

	public static void main(String[] args) {
		
		//재료 
		Scanner scanner = new Scanner(System.in);
		double result = 0.0;
		
		//논리
		System.out.println("1섭씨 -> 화씨, 2화씨->섭씨");
		int oper = scanner.nextInt();
		
		System.out.println("온도를 입력하세요 ");
		double deg = scanner.nextDouble();
		
		result = oper == 1? 32 + (1.8 * deg) : 0.5556 + ( deg - 32); 
		
		System.out.println(result);
		
		
		
		// oper가 1이면 섭씨 -> 화씨 
	
			// result =  32 + (1.8 * deg)

		
		// oper가 2이면 화씨 -> 섭씨 

			// result =  0.5556 + ( deg - 32)

		
	}
}