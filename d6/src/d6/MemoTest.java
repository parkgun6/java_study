package d6;

import java.util.Scanner;

public class MemoTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Memo[] box = new Memo[5];
		int idx = (int)(Math.random()* box.length);

		for (int i = 0; i < box.length; i++) {
			box[i]=idx==i?new Memo("X"):new Memo("O");
		}
		for (int i = 0; i < box.length; i++) {
			Memo m = box[i];
			if(m.showResult()) {
				System.out.println("꽝");
			}else {
				System.out.println("당첨");
			}
		}
	}
}
