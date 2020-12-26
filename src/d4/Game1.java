package d4;

import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;// 루프로 돌아오기위해 지정
		int inputNum = 0;
		int random = 0;
		boolean flag2 = true;
		boolean flag3 = true;
		while (flag) {// 루프
			// 인원수입력
				System.out.println("인원수를 지정해주세요.");
				inputNum = scanner.nextInt();
			
			while(flag) {
			System.out.println("인원수가 " + inputNum + "이(가) 맞습니까?\n" + "맞습니다. : 1/아닙니다 : 2");
			int correct = scanner.nextInt();

			
			if (correct == 1) {
				break;
			} else if (correct == 2) {
				flag = true;
				continue;
			} // while loop로 돌아감
			else {
				System.out.println("잘못된 값입니다. 값을 다시 입력해주세요.");
				break;// 경우의 수 루프(if)로 돌아감
			}
			}
			// end switch
			System.out.println("게임을 시작합니다.");

			
			while (true) {
				System.out.println("1부터 " + inputNum + "사이 하나의숫자를 입력해주세요.");
				// 입력받은수중 임의의 수를 하나 지정한다.
				random = (int) (Math.random() * inputNum + 1);
				// Math.random은소수점 타입이라 +1을 하였다.

				int inputNum2 = scanner.nextInt();
				if (inputNum2 == random) {
					System.out.println("당첨입니다.");
					break;
				} else if (inputNum2 == 0) {
					System.out.println("");
					continue;
				} else if (inputNum2 > inputNum) {
					System.out.println("");
					continue;
				} else if (inputNum2 != random) {
					System.out.println("꽝입니다.");
					continue;

				}
			} // end while
			while (flag2) {
				System.out.println("게임을 다시하려면 1번 중지하려면 2번을 눌러주세요.");
				int choice = scanner.nextInt();
				if (choice == 1) {
					flag2= false;
					System.out.println("처음으로 돌아갑니다.");
					System.out.println("-----------------------");
					break;
				} else if (choice == 2) {
					System.out.println("이용해주셔서 감사합니다.");
					System.out.println("-----------------------");
					break;
				} else {
					System.out.println("잘못된 값입니다.");
					continue;
				} // end if
			}
		} // flag루프
	}// 메인메소드
}

