package kiosk.menu;

import java.util.ArrayList;

import kiosk.util.BaseUI;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MenuUI extends BaseUI {
	
	private MenuService service;
	
	public void showAllMenus() {
		
		print("-----------------------");
		print("---------MENUS---------");
		print("-----------------------");
		print("1. 메인메뉴");
		print("2. 음료메뉴");
		print("3. 사이드메뉴");
		print("4. 세트메뉴");
		print("-----------------------");

	}
	
}
