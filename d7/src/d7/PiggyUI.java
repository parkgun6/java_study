package d7;

import java.util.Scanner;

public class PiggyUI {
	// 공유
	Scanner scanner;
	// 조력자/의존성
	PiggyService service;

	public PiggyUI() {
		scanner = new Scanner(System.in);
		service = new PiggyService();
	}

	// 입금인지 출금인지
	public void userAnswer() {
		//while 루프를 사용하여 저장한 값을 이용하여 반복하였다.
		while (true) {
			System.out.println("----------------------");
			System.out.println("1 : 입금\n2 : 출금");
			System.out.println("----------------------");
			int answer = Integer.parseInt(scanner.nextLine());

			if (answer == 1) {
				inputDeposit();
			} else if (answer == 2) {
				confirmWithdraw();
				//ATM은 끄는기능이없기때문에 종료를 넣지않았다.
			} // end if
		} // end while
	}// end userAnswer

	// 입금
	public void inputDeposit() {
		System.out.println("얼마 입금하시겠습니까?");

		int money = Integer.parseInt(scanner.nextLine());
		service.deposit(money);
		System.out.println("입금이 완료되었습니다.");
		// 총액
		System.out.println("잔액은 " + service.balance + "원 입니다.");
	}

	// 출금
	public void confirmWithdraw() {
		System.out.println("얼마 출금하시겠습니까?");
		int money1 = Integer.parseInt(scanner.nextLine());
		String result = service.withdraw(money1);
		System.out.println(result);
		//로직 메서드에서는 sysout을 사용하지 못하기 때문에 string 타입으로 변환하여 리턴하였다.
		System.out.println("남은 잔액은 " + service.balance + "원 입니다.");
	}


}


