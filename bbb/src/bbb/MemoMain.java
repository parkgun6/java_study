package bbb;

import java.util.Scanner;

public class MemoMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		MemoService service = new MemoService();
		MemoUI ui = new MemoUI(scanner, service);

		ui.playGame();// input과 pick이 안보임 프라이빗으로 처리했기때문

	}
}
