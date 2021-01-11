package io1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class LetterCounter2{

	public static void main(String[] args) throws Exception {
		
		//알파베 26개
		Letter[] arr = new Letter[26];
		
		//a to z 
		for (int i = 97; i <= 122; i++) {
			
			arr[i -97] = new Letter((char)i);
		}
		System.out.println(Arrays.toString(arr));
		
		InputStream fin = new FileInputStream("C:\\zzz\\alice.txt");
		
		while(true) {
			
			int data = fin.read();
			if(data == -1) {break;}
			if(data >= 65 && data <=90) {
				data += 32;
			}//알파벳이라면 97~122까지만 나온다.
			if(data >=97 && data <=122) {
				arr[data-97].inc();
			}
			
		}//end while
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}//end main


}
