package ord.word.dao;

import java.io.File;
import java.util.Scanner;

import ord.word.domain.Word;

public class WordDAO {

	// 문제들(Word객체들)
	private Word[] words;
	private int idx;
	
	public WordDAO() {
		// 파일과 연결된 스캐너를 생성
		try {
			File file = new File("C:\\zzz\\test.txt");
			Scanner scanner = new Scanner(file, "UTF-8");
			words = new Word[5];
			// 라인을 5번 읽는다
			for (int i = 0; i < words.length; i++) {

				// 한 라인은 @로 분리하여 문자열의 배열로 만든다
				String line = scanner.nextLine();
				String[] arr = line.split("@");

				// 배열을 이용하여 Word객체를 생성
				Word word = new Word(arr[0], arr[1]);

				// 생성한 Word 객체를 배열에 보관
				words[i] = word;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Word selectNext() {

		// 배열에서 다음 Word객체를 반환.
		Word word = words[idx++];

		return word;
	}

}
