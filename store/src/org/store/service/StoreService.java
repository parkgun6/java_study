package org.store.service;

import java.util.Arrays;

import org.store.domain.Store;

public class StoreService {

	private Store[] stores;
	
	public Store[] findNearStores(double currentLat,double currentLng) {
		
		Store[] result = new Store[3];
		
		Arrays.sort(stores, (s1,s2) -> {
			
			double d1 = s1.calcDistance(currentLat, currentLng);
			double d2 = s2.calcDistance(currentLat, currentLng);
			
			return d1>d2? 1: -1;
		});
		System.arraycopy(stores, 0, result, 0, 3);
		return result;
	}

	public StoreService(Store[] stores) {
		super();
		this.stores = stores;
	}

	public Store[] getStores() {
		return stores;
	}
	
}
