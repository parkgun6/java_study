package kiosk;

import kiosk.menu.MenuUI;
import kiosk.order.OrderUI;
import kiosk.util.BaseUI;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MainUI extends BaseUI {

	private MenuUI menuUI;
	private OrderUI orderUI;
	
	
	public void welcome() {
		
		inputStr("�����Ͻ÷��� Enter�� �ּ���");
		
		print("���ݺ��� �޴��� �����帮�� �ֹ��� �ްڽ��ϴ�.");
		
		menuUI.showAllMenus();
		orderUI.makeOrder();
	
		
	}
}






