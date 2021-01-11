package io1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		
		List<Letter> list = new ArrayList<>();
		
		for (int i = 97; i < 122; i++) {
			list.add(new Letter((char)i));
			
		}//end for
		System.out.println(list);
		Letter target = new Letter('t');
		
		int index = list.indexOf(target);
		System.out.println(index);
		//System.out.println(list.contains(new Letter('t')));
	}//end main
}
