package com.bk.menu;

import lombok.Data;

@Data
public class UpgradeMenu extends Menu{
	
	private double extra;
	private Menu nextMenu;
	
}
