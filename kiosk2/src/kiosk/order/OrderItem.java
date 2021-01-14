package kiosk.order;

import java.util.ArrayList;

import kiosk.menu.Menu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class OrderItem {

	private ArrayList<Menu> menu;
	private int qty;
	
	public int getItemPrice() {
		return menu.get(0).getPrice() * qty;
	}
	
}



