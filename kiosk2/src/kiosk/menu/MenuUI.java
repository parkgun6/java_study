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
		print("1. ���θ޴�");
		print("2. ����޴�");
		print("3. ���̵�޴�");
		print("4. ��Ʈ�޴�");
		print("-----------------------");

	}
	
}
