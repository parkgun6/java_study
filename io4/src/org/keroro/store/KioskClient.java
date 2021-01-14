package org.keroro.store;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;

public class KioskClient {

	// badcode
	public static void main(String[] args) throws Exception {

		Scanner keyScanner = new Scanner(System.in);
		Map<String, Object> msgMap = new HashMap<>();
		Gson gson = new Gson();

		Menu[] menus = null;
		ArrayList<OrderItem> items = null;

		while (true) {

			System.out.println("M 메뉴보기, O 주문하기");
			String oper = keyScanner.nextLine();

			msgMap.put("oper", oper);

			if (oper.equals("O")) {
				
				if(items == null) {
					items = new ArrayList<>();
				}
				
				while(true) {
					
					System.out.println("메뉴번호를 입력하세요");
					int menuNum = Integer.parseInt(keyScanner.nextLine());
					
					System.out.println("수량 입력하세요");
					int qty = Integer.parseInt(keyScanner.nextLine());
					
					OrderItem item = new OrderItem(menus[menuNum], qty);
					
					items.add(item);
					
					System.out.println("추가할까요? ");
					String answer = keyScanner.nextLine();
					if(answer.equals("n")) {
						msgMap.put("order", items);
						break;
					}
				}
				
			}

			String msg = gson.toJson(msgMap);

			// -------------------------------------

			Socket socket = new Socket("127.0.0.1", 5555);

			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream din = new DataInputStream(socket.getInputStream());

			dos.writeUTF(msg);

			System.out.println("-----------------------");
			String line = din.readUTF();
			// System.out.println(line);

			Gson gsonResult = new Gson();

			if (oper.equals("M")) {

				menus = gsonResult.fromJson(line, Menu[].class);

				for (Menu menu : menus) {
					System.out.println(menu);
				}
			}else if(oper.equals("O")) {
				
				
			}
			dos.close();
			socket.close();
		}
	}
}
