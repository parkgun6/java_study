package kiosk;

import java.awt.Menu;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.keroro.store.Order;
import org.keroro.store.OrderItem;

import com.google.gson.Gson;

public class KioskClient {
	// bad code
	public static void main(String[] args) throws Exception {
		Scanner keyScanner = new Scanner(System.in);
		Map<String, Object> msgMap = new HashMap<>();
		Gson gson = new Gson();
		System.out.println("M메뉴보기 O 주문하기");
		String oper = keyScanner.nextLine();
		
		msgMap.put("oper", oper);
		String msg = gson
		
		//------------------------------------
	
		
		Socket socket = new Socket("127.0.0.1",5555);
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		DataInputStream din = new DataInputStream(socket.getInputStream());

		dos.writeUTF(msg);
	
		System.out.println("-----------------------");
		String line = din.readUTF();
		System.out.println(line);
		
		
		dos.close();
		socket.close();
	}
}
