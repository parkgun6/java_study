package kiosk.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
public class MenuService {

	MenuDAO dao = new MenuDAO();

	@NonNull
	private ArrayList<Menu> menus;

	public ArrayList<Menu> getAllMenus() {

		return menus;

	}

	public ArrayList<Menu> getSelectMainMenu(int menuIndex) {
		ArrayList<Menu> basket = new ArrayList<Menu>();
		ArrayList<Menu> mainList = dao.getMainMenu();
		basket.add(mainList.get(menuIndex-1));
		return basket;
	}
	public ArrayList<Menu> getSelectDrinkMenu(int menuIndex) {
		ArrayList<Menu> basket = new ArrayList<Menu>();
		ArrayList<Menu> drinkList = dao.getDrinkMenu();
		basket.add(drinkList.get(menuIndex-1));
		return basket;
	}
	public ArrayList<Menu> getSelectSideMenu(int menuIndex) {
		ArrayList<Menu> basket = new ArrayList<Menu>();
		ArrayList<Menu> sideList = dao.getSideMenu();
		basket.add(sideList.get(menuIndex-1));
		return basket;
	}
	public ArrayList<Menu> getSelectSetMenu(int menuIndex) {
		ArrayList<Menu> basket = new ArrayList<Menu>();
		ArrayList<Menu> setList = dao.getSetMenu();
		basket.add(setList.get(menuIndex-1));
		return basket;
	}

	public ArrayList<Menu> getMainMenu() {
		ArrayList<Menu> lists = dao.getMainMenu();

		return lists;
	}

	public ArrayList<Menu> getDrinkMenu() {
		ArrayList<Menu> lists = dao.getDrinkMenu();

		return lists;
	}

	public ArrayList<Menu> getSideMenu() {
		ArrayList<Menu> lists = dao.getSideMenu();

		return lists;
	}

	public ArrayList<Menu> getSetMenu() {
		ArrayList<Menu> lists = dao.getSetMenu();

		return lists;
	}

}
