package io2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy2 {
	//bad code
	public static void main(String[] args) throws Exception{
		
		InputStream fin = new FileInputStream("C:\\zzz\\sample.jpg");
		OutputStream fos = new FileOutputStream("C:\\zzz\\copy2.jpg");
		
		long start = System.currentTimeMillis();
		
		byte[] buffer = new byte[1024*8];
		
		while(true) {
			
			int count = fin.read(buffer);
			if(count == -1) {break;}
			fos.write(buffer,0,count);
		}
		long end = System.currentTimeMillis();
		
		long time = end - start;
		System.out.println(time);
		
	}
}
