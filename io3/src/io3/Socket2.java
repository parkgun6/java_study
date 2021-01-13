package io3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Socket2 {

	public static void main(String[] args) {
		Map<String, String> ipMap = new HashMap<>();
		ipMap.put("192.168.0.101","192,168.0.108");

		String ip = ipMap.get(ipMap);
		String cmd;

		try (ServerSocket server = new ServerSocket(8081)) {
			System.out.println("ready..............");
			try (Socket socket = server.accept();
					Socket push = new Socket("192.168.0.101",8080);
				InputStream in = socket.getInputStream();
				Scanner inScanner = new Scanner(in);
				OutputStream out = push.getOutputStream();) {
				
				cmd = inScanner.nextLine();
				
				out.write((cmd + "\n").getBytes());
				out.flush();

				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("-----------");
			} // end catch

		} catch (Exception e) {
			e.printStackTrace();				
			System.out.println("-----------");

		}

	}

}
