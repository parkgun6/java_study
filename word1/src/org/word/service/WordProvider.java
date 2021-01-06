package org.word.service;

import org.word.dao.WordDAO;
import org.word.domain.Word;

public class WordProvider {

	
	private WordDAO dao;
	
	public Word getNext() {
		
		Word word = dao.selectNext();
		
		return word;		
	}

	public WordProvider(WordDAO dao) {
		super();
		this.dao = dao;
	}
}
