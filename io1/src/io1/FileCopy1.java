package io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;//입출력은 전부 io패키지에 있다.
import java.io.OutputStream;

public class FileCopy1 {
	
	//bad code - throws Exception
	public static void main(String[] args) throws Exception{
		//읽는빨대
		InputStream in = new FileInputStream("C:\\zzz\\sample.jpg");
		
		System.out.println(in);
		
		//쓰는빨대
		OutputStream out = new FileOutputStream("c:\\zzz\\copy.jpg");
		
		//read - 1byte의 내용물을 읽어서 int 타입으로 반환한다.
		while(true) {
			
			int data = in.read();//맨 앞에있는 데이터 함수형으로 설계됨
			if(data == -1) {
				break;
			}
			out.write(data);
			
		}//end while
	}//end main
	
}
