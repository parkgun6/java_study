package io5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class WriteTest {

	// bad code
	public static void main(String[] args) throws Exception{
		
		OutputStream out = new FileOutputStream("C:\\zzz\\data.dat");
		ObjectOutputStream oos =
				new ObjectOutputStream(out);
		
		Message obj = new Message("aaa@aaa.com", "bbb@bbb.com", "HELLo");
		
		oos.writeObject(obj);
		
		oos.close();
		out.close();
	}
}
