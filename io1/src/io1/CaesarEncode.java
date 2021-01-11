package io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CaesarEncode {
	
	public static void main(String[] args) throws Exception {
	
		InputStream fin = new FileInputStream("C:\\zzz\\caesar.txt");
		OutputStream fos = new FileOutputStream("C:\\zzz\\caesardecode.txt");
		
		
		while(true) {
			
			int data = fin.read();
			
			if(data == -1) {break;}
			//대문자 -> 소문자
			if(data >= 65 && data <=90) {
				data += 32;
			}//시저암호는 a>d로 3칸만 이동한다.
			if(data >=97 && data <=122) {
				data += 3;
				if(data>=123) {
					data -=26;//xyz가 지나면 다시 abc로 돌아감.
				}
			}
			System.out.println(data);
			fos.write(data);
		}//end while
		
	}//end main
}
