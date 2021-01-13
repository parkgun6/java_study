package io3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {

	public static void main(String[] args) {
		
		try(ServerSocket server = new ServerSocket(8080)){
			
			System.out.println("ready................");
			
			while(true) {
				try(Socket socket = server.accept();
					InputStream sin = socket.getInputStream();
					Scanner socketScanner = new Scanner(sin);	
					OutputStream sout = socket.getOutputStream();	
					) {
					
					System.out.println("a client connected....");
					String cmd = socketScanner.nextLine();
					System.out.println("확인: " + cmd);
					
					sout.write( (cmd+"\n").getBytes());
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







