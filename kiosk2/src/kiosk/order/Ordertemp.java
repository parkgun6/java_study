package kiosk.order;

import java.util.ArrayList;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Ordertemp {

	private static int COUNT = 0;
	
	private int orderNum;
	private ArrayList<OrderItem> items;
	
	public Ordertemp(ArrayList<OrderItem> items) {
		this.orderNum = ++COUNT;
		this.items = items;
	}
	
	public int getTotal() {
		
		int total = 0;
		
		for (OrderItem orderItem : items) {
			total += orderItem.getItemPrice();
		}
		return total;
	}
	
}
