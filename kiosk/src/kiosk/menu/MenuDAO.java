package kiosk.menu;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuDAO {
	File main;
	File set;
	File side;
	File drink;
	
	Scanner menuMain;
	Scanner menuSet;
	Scanner menuSide;
	Scanner menuDrink;
	 
	public ArrayList<Menu> getMainMenu() {
		
		ArrayList<Menu> menu = new ArrayList<Menu>();
		
		try {
			
			main = new File("D:\\geonstudy\\mainmenu.txt");
			menuMain = new Scanner(main, "UTF-8");
			
			while(menuMain.hasNextLine()) {
				String line = menuMain.nextLine();
				String[] arr = line.split("@");
				
				menu.add(new Menu(arr[0], Integer.parseInt(arr[1])));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menu;
	}
	
	public ArrayList<Menu> getDrinkMenu() {
		
		ArrayList<Menu> menu = new ArrayList<Menu>();
		
		try {
			
			drink = new File("D:\\geonstudy\\drinkmenu.txt");
			menuDrink = new Scanner(drink, "UTF-8");
			
			while(menuDrink.hasNextLine()) {
				String line = menuDrink.nextLine();
				String[] arr = line.split("@");
				
				menu.add(new Menu(arr[0], Integer.parseInt(arr[1])));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menu;
	}
	
	public ArrayList<Menu> getSetMenu() {
		
		ArrayList<Menu> menu = new ArrayList<Menu>();
		
		try {
			
			set = new File("D:\\geonstudy\\setmenu.txt");
			menuSet = new Scanner(set, "UTF-8");
			
			while(menuSet.hasNextLine()) {
				String line = menuSet.nextLine();
				String[] arr = line.split("@");
				
				menu.add(new Menu(arr[0], Integer.parseInt(arr[1])));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menu;
	}
	
	public ArrayList<Menu> getSideMenu() {
		
		ArrayList<Menu> menu = new ArrayList<Menu>();
		
		try {
			
			side = new File("D:\\geonstudy\\sidemenu.txt");
			menuSide = new Scanner(side, "UTF-8");
			
			while(menuSide.hasNextLine()) {
				String line = menuSide.nextLine();
				String[] arr = line.split("@");
				
				menu.add(new Menu(arr[0], Integer.parseInt(arr[1])));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menu;
	}
	

}
