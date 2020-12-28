package d2;

import java.util.Scanner;

public class Machine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money, change = 0;
		int five = 0, hundred = 0, ten = 0;
		int coke = 800;
		int soda = 500;
		int orange = 600;
		while (true) {
			// 메뉴보여주기
			System.out.println("어서오세요 메뉴보기는 Enter를 눌러주세요.");
			System.out.println( scanner.nextLine());
			System.out.println("1.콜라 : 800원\n2.사이다 : 500원\n3.환타 : 600원");
			// 넣은돈, 넣은돈 출력
			System.out.println("돈을 넣어주세요.");
			int insert = Integer.parseInt(scanner.nextLine());
			System.out.println("넣은돈:" + insert);
			// 메뉴고르기
			System.out.println("메뉴를 골라주세요.");
			int choice = Integer.parseInt(scanner.nextLine());
			// 넣은돈에서 메뉴의 값을 빼기
			switch (choice) {
			case 1:
				change = insert - coke;
				break;
			case 2:
				change = insert - soda;
				break;
			case 3:
				change = insert - orange;
				break;
			}// end switch
				// 거스름돈 출력하기
			System.out.println("거스름돈" + change + "원입니다.");

			// 거스름돈 갯수 반환하기
			if (change >= 500) {
				five = change / 500; // int 연산이므로 소수점은 없어진다.
				change = change - (five * 500);
			}
			// 100원 개수
			if (change >= 100) {
				hundred = change / 100;
				change = change - (hundred * 100);
			}
			if (change >= 10) {
				ten = change / 10;
			}
			System.out.println("500원: " + five);
			System.out.println("100원: " + hundred);
			System.out.println("10원: " + ten);
			System.out.println("이용해주셔서 감사합니다.");
			System.out.println("-------------------------");
			continue;
		}
	}
}
