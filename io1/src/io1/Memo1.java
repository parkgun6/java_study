package io1;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Memo1 {
	// bad code
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		//파일생성위치 true로 뒤에붙여서 저장
		OutputStream fos = new FileOutputStream("C:\\zzz\\diary.txt",true);
		
			//키보드에서 문자입력
		while(true) {
			System.out.println("입력하세요");
			String str = scanner.nextLine() + "\n";
			//운영체제에 안깔려있을수도있어서 유니코드로 인코딩
			byte[] arr = str.getBytes("UTF-8");
			
			for (int j = 0; j < arr.length; j++) {
				fos.write(arr[j]);
			
		}
		 // end for

	}// end main

}
}