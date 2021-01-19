package org.store;

import java.util.ArrayList;
import java.util.List;

public class StoreService {

	public Store findByName(String storeName) {
//		return Store.builder().scode("s1").name("멘야시노기").menuStr("라멘").build();
		return null;
	}

	public List<Store> findByMenu(String menuName) {
		
//		return null;
		
		List<Store> stores = new ArrayList<>();
		stores.add(Store.builder().scode("s3").name("아빠곰돈까스").menuStr("라멘").build());
		stores.add(Store.builder().scode("s4").name("사보텐").menuStr("라멘").build());
		return stores;
		
	}

}
