package com.bk.order;

import com.bk.menu.Menu;

import lombok.Data;

@Data
public class OrderItem {

	private Menu menu;
	private int qty;
}
