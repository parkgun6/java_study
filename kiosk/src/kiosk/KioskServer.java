package kiosk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class KioskServer {

	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(5555);

		System.out.println("ready........");

		while (true) {

			Socket socket = server.accept();
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

			String str = din.readUTF();
			System.out.println("고객의 문자열");
			System.out.println(str);

			Gson gsonMsg = new Gson();

			Map<String, Object> map = gsonMsg.fromJson(str, HashMap.class);
			String oper = (String) map.get("oper");

			System.out.println("OPER: + oper");

			String resultStr = "";
			if (oper.equals("M")) {
				resultStr = "메뉴목록";
			} else if (oper.equals("O")) {
				resultStr = "주문 결과";
			}
			dos.writeUTF(resultStr);
			
			
			
			dos.close();
			din.close();
			socket.close();
		} // end while
	}
}
