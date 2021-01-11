package io1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class KeyMemo {
	//bad code 예외처리때문에 이렇게쓰면 쫒겨난다
	public static void main(String[] args) throws Exception{
		
		InputStream in = System.in;
		
		OutputStream out = new FileOutputStream("C:\\zzz\\text.txt");
	
		String str = "가나다라";
		
		byte[] arr = str.getBytes("UTF-8");
	
		System.out.println(arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			int data = arr[i];
			
			out.write(data);
		}
	}
}
