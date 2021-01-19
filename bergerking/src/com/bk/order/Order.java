package com.bk.order;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Order {

	private int ordNum;
	
	private List<OrderItem> items;
	
	public void addItem(OrderItem item) {
		if(items == null) {
			items = new ArrayList<>();
		}
		items.add(item);
	}
}
