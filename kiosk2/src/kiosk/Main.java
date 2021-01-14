  
package kiosk;

import java.util.Scanner;

import kiosk.menu.Menu;
import kiosk.menu.MenuService;
import kiosk.menu.MenuUI;
import kiosk.order.OrderUI;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		MenuService service = new MenuService();
		
		MenuUI menuUI  = new MenuUI(service);
		menuUI.setScanner(scanner);
		
		OrderUI orderUI = new OrderUI(service);
		orderUI.setScanner(scanner);
		
		MainUI mainUI = new MainUI(menuUI, orderUI);
		mainUI.setScanner(scanner);
		
		mainUI.welcome();
		
		
	}
}
