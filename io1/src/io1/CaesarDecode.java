package io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CaesarDecode {
	public static void main(String[] args) throws Exception {
		InputStream fin = new FileInputStream("C:\\zzz\\caesardecode.txt");
		OutputStream fos = new FileOutputStream("C:\\zzz\\caesar.txt");
		
		
		while(true) {
			
			int data = fin.read();
			
			if(data == -1) {break;}
			//대문자 -> 소문자
			if(data >= 65 && data <=90) {
				data += 32;
			}//시저암호는 a>d로 3칸만 이동한다.
			if(data >=97 && data <=122) {
				data -= 3;
				if(data <= 98) {
					data+=26;
				}
				}System.out.println(data);
			fos.write(data);
			}
			
			
		}//end while
		
	}//end main

