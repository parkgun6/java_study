package org.word.ui;

import java.util.Scanner;

import org.word.domain.Word;
import org.word.service.WordProvider;

public class WordExamUI {

	private Scanner scanner;
	
	private WordProvider provider;
	

	public void exam(int num) {
		if(num==0) {
			System.out.println("시험이 끝났습니다.\n고생하셨습니다.");
			return;
		}
		Word word = provider.getNext();
		
		System.out.println(word.getDecs());
		
		String userAnswer = scanner.nextLine();
		
		boolean correct = word.checkAnswer(userAnswer);
		
		if(correct) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.\n공부 다시 해오세요.");
			return;
		}
		exam(num-1);
		}

	public WordExamUI(Scanner scanner, WordProvider provider) {
		super();
		this.scanner = scanner;
		this.provider = provider;
	}
}
