package ord.word.ui;

import java.util.Scanner;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import ord.word.domain.Word;
import ord.word.service.WordProvider;
@RequiredArgsConstructor
public class WordExamUI {
	@NonNull
	private Scanner scanner;
	@NonNull
	private WordProvider provider;

	public void exam() {
		System.out.println("문제를 풀려면 ENTER");
		scanner.nextLine();
		Word word = provider.getNext();
		if(word==null) {
			return;//함수를 끝낼때 사용
		}
		System.out.println(word.getDesc());
		String userAnswer = scanner.nextLine();
		boolean correct = word.checkAnswer(userAnswer);
		if(correct=true) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
			return;
		}
		exam();//재귀함수
	}

	
	
//	public WordExamUI(@NonNull Scanner scanner, @NonNull WordProvider provider) {
//		super();
//		this.scanner = scanner;
//		this.provider = provider;
//	}
}
