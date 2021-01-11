package io1;

public class StringTest {

	public static void main(String[] args) {

		String str = "ABCDEFG";

		// substr
		// 지정된 위치부터 끝까지
		String result1 = str.substring(3);
		System.out.println(result1);
		//지정된 위치부터 특정위치 전까지
		String result2 = str.substring(1,4);
		System.out.println(result2);
	}
}
