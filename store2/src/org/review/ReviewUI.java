package org.review;

import java.util.List;
import java.util.Scanner;

import org.common.BaseUI;
import org.store.Store;
import org.store.StoreService;
import org.store.StoreUI;

import lombok.Setter;

@Setter
public class ReviewUI extends BaseUI {

	private StoreService storeService;
	private ReviewService reviewService;
	private StoreUI storeUI;
	
	public ReviewUI(Scanner scanner) {
		super(scanner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() throws Exception {

		int oper = inputInt("1 : 등록\n2 : 조회");

		switch (oper) {
		case 1:
			register();
			break;
		case 2:
			view();
			break;
		case -1:
			return;
		}
		show();
	}

	private void register() {
		print("리뷰 등록");
		
		String storeName = inputStr("가게이름을 입력하세요");
		
		Store store = storeService.findByName(storeName);
		
		if(store == null) {
			store = storeUI.makeStore();
		}
		
		print(store);
		
		String content = inputStr("어떤가요?");
		double score = inputDouble("몇 점 주실래요?");
		
		Review review = Review.builder().store(store).content(content).score(score).build();
		
		reviewService.register(review);
		
		print("---------------------------");
	}

	private void view() {
		print("리뷰 조회");
		
		String menuName = inputStr("메뉴이름을 입력하세요");
		
		List<Store> stores = storeService.findByMenu(menuName);
		
		stores.forEach(store -> print(store));
		
		int idx = inputInt("몇번째 가게인가요?") -1;
		
		Store store = stores.get(idx);
		
		List<Review> reviews = reviewService.getAllReviews(store);
		
		reviews.forEach(review -> print(review));
		
	}
	
	
}
