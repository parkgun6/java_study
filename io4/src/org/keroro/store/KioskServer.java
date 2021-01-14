package org.keroro.store;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.reflect.Type;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class KioskServer {

	//bad code
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(5555);
		
		System.out.println("ready........");
		
		while(true) {
			
			Socket socket = server.accept();
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			String str = din.readUTF();
			System.out.println("고객의 문자열------------------");
			System.out.println(str);
			
			JsonObject jsonObj = JsonParser.parseString(str).getAsJsonObject();
			
			String oper = jsonObj.get("oper").getAsString();
			
			
			String resultStr = "";
			
			if(oper.equals("M")) {
				
				Gson gson = new Gson();
				List<Menu> menuList = new ArrayList<>();
				menuList.add(new Menu("0빅맥",5000));
				menuList.add(new Menu("1빅맥",1000));
				menuList.add(new Menu("2빅맥",4000));
				menuList.add(new Menu("3빅맥",5000));
				
				resultStr = gson.toJson(menuList);
				
				
				
			}else if(oper.equals("O")) {
				
				JsonArray jsonArray = jsonObj.get("order").getAsJsonArray();
				
				Type listType = new TypeToken<List<OrderItem>>() {}.getType();

				List<OrderItem> orderItems = new Gson().fromJson(jsonArray, listType);
				
				System.out.println(orderItems);
				
				System.out.println("===================================");
				orderItems.forEach(item -> System.out.println(item));
				System.out.println("-----------------------------------");
				
				resultStr = "주문 결과";
			}
			
			dos.writeUTF(resultStr);
			
			dos.close();
			din.close();
			socket.close();
		}//end while
		
	}
}
