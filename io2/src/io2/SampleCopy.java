package io2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class SampleCopy {

	//bad code
	public static void main(String[] args) throws Exception{

		InputStream fin = new FileInputStream("C:\\zzz\\target.txt");
		OutputStream fos = new FileOutputStream("C:\\zzz\\copy.txt");
		
		byte[] buffer = new byte[5];
		
		while(true) {
			
			int count = fin.read(buffer);
			
			if(count == -1) {break;}
			
			System.out.println(count);
			
			fos.write(buffer,0,count);
			
		}//end while
		fin.close();
		fos.close();
	}
}
