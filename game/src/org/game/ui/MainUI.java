package org.game.ui;

import java.util.Map;
import java.util.Scanner;

public class MainUI extends BaseUI{

	private Map<String,BaseUI> uiMap;

	public MainUI(Scanner scanner, Map<String, BaseUI> uiMap) {
		super(scanner);
		this.uiMap = uiMap;
	}
	
	public void onPower() {
		String oper = inputStr("어떤게임을하시겠어요?");
		
		BaseUI ui = uiMap.get(oper);
		
		ui.playGame();
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		
	}
	
	
}
