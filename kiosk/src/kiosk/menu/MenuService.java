package kiosk.menu;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MenuService {

	@NonNull
	private Menu[] menus;
	
	public Menu[] getAllMenus() {
		
		return menus;
		
	}

	public Menu getMenu(int menuIndex) {
		return menus[menuIndex];
	}
}


