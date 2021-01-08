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
		arr[0] = new Menu("����",5900);
		arr[1] = new Menu("�Ұ�����",4900);
		arr[2] = new Menu("ġ����Ʈ��",7900);
		arr[3] = new Menu("����",1800);
		arr[4] = new Menu("�ݶ�",1800);
		
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






