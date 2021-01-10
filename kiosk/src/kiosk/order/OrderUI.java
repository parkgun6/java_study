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
			print("주문을 받겠습니다.");

			// 메뉴번호를 입력 받는다.
			menuIndex = inputInt("메뉴 번호를 입력하세요");
			// 해당 메뉴를 가져온다.
			if (orderNum == 1) {
				menu = service.getSelectMainMenu(menuIndex);
			} else if (orderNum == 2) {
				menu = service.getSelectDrinkMenu(menuIndex);
			} else if (orderNum == 3) {
				menu = service.getSelectSideMenu(menuIndex);
			} else if (orderNum == 4) {
				menu = service.getSelectSetMenu(menuIndex);
			}
			// 메뉴의 수량 입력 받는다.
			int qty = inputInt("주문할 수량을 입력해주세요");

			// OrderItem 객체를 생성
			OrderItem orderItem = new OrderItem(menu, qty);

			// items에 추가
			items.add(orderItem);

			// 주문을 추가할건지
			String answer = inputStr("결제하기는 n 상품을 다시 구입하려면 y");
			if (answer.equals("n")) {
				break;
			}else if(answer.equals("y")) {
				menuUI.showAllMenus();
			}

		} // end while

		// Order를 생성
		Ordertemp order = new Ordertemp(items);

		// Order를 출력
		
		
		int total = order.getTotal();
		while(true) {
            System.out.println("총 금액 " + total + "원 입니다.");
            System.out.println("전액 쿠폰 결제 : 1\n전액 현금 결제 : 2");
            String payChoice = inputStr("");
            switch(payChoice) {
            case"1":
            	System.out.println("쿠폰명을 입력하세요.");
            	String couponName = inputStr("");
            	if(couponName.equals("burger"))
            		total = 0;
            	break;
            case"2":
            System.out.print("현금 얼마 입금하시겠습니까? : ");
            int money = inputInt("");

            if(money < total) {
                System.out.println("돈이 모자랍니다.");
                continue;
            } else {
                System.out.println("거스름돈" + (money - total) + "원 입니다.");
                break;
            }
            }break;
        }
            
        
	        
		print("--------------영수증---------------");
		print("OREDR NUM: " + order.getOrderNum());
		print("----------------------------------");
		for (OrderItem orderItem : items) {
			print(orderItem.getMenu().get(0).getName() + "   수량 : " + orderItem.getQty() + " 가격 : " + orderItem.getItemPrice()+"원");
		}
		

		   
	    print("=================================");
		print("TOTAL: " + total);
		print("========결제가 완료되었습니다.========");
	}

	public int choiceCategoryMenu(int number) {

		if (number == 1) {
			ArrayList<Menu> mainList = service.getMainMenu();

			for (int i = 0; i < mainList.size(); i++) {
				System.out
						.println((i + 1) + " : " + mainList.get(i).getName() + "," + mainList.get(i).getPrice() + "원");
			}
		} else if (number == 2) {
			ArrayList<Menu> drinkList = service.getDrinkMenu();

			for (int i = 0; i < drinkList.size(); i++) {
				System.out.println(
						(i + 1) + " : " + drinkList.get(i).getName() + "," + drinkList.get(i).getPrice() + "원");
			}

		} else if (number == 3) {
			ArrayList<Menu> sideList = service.getSideMenu();

			for (int i = 0; i < sideList.size(); i++) {
				System.out
						.println((i + 1) + " : " + sideList.get(i).getName() + "," + sideList.get(i).getPrice() + "원");
			}

		} else if (number == 4) {
			ArrayList<Menu> setList = service.getSetMenu();

			for (int i = 0; i < setList.size(); i++) {
				System.out.println((i + 1) + " : " + setList.get(i).getName() + "," + setList.get(i).getPrice() + "원");
			}
		}

		return number;
	}
}
