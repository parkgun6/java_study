package io5;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ReadTest {

	// bad code
	public static void main(String[] args) throws Exception{
		
		InputStream in = new FileInputStream("C:\\zzz\\data.dat");
		ObjectInputStream oin = new ObjectInputStream(in);
		
		Object obj = oin.readObject();
		
		Message msg = (Message)obj;
		
		System.out.println(msg);
		
	}
}
