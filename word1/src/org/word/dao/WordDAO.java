package org.word.dao;

import java.io.File;
import java.util.Scanner;

import org.word.domain.Word;

public class WordDAO {

	
	private Word[] words;
	private int idx;

	
	public WordDAO(){
		try {
			File file = new File("D:\\geonstudy\\test.txt");
			
			Scanner scanner = new Scanner(file,"UTF-8");
			
			words = new Word[5];
			
			for (int i = 0; i < words.length; i++) {
				
				String line = scanner.nextLine();
				
				String[] arr = line.split("@");
				
				Word word = new Word(arr[0], arr[1]);
				
				words[i] = word;	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public Word selectNext() {
		
		Word word = words[idx++];
		
		return word;
	}
}
