package io3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class SimpleServer {

	public static void main(String[] args) {
		
		try(ServerSocket server = new ServerSocket(8080)){
			
			System.out.println("ready.....................");
			
			for (int i = 0; i < 10; i++) {
				
			} {
				try(Socket socket = server.accept();
					InputStream sin = socket.getInputStream();
					Scanner socketScanner = new Scanner(sin);
					OutputStream sout = socket.getOutputStream();
					) {
					System.out.println("a client connected...............");
					//많은 코드가 들어감.
					String cmd = socketScanner.nextLine();
					System.out.println("확인용: "+cmd);
					
					sout.write((cmd+"\n").getBytes());
					sout.flush();
					
					}catch(Exception e) {
						System.out.println("문제발생");
					}
				
			}//end while
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
