package d5;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {

		int[] balls = new int[6];

		// p1 1부터 45의 숫자를 6번뽑는다
		for (int i = 0; i < balls.length; i++) {

			int num = (int) ((Math.random() * 45) + 1);
			// 중복체크
			boolean duplicated = Ex1.contains(balls, num);

			if (duplicated) {
				System.out.println("중복 발생" + Arrays.toString(balls) + " : " + num);
				i--;
				continue;
			}
			balls[i] = num;
			// 결과배열에 해당 value가 있는지 체크
			System.out.println("--------------------");
			// 없으면 결과 배열에 담는다.
			System.out.println(Arrays.toString(balls));
			// 있다면 다시 뽑는다.

		}

	}
}