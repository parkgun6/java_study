package d2;

import java.util.Scanner;

public class ChangeCalculater {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.콜라 : 800원\n2.사이다 : 500원\n3.환타 : 600원");
		
		
		System.out.println("거스름돈을 입력하세요.");
		
		//1229 => /10 =>122*10 => 1220
		int change = (scanner.nextInt()/10)*10;
		
		int count500 = 0, count100 = 0, count10 = 0;
		//로직
		//change가 500보다 크면
		//500원 개수를 계산
		if(change >= 500) {
		count500 = change / 500; // int 연산이므로 소수점은 없어진다.
		}
		//잔돈에서 차감
		//change = change - ( count500 * 500 );
		if(change >= 100) {
		change -= ( count500 * 500 );
		}
		//100원 개수를 계산 
		if(change >= 10) {
		count100 = change / 100;
		change -= ( count100 * 100 );
		}
		//10원 개수를 계산
		
		count10 = ( change / 10 );
		
		System.out.println("500: "+ count500);
		System.out.println("100: "+ count100);
		System.out.println("10: "+ count10);
	}
}
