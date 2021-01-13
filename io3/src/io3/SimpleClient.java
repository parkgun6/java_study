package io3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) {
		
		Map<String, String> ipMap = new HashMap<>();
		ipMap.put("gun", "192.168.0.101");
		ipMap.put("hyun", "192.168.0.91");
		ipMap.put("i", "127.0.0.1");
		
		Scanner keyScanner = new Scanner(System.in);
		System.out.println("어디로 메시지를 전송하실겁니까?");
		
		String ip = ipMap.get(keyScanner.nextLine());
		
		System.out.println("보내고 싶은 메시지를 입력하세요");
		String cmd = keyScanner.nextLine();
		
		try(Socket socket = new Socket(ip,8080);
			InputStream in = socket.getInputStream();
			Scanner inScanner = new Scanner(in);
			OutputStream out = socket.getOutputStream();
			){
			//보내는게 우선/받는게 나중
			out.write( (cmd+"\n").getBytes());
			out.flush();
			
			String serverMsg = inScanner.nextLine();
			System.out.println("-----------------");
			System.out.println(serverMsg);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}//end catch
	}
}




