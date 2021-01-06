package org.store.ui;

import java.util.Scanner;

import org.store.domain.Store;
import org.store.service.StoreService;

public class StoreUI {

	private Scanner scanner;

	private StoreService service;

	public void find() {
		System.out.println("위도?");
		double lat = 37.503888;//Double.parseDouble(scanner.nextLine());
		System.out.println("경도?");
		double lng = 127.020795;//Double.parseDouble(scanner.nextLine());
		
		Store[] result = service.findNearStores(lat, lng);
		
		//foreach구문
		for (Store store : result) {
			System.out.println(store);
		}
	}

	public StoreUI(Scanner scanner, StoreService service) {
		super();
		this.scanner = scanner;
		this.service = service;
	}
}
