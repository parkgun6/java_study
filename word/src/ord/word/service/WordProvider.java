package ord.word.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
//import lombok.AllArgsConstructor;
import ord.word.dao.WordDAO;
import ord.word.domain.Word;
//생성자를 자동으로 생성
@RequiredArgsConstructor
//@AllArgsConstructor 모든 생성자를 생성
public class WordProvider {
	
//	@NonNull//얘만 파라미터에 넣는다.
//	private Word[] words;//DAO가 이녀석을 다룬다.
////	private String name; Allarg 롬복을 쓰면 쓸모없는 얘도 파라미터에 포함된다.

	
	@NonNull
	private WordDAO dao;
	
	public Word getNext() {
		
		Word word = dao.selectNext();
		
		return word;
	}
//	
//	public Word getNext() {
//		
//		if(words.length==0) {
//			return null;
//		}
//		
//		Word result = words[0];
//		Word[] temp = new Word[words.length-1];
//		System.arraycopy(words, 1, temp, 0, temp.length);
//		words=temp;
//		return result;
//	}

//	public WordProvider(Word[] words) {
//		super();
//		this.words = words;
//	}
	
	
}
