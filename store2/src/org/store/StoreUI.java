package org.store;

import java.util.Scanner;

import org.common.BaseUI;

public class StoreUI extends BaseUI{
	
	
	
	public StoreUI(Scanner scanner) {
		super(scanner);
		// TODO Auto-generated constructor stub
	}
	
	public Store makeStore() {
		
		return Store.builder().scode("s2").name("강남교자").menuStr("명동칼국수").build(); 

	}
	
	@Override
	public void show() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
