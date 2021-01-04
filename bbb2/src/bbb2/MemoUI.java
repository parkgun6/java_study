package bbb2;

import java.util.Scanner;

public class MemoUI {

	private Scanner scanner;
	private MemoService service;

	public MemoUI(Scanner scanner, MemoService service) {
		super();
		this.scanner = scanner;
		this.service = service;
	}//end MemoUI

	public void playGame() {
		askPerson();
		pickMemo();
	}//end playGame

	private void askPerson() {
		System.out.println("몇명이서할거니?");
		int count = Integer.parseInt(scanner.nextLine());
		service.readyChoise(count);
	}//end askPerson

	private void pickMemo() {
		while (true) {
			System.out.println("마음의 준비가 되면 ENTER");
			scanner.nextLine();

			Memo memo = service.getNextMemo();
			String text = memo.getText();
			if (text.equals("X")) {
				System.out.println("당첨");
				break;
			} else {
				System.out.println("꽝");
			}//end if
		}//end while
	}//end pickMemo

}//end class
