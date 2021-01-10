package kiosk.order;

import java.util.ArrayList;

import kiosk.menu.Menu;
import kiosk.menu.MenuService;
import kiosk.menu.MenuUI;
import kiosk.util.BaseUI;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderUI extends BaseUI {

	@NonNull
	private MenuService service;

	private MenuUI menuUI;

	int menuIndex;

	int inputNum;

	int orderNum;

	ArrayList<OrderItem> items;

	ArrayList<Menu> menu;

	public void makeOrder() {
		items = new ArrayList<>();
		menu = new ArrayList<Menu>();
		menuUI = new MenuUI(service);
		while (true) {
			inputNum = inputInt("");
			orderNum = choiceCategoryMenu(inputNum);
			print("�ֹ��� �ްڽ��ϴ�.");

			// �޴���ȣ�� �Է� �޴´�.
			menuIndex = inputInt("�޴� ��ȣ�� �Է��ϼ���");
			// �ش� �޴��� �����´�.
			if (orderNum == 1) {
				menu = service.getSelectMainMenu(menuIndex);
			} else if (orderNum == 2) {
				menu = service.getSelectDrinkMenu(menuIndex);
			} else if (orderNum == 3) {
				menu = service.getSelectSideMenu(menuIndex);
			} else if (orderNum == 4) {
				menu = service.getSelectSetMenu(menuIndex);
			}
			// �޴��� ���� �Է� �޴´�.
			int qty = inputInt("�ֹ��� ������ �Է����ּ���");

			// OrderItem ��ü�� ����
			OrderItem orderItem = new OrderItem(menu, qty);

			// items�� �߰�
			items.add(orderItem);

			// �ֹ��� �߰��Ұ���
			String answer = inputStr("�����ϱ�� n ��ǰ�� �ٽ� �����Ϸ��� y");
			if (answer.equals("n")) {
				break;
			}else if(answer.equals("y")) {
				menuUI.showAllMenus();
			}

		} // end while

		// Order�� ����
		Ordertemp order = new Ordertemp(items);

		// Order�� ���
		
		
		int total = order.getTotal();
		while(true) {
            System.out.println("�� �ݾ� " + total + "�� �Դϴ�.");
            System.out.println("���� ���� ���� : 1\n���� ���� ���� : 2");
            String payChoice = inputStr("");
            switch(payChoice) {
            case"1":
            	System.out.println("�������� �Է��ϼ���.");
            	String couponName = inputStr("");
            	if(couponName.equals("burger"))
            		total = 0;
            	break;
            case"2":
            System.out.print("���� �� �Ա��Ͻðڽ��ϱ�? : ");
            int money = inputInt("");

            if(money < total) {
                System.out.println("���� ���ڶ��ϴ�.");
                continue;
            } else {
                System.out.println("�Ž�����" + (money - total) + "�� �Դϴ�.");
                break;
            }
            }break;
        }
            
        
	        
		print("--------------������---------------");
		print("OREDR NUM: " + order.getOrderNum());
		print("----------------------------------");
		for (OrderItem orderItem : items) {
			print(orderItem.getMenu().get(0).getName() + "   ���� : " + orderItem.getQty() + " ���� : " + orderItem.getItemPrice()+"��");
		}
		

		   
	    print("=================================");
		print("TOTAL: " + total);
		print("========������ �Ϸ�Ǿ����ϴ�.========");
	}

	public int choiceCategoryMenu(int number) {

		if (number == 1) {
			ArrayList<Menu> mainList = service.getMainMenu();

			for (int i = 0; i < mainList.size(); i++) {
				System.out
						.println((i + 1) + " : " + mainList.get(i).getName() + "," + mainList.get(i).getPrice() + "��");
			}
		} else if (number == 2) {
			ArrayList<Menu> drinkList = service.getDrinkMenu();

			for (int i = 0; i < drinkList.size(); i++) {
				System.out.println(
						(i + 1) + " : " + drinkList.get(i).getName() + "," + drinkList.get(i).getPrice() + "��");
			}

		} else if (number == 3) {
			ArrayList<Menu> sideList = service.getSideMenu();

			for (int i = 0; i < sideList.size(); i++) {
				System.out
						.println((i + 1) + " : " + sideList.get(i).getName() + "," + sideList.get(i).getPrice() + "��");
			}

		} else if (number == 4) {
			ArrayList<Menu> setList = service.getSetMenu();

			for (int i = 0; i < setList.size(); i++) {
				System.out.println((i + 1) + " : " + setList.get(i).getName() + "," + setList.get(i).getPrice() + "��");
			}
		}

		return number;
	}
}
