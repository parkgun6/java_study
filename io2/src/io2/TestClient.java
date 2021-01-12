package io2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {
	
	//bad code
	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("127.0.0.1", 5555);
		System.out.println(socket);
		
		String msg = "Hello World\n";
		
		OutputStream out = socket.getOutputStream();
		InputStream in = socket.getInputStream();
		
		Scanner scanner = new Scanner(in);
		
		byte[] arr = msg.getBytes();
		
		out.write(arr);
		//메세지를 받는과정
		String serverMsg = scanner.nextLine();
		System.out.println(serverMsg);
		scanner.close();
		in.close();
		out.close();
		socket.close();
		
	}
}
