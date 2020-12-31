package d2;

import java.util.Scanner;

public class Inputtest {
	public static void main(String[] args) {

		// 재료
		// 최소값 = 1
		int min = 1;
		// 최대값 = 100
		int max = 100;
		// 입력을 위한 Scanner
		Scanner scanner = new Scanner(System.in);
		// 로직- 처음에는 루프 생각 없이
		
		// 중간값 = (최소값 + 최대값) / 2
		// 화면에 중간값을 출력
		while(true) {
			// 사용자에게 피드백H
			int mid = (min + max) / 2;
		// userAnswer = 글자 하나
			System.out.println(mid);
		String userAnswer = scanner.next();
		// switch(userAnswer) {
		switch (userAnswer) {
		case "H":
			min = mid+1;
			mid = (min+max)/2;
			System.out.println("더 높은수 이군요.");
			break;
		case "L":
			System.out.println("더 낮은수 이군요.");
			max = mid-1;
			mid = (min+max)/2;
			break;
		case "C":
			System.out.println("제가 맞았습니다.");
			return;

		}//switch off
		// case "H"
		// 최소값 = 중간값 + 1


		}//end while
	}

}