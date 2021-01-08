package kiosk;

import java.util.Scanner;

import kiosk.menu.Menu;
import kiosk.menu.MenuService;
import kiosk.menu.MenuUI;
import kiosk.order.OrderUI;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Menu[] arr = new Menu[5];
		arr[0] = new Menu("와퍼",5900);
		arr[1] = new Menu("불고기와퍼",4900);
		arr[2] = new Menu("치즈쿼트로",7900);
		arr[3] = new Menu("감자",1800);
		arr[4] = new Menu("콜라",1800);
		
		MenuService service = new MenuService(arr);
		
		MenuUI menuUI  = new MenuUI(service);
		menuUI.setScanner(scanner);
		
		OrderUI orderUI = new OrderUI(service);
		orderUI.setScanner(scanner);
		
		MainUI mainUI = new MainUI(menuUI, orderUI);
		mainUI.setScanner(scanner);
		
		mainUI.welcome();
		
		
	}
}






