package d2;

import java.util.Scanner;

public class AAa {
	public static void main(String[] args) {
		// 재료
		// 최소값 = 1
		int min = 1;

		// 최대값 = 100
		int max = 100;

		// 입력을 위한 Scanner
		Scanner scanner = new Scanner(System.in);

		// 로직- 처음에는 루프 생각 없이
		while (true) {
			// 중간값 = (최소값 + 최대값) / 2
			int mid = (min + max) / 2;
			// 화면에 중간값을 출력
			System.out.println(mid);
			// 사용자에게 피드백
			// userAnswer = 글자 하나
			String userAnswer = scanner.nextLine();
			// switch(userAnswer) {
			switch (userAnswer) {
			// case "H"
			case "H":
				//   최소값  = 중간값 + 1
				min = mid + 1;
				mid = (min + max) / 2;
				break;
			case "C":
				System.out.println("END.");
				break;
			}
		}
	}
}