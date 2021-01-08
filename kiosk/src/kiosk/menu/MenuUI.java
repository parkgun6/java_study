package kiosk.menu;

import kiosk.util.BaseUI;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MenuUI extends BaseUI {
	
	private MenuService service;

	public void showAllMenus() {
		
		print("-----------------------");
		print("----------MENUS--------");
		print("-----------------------");
		
		Menu[] arr = service.getAllMenus();
		
		for (int i =0; i < arr.length; i++) {
			Menu menu = arr[i];
			print(i+": " +menu.getName()+": " + menu.getPrice());
		}
		print("-----------------------");
	}

}
