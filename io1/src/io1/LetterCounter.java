package io1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class LetterCounter {

	// bad code
	public static void main(String[] args) throws Exception {
		
		//알파벳이 몇번 나오는지의 배열 0,0,0..... 97~122
		
		int[] arr = new int[26];
		
		InputStream fin = new FileInputStream("C:\\zzz\\alice.txt");
		
		while(true) {
			
			int data = fin.read();
			
			if(data == -1) {break;}
			//대문자 -> 소문자
			if(data >= 65 && data <=90) {
				data += 32;
			}//알파벳이라면 97~122까지만 나온다.
			if(data >=97 && data <=122) {
				arr[data-97] = arr[data-97] +1;
			}
			
			System.out.println(data);
		}//end while
		System.out.println(Arrays.toString(arr));
	}//end main
}
