package com.bk.order;

import java.util.List;
import java.util.Scanner;

import com.bk.common.BaseUI;
import com.bk.menu.Menu;
import com.bk.menu.MenuService;

public class OrderUI extends BaseUI {
	
	private MenuService menuService;
	private OrderService orderService;
	
	
	
	OrderUI(Scanner scanner) {
		super(scanner);
	}

	@Override
	public void show() throws Exception {
		//Order객체 생성
		
		// 메뉴 목록을 출력
		List<Menu> menus = menuService.getAllMenus();
		//메뉴 선택
		
		//해당 메뉴가 업그레이드할건지 물어본다.
		
		//수량 입력
		
		//OrderItem 객체에 추가
	}

}
