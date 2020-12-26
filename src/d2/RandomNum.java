package d2;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		// 0~0.999999 1미만
		// double value = Math.random()*3;
		// int valueInt = (int) value;
		System.out.println("어서오세요. \n1.가위\n2.바위\n3.보");
		// 재료
		// 컴퓨터가 만들어낸수 - com
		int com = (int) (Math.random() * 3);

		// 사용자가 만들어낸수 입력가능 - user
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		// 로직
		// gap=com-user
		int gap = com - user;
		int result = 0;
		System.out.println("COM : " + com);
		System.out.println("USER : " + user);
		// 만약 gap이 음수면 +3
		if (gap < 0) {
			gap = gap + 3;
		}
		// gap이 0이면 draw
		else if (gap == 0) {
			System.out.println("DRAW");
		}
		// gap이 1이면 lose
		else if (gap == 1) {
			System.out.println("LOSE");
		}
		// gap이 2이면 win
		else if (gap == 2) {
			System.out.println("WIN");
		}
	}
}
