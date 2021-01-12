package io2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		//가게문열기
		ServerSocket server = new ServerSocket(5555);
		
		System.out.println(server);
		//손님열번받기
		for (int i = 0; i < 10; i++) {
			//손님한명당 직원한명 소켓은 직원
			Socket socket = server.accept();
			System.out.println(socket);
			
			InputStream in = socket.getInputStream();
			Scanner scanner = new Scanner(in);
			String str = scanner.nextLine()+ "\n";
			
			OutputStream out = socket.getOutputStream();
			out.write(str.getBytes());
			
			System.out.println("-----------------");
			
			scanner.close();
			in.close();
			socket.close();
			out.close();
			
			
			
		}//end for
	}//end main
}
