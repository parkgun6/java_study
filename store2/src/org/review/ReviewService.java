package org.review;

import java.util.ArrayList;
import java.util.List;

import org.store.Store;

public class ReviewService {

	public void register(Review review) {
		
	}

	public List<Review> getAllReviews(Store store) {
		// TODO Auto-generated method stub
//		return null;
		
		List<Review> reviews = new ArrayList();
		
		reviews.add(Review.builder().content("good").score(5.0).build());
		reviews.add(Review.builder().content("soso").score(2.0).build());
		reviews.add(Review.builder().content("Too expensive").score(3.0).build());
		
		return reviews;
	}

}
