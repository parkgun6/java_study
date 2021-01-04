package bbb2;

import java.util.Scanner;

public class MemoMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	MemoService service = new MemoService();
	MemoUI ui = new MemoUI(scanner, service);
	ui.playGame();
	//이곳에 readyChoise와 pickMemo는 띄울수 없다 private이기 때문.
}
}
