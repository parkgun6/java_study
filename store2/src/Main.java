import java.util.Scanner;

import org.review.ReviewService;
import org.review.ReviewUI;
import org.store.StoreService;
import org.store.StoreUI;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner keyScanner = new Scanner(System.in);
		
		StoreService storeService = new StoreService();
		ReviewService reviewService = new ReviewService();
		
		StoreUI storeUI = new StoreUI(keyScanner);
		ReviewUI reviewUI = new ReviewUI(keyScanner);
		reviewUI.setReviewService(reviewService);
		reviewUI.setStoreService(storeService);
		reviewUI.setStoreUI(storeUI);
		
		reviewUI.show();
	}
}
