package com.bk.menu;

import java.util.List;

public class MenuService {
	
	private MenuDAO menuDAO;
	
	public List<Menu> getAllMenus()throws Exception{
		return menuDAO.getAllMenus();
	}
}
