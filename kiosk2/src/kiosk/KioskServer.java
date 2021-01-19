package kiosk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;

import kiosk.menu.MenuService;
import kiosk.menu.MenuUI;
import kiosk.order.OrderUI;

public class KioskServer {

	// bad code
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		MenuService service = new MenuService();

		MenuUI menuUI = new MenuUI(service);
		menuUI.setScanner(scanner);

		OrderUI orderUI = new OrderUI(service);
		orderUI.setScanner(scanner);

		MainUI mainUI = new MainUI(menuUI, orderUI);
		mainUI.setScanner(scanner);

		ServerSocket server = new ServerSocket(5555);

		System.out.println("ready........");

		while (true) {

			Socket socket = server.accept();
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

			String str = din.readUTF();
			System.out.println("고객의 문자열------------------");
			System.out.println(str);

			Gson gsonMsg = new Gson();

			Map<String, Object> map = gsonMsg.fromJson(str, HashMap.class);

			String oper = (String) map.get("oper");

			System.out.println("OPER: " + oper);

			Gson gson = new Gson();
			String resultStr = "";

			if (oper.equals("M")) {
				
			}

			dos.writeUTF(resultStr);

			dos.close();
			din.close();
			socket.close();
		} // end while

	}
}
