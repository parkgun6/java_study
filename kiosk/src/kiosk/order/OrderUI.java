package kiosk.order;

import java.util.ArrayList;

import kiosk.menu.Menu;
import kiosk.menu.MenuService;
import kiosk.util.BaseUI;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderUI extends BaseUI{
	
	private MenuService service;

	public void makeOrder() {
		
		print("�ֹ��� �ްڽ��ϴ�.");
		
		ArrayList<OrderItem> items = new ArrayList<>();
		
		while(true) {
			//�޴���ȣ�� �Է� �޴´�. 
			int menuIndex = inputInt("�޴� ��ȣ�� �Է��ϼ���");
			//�ش� �޴��� �����´�. 
			Menu menu = service.getMenu(menuIndex);
			//�޴��� ������ �Է� �޴´�. 
			int qty = inputInt("1�̻� �Է��ϼ���");
			
			//OrderItem ��ü�� ���� 
			OrderItem orderItem = new OrderItem(menu, qty);
			//items�� �߰� 
			items.add(orderItem);
			
			//�ֹ��� �߰��Ұ��� 
			String answer =  inputStr("�׸� �Ͻ÷��� n");
			if(answer.equals("n")) {
				break;
			}
			
		}//end while

		
		//Order�� ���� 
		Order order = new Order(items);
		
		//Order�� ��� 
		print("OREDR NUM: " + order.getOrderNum());
		
		print("--------------------------------");
		for (OrderItem orderItem : items) {
			print(orderItem.getMenu().getName()+"   " +orderItem.getQty() + " " + orderItem.getItemPrice());
		
		
		}
		print("=================================");
		print("TOTAL: " +order.getTotal());
		
		
	}

}
