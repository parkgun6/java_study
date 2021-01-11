package io1;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		
		String str = "Hello World My name is Alice";
		
		int idx = str.indexOf("my");
		
		System.out.println(idx);
		
		String str2 = str.substring(idx);
		
		System.out.println(str2);
		
		String origin ="abcde";
		byte[] arr = origin.getBytes();
		System.out.println(Arrays.toString(arr));
	}
}
