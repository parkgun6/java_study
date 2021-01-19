package kiosk;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;

import kiosk.menu.Menu;
import kiosk.menu.MenuService;
import kiosk.menu.MenuUI;
import kiosk.order.OrderItem;
import kiosk.order.OrderUI;

public class KioskClient {

	// badcode
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		MenuService service = new MenuService();
		
		MenuUI menuUI  = new MenuUI(service);
		menuUI.setScanner(scanner);
		
		OrderUI orderUI = new OrderUI(service);
		orderUI.setScanner(scanner);
		
		MainUI mainUI = new MainUI(menuUI, orderUI);
		mainUI.setScanner(scanner);
		
		
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
				
				orderUI.makeOrder();
				
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
				mainUI.welcome();
			}else if(oper.equals("O")) {
				orderUI.makeOrder();
				
			}
			dos.close();
			socket.close();
		}
	}
}


