package bbb;

import java.util.Scanner;

import bbb.Memo;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MemoUI {

	private Scanner scanner;
	private MemoService service;

	public void playGame() {
		inputCount();
		pickMemo();
	}// 또라이를 방지하기 위해 인풋카운트를 하지않으면 픽메모를 못쓰게함 (private)
		// 인풋카운트를 하고나서 픽메모를 함

	private void inputCount() {
		System.out.println("몇명이서 할거냐");
		int count = Integer.parseInt(scanner.nextLine());
		System.out.println("COUNT : " + count);
		service.readyMemo(count);
	}

	private void pickMemo() {
		while (true) {
			System.out.println("마음의 준비를 하고 ENTER");
			scanner.nextLine();

			Memo memo = service.getNextMemo();
			String text = memo.getText();
			if (text.equals("X")) {
				System.out.println("당첨");
				break;
			} else {
				System.out.println("꽝");
			}
		}
	}
}
